/**
 * 
 */
package it.univaq.mancoosi.simulator.controller.managers;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;

import it.univaq.mancoosi.mancoosimm.ConfigFilesPackage;
import it.univaq.mancoosi.mancoosimm.Group;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredPackage;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.Package;
import it.univaq.mancoosi.mancoosimm.AndConflict;
import it.univaq.mancoosi.mancoosimm.AndDep;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Conflict;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.NotInstalledPackage;
import it.univaq.mancoosi.mancoosimm.OrConflict;
import it.univaq.mancoosi.mancoosimm.OrDep;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.SingleConflict;
import it.univaq.mancoosi.mancoosimm.SingleDep;
import it.univaq.mancoosi.mancoosimm.UnpackedPackage;
import it.univaq.mancoosi.mancoosimm.User;
import it.univaq.mancoosi.mancoosimm.VersionType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import it.univaq.mancoosi.simulator.entity.DepConfl;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.CurrentModelsFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;


public class SystemModelManager {


	private Configuration configuration = null;
	private SimulatorConfig config;
	
	/**
	 * Constructor
	 * 
	 * @throws SimulatorException
	 */
	public SystemModelManager() throws Exception {
		config = SimulatorConfig.getInstance();
		loadModel();
	}

	/**
	 * @throws SimulatorException 
	 * 
	 */
	private void loadModel() throws SimulatorException {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("mancoosimm", new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put("mancoosimm",
				MancoosiPackage.eINSTANCE);

		java.io.File file =  CurrentModelsFile.getInstance().getSystemModelCurrent();

		URI uri = URI.createFileURI(file.getAbsolutePath());

		Resource resource = resourceSet.getResource(uri, true);

		configuration = (Configuration) resource.getContents().get(0);
	}

	
	/**
	 * 
	 * @throws SimulatorException
	 */
	public void saveModel() throws Exception {
		try {
			String inputSystemModel = config.getFileInputSystemModel();

			String nameFileModel = inputSystemModel.substring(inputSystemModel
					.lastIndexOf(java.io.File.separator) + 1, inputSystemModel.length());

			java.io.File newTempFile = FileManagement.createTempFile(nameFileModel
					.substring(0, nameFileModel.lastIndexOf(".")),
					nameFileModel.substring(nameFileModel.lastIndexOf(".") + 1,
							nameFileModel.length()));
			
			CurrentModelsFile.getInstance().setSystemModelCurrent(newTempFile);

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("mancoosimm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(newTempFile.getAbsolutePath());

			Resource poResource = resourceSet.createResource(fileURI);
			
			configuration.setCreationTime((new GregorianCalendar()).getTime().toString());
			
			poResource.getContents().add(configuration);

			poResource.save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			throw new SimulatorException("Error saving System Model", e);
		}
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isNotInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isUnpackedPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isHalfInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isHalfInstalledReinstRequiredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredReinstRequiredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 * @return Boolean
	 */
	public Boolean isConfigFilesPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}

	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isNotInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isUnpackedPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfInstalledReinstRequiredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredReinstRequiredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isConfigFilesPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}
		
		return found;
	}

	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public Boolean isInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isNotInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isUnpackedPackage(String packageName) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfInstalledReinstRequiredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isHalfConfiguredReinstRequiredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isConfigFilesPackage(String packageName) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public InstalledPackage getInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}


		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public InstalledPackage getInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public InstalledPackage getInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfInstalledPackage getHalfInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfInstalledPackage getHalfInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public HalfInstalledPackage getHalfInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfInstalledPackage> packIterator = configuration.getHalfInstalledPackages().iterator();
		HalfInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfInstalledReinstRequiredPackage getHalfInstalledReinstRequiredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfInstalledReinstRequiredPackage getHalfInstalledReinstRequiredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public HalfInstalledReinstRequiredPackage getHalfInstalledReinstRequiredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfInstalledReinstRequiredPackage> packIterator = configuration.getHalfInstalledReinstRequiredPackages().iterator();
		HalfInstalledReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfConfiguredPackage getHalfConfiguredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfConfiguredPackage getHalfConfiguredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public HalfConfiguredPackage getHalfConfiguredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfConfiguredPackage> packIterator = configuration.getHalfConfiguredPackages().iterator();
		HalfConfiguredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfConfiguredReinstRequiredPackage getHalfConfiguredReinstRequiredPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public HalfConfiguredReinstRequiredPackage getHalfConfiguredReinstRequiredPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public HalfConfiguredReinstRequiredPackage getHalfConfiguredReinstRequiredPackage(String packageName) {
		
		Boolean found = false;
		Iterator<HalfConfiguredReinstRequiredPackage> packIterator = configuration.getHalfConfiguredReinstRequiredPackages().iterator();
		HalfConfiguredReinstRequiredPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public UnpackedPackage getUnpackedPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public UnpackedPackage getUnpackedPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public UnpackedPackage getUnpackedPackage(String packageName) {
		
		Boolean found = false;
		Iterator<UnpackedPackage> packIterator = configuration.getUnpackedPackages().iterator();
		UnpackedPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public NotInstalledPackage getNotInstalledPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public NotInstalledPackage getNotInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @return Boolean
	 */
	public NotInstalledPackage getNotInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public ConfigFilesPackage getConfigFilesPackage(String packageName, String version, String architecture) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
					if (pkgElem.getArchitecture() != null) {
						if ((pkgElem.getVersion()).equals(version) && (pkgElem.getArchitecture()).equals(architecture)) {
							found = true;
						} else {
							found = false;
						}
					} else {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
					}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public ConfigFilesPackage getConfigFilesPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if ((pkgElem.getName()).equals(packageName)) {
				if (pkgElem.getVersion() != null) {
						if ((pkgElem.getVersion()).equals(version)) {
							found = true;
						} else {
							found = false;
						}
				} else {
					found = true;
				}
			}
		}

		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public ConfigFilesPackage getConfigFilesPackage(String packageName) {
		
		Boolean found = false;
		Iterator<ConfigFilesPackage> packIterator = configuration.getConfigFilesPackages().iterator();
		ConfigFilesPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		if (found == false) {
			pkgElem = null;
		}

		return pkgElem;
	}

	
	/**
	 * 
	 * @param oldPkgStatus
	 * @param newPkgStatus
	 */
	@SuppressWarnings("rawtypes")
	private void findReferenceAndSetNewStatus(Package oldPkgStatus,  Package newPkgStatus) {

		Collection references = EcoreUtil.UsageCrossReferencer.find(oldPkgStatus, oldPkgStatus.eResource().getResourceSet());
		
		for (Iterator iter = references.iterator(); iter.hasNext(); ) {
			  EStructuralFeature.Setting setting = (EStructuralFeature.Setting)iter.next();
			  if (setting.getEObject() instanceof  SingleDep) {
				  SingleDep s = (SingleDep)setting.getEObject();
				  s.setPkg(newPkgStatus);
			  }
			  
			  if (setting.getEObject() instanceof  SingleConflict) {
				  SingleConflict s = (SingleConflict)setting.getEObject();
				  s.setPkg(newPkgStatus);
			  }
		}
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 */
	public void setConfigFilesPackage(String packageName, String version, String architecture) {
		
		InstalledPackage pkgInstElem = getInstalledPackage(packageName, version, architecture);

		if (pkgInstElem != null) {

			PackageSetting pkgSet = MancoosiFactory.eINSTANCE.createPackageSetting();

			if (pkgInstElem.getPackageSettings() != null) {
				for (int i = 0; i < pkgInstElem.getPackageSettings().getFiles().size(); i++) {
					pkgSet.getFiles().add(pkgInstElem.getPackageSettings().getFiles().get(i));
				}
			}

			ConfigFilesPackage pkgConffiles = MancoosiFactory.eINSTANCE.createConfigFilesPackage();

			this.findReferenceAndSetNewStatus(pkgInstElem, pkgConffiles);
			
			pkgConffiles.setName(packageName);
			
			if (version != null) pkgConffiles.setVersion(version);
			if (architecture != null) pkgConffiles.setArchitecture(architecture);
			
			if (pkgSet != null && pkgSet.getFiles().size() > 0) {
				pkgConffiles.setPackageSettings(pkgSet);
			}

			configuration.getConfigFilesPackages().add(pkgConffiles);

			EcoreUtil.delete(pkgInstElem, true);
		}
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 */
	public void setNotInstalledPackage(String packageName, String version, String architecture) {

		InstalledPackage pkgElem = getInstalledPackage(packageName, version, architecture);
		
		ConfigFilesPackage pkgConfElem = getConfigFilesPackage(packageName, version, architecture);
		
		NotInstalledPackage pkgNotInst = MancoosiFactory.eINSTANCE.createNotInstalledPackage();
		
		pkgNotInst.setName(packageName);
		
		if (version != null) pkgNotInst.setVersion(version);
		if (architecture != null) pkgNotInst.setArchitecture(architecture);

		if (pkgElem != null) {

			this.findReferenceAndSetNewStatus(pkgElem, pkgNotInst);
			
			// Implicit conffiles
			PackageSetting pkgSet = MancoosiFactory.eINSTANCE.createPackageSetting();
			if (pkgElem.getPackageSettings() != null) {
				for (int i = 0; i < pkgElem.getPackageSettings().getFiles().size(); i++) {
					pkgSet.getFiles().add(pkgElem.getPackageSettings().getFiles().get(i));
				}
			}
			
			if (pkgSet != null && pkgSet.getFiles().size() > 0) {
				pkgNotInst.setPackageSettings(pkgSet);
			}

			EcoreUtil.delete(pkgElem, true);
		}
		
		if (pkgConfElem != null) {

			 this.findReferenceAndSetNewStatus(pkgConfElem, pkgNotInst);
			
			// Implicit conffiles
			PackageSetting pkgSet = MancoosiFactory.eINSTANCE.createPackageSetting();
			if (pkgConfElem.getPackageSettings() != null) {
				for (int i = 0; i < pkgConfElem.getPackageSettings().getFiles().size(); i++) {
					pkgSet.getFiles().add(pkgConfElem.getPackageSettings().getFiles().get(i));
				}
			}
			
			if (pkgSet != null && pkgSet.getFiles().size() > 0) {
				pkgNotInst.setPackageSettings(pkgSet);
			}

			EcoreUtil.delete(pkgConfElem, true);
		}

		configuration.getNotInstalledPackages().add(pkgNotInst);	
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param listDep
	 * @param listConfl
	 * @param listFiles
	 * @param installedSize
	 * @param maintainer
	 * @param architecture
	 * @param section
	 * @param priority
	 */
	public void setInstalledPackage(String packageName, String version, 
			ArrayList<DepConfl> listDep, ArrayList<DepConfl> listConfl,
			ArrayList<String> listFiles, Integer installedSize, String maintainer, 
			String architecture, String section, String priority, String description) {

		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);
		HalfConfiguredReinstRequiredPackage pkgHalfConfReinstElem = getHalfConfiguredReinstRequiredPackage(packageName, version, architecture);
		HalfInstalledReinstRequiredPackage pkgHalfInstReinstElem = getHalfInstalledReinstRequiredPackage(packageName, version, architecture);
		HalfConfiguredPackage pkgHalfConfElem = getHalfConfiguredPackage(packageName, version, architecture);
		HalfInstalledPackage pkgHalfInstElem = getHalfInstalledPackage(packageName, version, architecture);

		InstalledPackage pkgInstElem = getInstalledPackage(packageName);
		
		ConfigFilesPackage pkgConfElem = getConfigFilesPackage(packageName);
		
		InstalledPackage pkgInst = MancoosiFactory.eINSTANCE.createInstalledPackage();
		
		pkgInst.setName(packageName);
		
		if (version != null) pkgInst.setVersion(version);
		if (installedSize != null) pkgInst.setInstalledSize(installedSize);
		if (maintainer != null) pkgInst.setMaintainer(maintainer);
		if (architecture != null) pkgInst.setArchitecture(architecture);
		if (description != null) pkgInst.setDescription(description);
		if (section != null) pkgInst.setSection(section);
		if (priority != null) pkgInst.setPriority(PriorityType.get(priority));
			
		if (listDep != null && listDep.size()>0) pkgInst.setDepends(setDependences(listDep));
		if (listConfl != null && listConfl.size()>0) pkgInst.setConflict(setConflicts(listConfl));
		if (listFiles != null && listFiles.size()>0) pkgInst.setPackageSettings(setPackageSetting(listFiles));
		
		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgInst);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgInst);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		if (pkgConfElem != null) {
			this.findReferenceAndSetNewStatus(pkgConfElem, pkgInst);
			EcoreUtil.delete(pkgConfElem, true);
		}
		
		if (pkgHalfConfElem != null) {
			this.findReferenceAndSetNewStatus(pkgHalfConfElem, pkgInst);
			EcoreUtil.delete(pkgHalfConfElem, true);
		}
		
		if (pkgHalfConfReinstElem != null) {
			this.findReferenceAndSetNewStatus(pkgHalfConfReinstElem, pkgInst);
			EcoreUtil.delete(pkgHalfConfReinstElem, true);
		}
		
		if (pkgHalfInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgHalfInstElem, pkgInst);
			EcoreUtil.delete(pkgHalfInstElem, true);
		}
		
		if (pkgHalfInstReinstElem != null) {
			this.findReferenceAndSetNewStatus(pkgHalfInstReinstElem, pkgInst);
			EcoreUtil.delete(pkgHalfInstReinstElem, true);
		}
		
		configuration.getInstalledPackages().add(pkgInst);
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param confFiles
	 * @param maintainer
	 * @param architecture
	 * @param section
	 * @param priority
	 */
	public void setHalfConfiguredPackage(String packageName, String version,
			ArrayList<String> confFiles,
			String maintainer, String architecture, String section,
			String priority, String description) {


		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);
		InstalledPackage pkgInstElem = getInstalledPackage(packageName, version, architecture);

		HalfConfiguredPackage pkgHalfConf = MancoosiFactory.eINSTANCE.createHalfConfiguredPackage();
		
		pkgHalfConf.setName(packageName);
		
		if (version != null) pkgHalfConf.setVersion(version);
		if (maintainer != null) pkgHalfConf.setMaintainer(maintainer);
		if (architecture != null) pkgHalfConf.setArchitecture(architecture);
		if (section != null) pkgHalfConf.setSection(section);
		if (priority != null) pkgHalfConf.setPriority(PriorityType.get(priority));
		if (description != null) pkgHalfConf.setDescription(description);

		if (confFiles != null && confFiles.size()>0) pkgHalfConf.setPackageSettings(setPackageSetting(confFiles));

		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgHalfConf);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgHalfConf);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		configuration.getHalfConfiguredPackages().add(pkgHalfConf);
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param confFiles
	 * @param maintainer
	 * @param architecture
	 * @param section
	 * @param priority
	 */
	public void setHalfConfiguredReinstRequiredPackage(String packageName, String version,
			ArrayList<String> confFiles,
			String maintainer, String architecture, String section,
			String priority, String description) {


		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);
		InstalledPackage pkgInstElem = getInstalledPackage(packageName, version, architecture);

		HalfConfiguredReinstRequiredPackage pkgHalfConf = MancoosiFactory.eINSTANCE.createHalfConfiguredReinstRequiredPackage();
		
		pkgHalfConf.setName(packageName);
		
		if (version != null) pkgHalfConf.setVersion(version);
		if (maintainer != null) pkgHalfConf.setMaintainer(maintainer);
		if (architecture != null) pkgHalfConf.setArchitecture(architecture);
		if (section != null) pkgHalfConf.setSection(section);
		if (priority != null) pkgHalfConf.setPriority(PriorityType.get(priority));
		if (description != null) pkgHalfConf.setDescription(description);

		if (confFiles != null && confFiles.size()>0) pkgHalfConf.setPackageSettings(setPackageSetting(confFiles));

		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgHalfConf);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgHalfConf);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		configuration.getHalfConfiguredReinstRequiredPackages().add(pkgHalfConf);
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param confFiles
	 * @param maintainer
	 * @param architecture
	 * @param section
	 * @param priority
	 */
	public void setUnpackedPackage(String packageName, String version,
			ArrayList<String> confFiles,
			String maintainer, String architecture, String section,
			String priority, String description) {

		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);

		InstalledPackage pkgInstElem = getInstalledPackage(packageName, version, architecture);

		UnpackedPackage pkgUnpack = MancoosiFactory.eINSTANCE.createUnpackedPackage();
		
		pkgUnpack.setName(packageName);
		if (version != null) pkgUnpack.setVersion(version);
		if (maintainer != null) pkgUnpack.setMaintainer(maintainer);
		if (architecture != null) pkgUnpack.setArchitecture(architecture);
		if (description != null) pkgUnpack.setDescription(description);
		if (section != null) pkgUnpack.setSection(section);
		if (priority != null) pkgUnpack.setPriority(PriorityType.get(priority));

		if (confFiles != null && confFiles.size()>0) pkgUnpack.setPackageSettings(setPackageSetting(confFiles));

		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgUnpack);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgUnpack);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		configuration.getUnpackedPackages().add(pkgUnpack);
	}

	
	public void setHalfInstalledPackage(String packageName, String version, String architecture) {
		
		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);

		InstalledPackage pkgInstElem = getInstalledPackage(packageName);

		HalfInstalledPackage pkgHalfInst = MancoosiFactory.eINSTANCE.createHalfInstalledPackage();
		pkgHalfInst.setName(packageName);

		if (version != null) pkgHalfInst.setVersion(version);
		if (architecture != null) pkgHalfInst.setArchitecture(architecture);

		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgHalfInst);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgHalfInst);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		configuration.getHalfInstalledPackages().add(pkgHalfInst);
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param architecture
	 */
	public void setHalfInstalledReinstRequiredPackage(String packageName, String version, String architecture) {
		
		NotInstalledPackage pkgNotInstElem = getNotInstalledPackage(packageName, version, architecture);

		InstalledPackage pkgInstElem = getInstalledPackage(packageName);

		HalfInstalledReinstRequiredPackage pkgHalfInstReinst = MancoosiFactory.eINSTANCE.createHalfInstalledReinstRequiredPackage();
		pkgHalfInstReinst.setName(packageName);

		if (version != null) pkgHalfInstReinst.setVersion(version);
		if (architecture != null) pkgHalfInstReinst.setArchitecture(architecture);

		if (pkgNotInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgNotInstElem, pkgHalfInstReinst);
			EcoreUtil.delete(pkgNotInstElem, true);
		}
		
		if (pkgInstElem != null) {
			this.findReferenceAndSetNewStatus(pkgInstElem, pkgHalfInstReinst);
			EcoreUtil.delete(pkgInstElem, true);
		}
		
		configuration.getHalfInstalledReinstRequiredPackages().add(pkgHalfInstReinst);
	}
	
	
	/**
	 * 
	 * @param listFiles
	 * @return
	 */
	private PackageSetting setPackageSetting(ArrayList<String> listFiles) {
		
		PackageSetting pkgSet = MancoosiFactory.eINSTANCE.createPackageSetting();
		
		FileSystem fs = configuration.getFileSystem();

		for (int i = 0; i<listFiles.size(); i++) {
			Iterator<File> fileIterator = fs.getAllFiles().iterator();
			File file = null;
			Boolean found = false;
			while ((fileIterator.hasNext()) && (!found)) {
				file = fileIterator.next();
				if (file.getLocation().equals(listFiles.get(i)))
					found = true;
			}
			pkgSet.getFiles().add(file);
		}
		return pkgSet;
	}

	/**
	 * 
	 * @param listDep
	 * @return
	 */
	private Dependence setDependences(ArrayList<DepConfl> listDep) {
		
		ArrayList<Dependence> appList = new ArrayList<Dependence>();
		
		for (int i=0; i< listDep.size(); i++) {
			DepConfl elem = listDep.get(i);
			
			Dependence dep = null;
			
			if (elem.getType().equals("SingleDep")) {
				
				dep = MancoosiFactory.eINSTANCE.createSingleDep();
				if (elem.getValue() != null) ((SingleDep)dep).setValue(elem.getValue());
				if (elem.getVersion() != null) ((SingleDep)dep).setVersion(VersionType.get(elem.getVersion()));
				
				Package pkg = getInstalledPackage(elem.getPkg());
				if (pkg == null) pkg = getNotInstalledPackage(elem.getPkg());
				
				((SingleDep)dep).setPkg(pkg);
				appList.add(dep);
				
			} else if (elem.getType().equals("AndDep")) {
				
				dep = MancoosiFactory.eINSTANCE.createAndDep();
				appList.add(dep);
				
			} else if (elem.getType().equals("OrDep")) {
				dep = MancoosiFactory.eINSTANCE.createOrDep();
				appList.add(dep);
			}
			
			if (i != 0) {	
				Dependence elemParent = appList.get(elem.getParentPosition());

				if (elemParent instanceof OrDep) {
					((OrDep) elemParent).getOps().add(dep);
				}
				
				if (elemParent instanceof AndDep) {
					((AndDep) elemParent).getOps().add(dep);
					
				}
			}
		}

		return appList.get(0);
	}

	/**
	 * 
	 * @param listConfl
	 * @return
	 */
	private Conflict setConflicts(ArrayList<DepConfl> listConfl) {
		
		ArrayList<Conflict> appList = new ArrayList<Conflict>();
		
		for (int i=0; i< listConfl.size(); i++) {
			DepConfl elem = listConfl.get(i);
			
			Conflict confl = null;
			
			if (elem.getType().equals("SingleConflict")) {
				
				confl = MancoosiFactory.eINSTANCE.createSingleConflict();
				if (elem.getValue() !=null) ((SingleConflict)confl).setValue(elem.getValue());
				if (elem.getVersion() !=null) ((SingleConflict)confl).setVersion(VersionType.get(elem.getVersion()));
				
				Package notPkg = getNotInstalledPackage(elem.getPkg());
				if (notPkg == null) notPkg = getInstalledPackage(elem.getPkg());
				
				((SingleConflict)confl).setPkg(notPkg);
				
				appList.add(confl);
				
			} else if (elem.getType().equals("AndConflict")) {
				
				confl = MancoosiFactory.eINSTANCE.createAndConflict();
				appList.add(confl);
				
			} else if (elem.getType().equals("OrConflict")) {
				confl = MancoosiFactory.eINSTANCE.createOrConflict();
				appList.add(confl);
			}
			
			if (i != 0) {	
				Conflict elemParent = appList.get(elem.getParentPosition());

				if (elemParent instanceof OrConflict) {
					((OrConflict) elemParent).getOps().add(confl);
				}
				
				if (elemParent instanceof AndConflict) {
					((AndConflict) elemParent).getOps().add(confl);
					
				}
			}
		}

		return appList.get(0);
	}
	
	
	/**
	 * 
	 * @param path
	 * @return
	 */
	public Boolean existFile(String path) {

		FileSystem fs = configuration.getFileSystem();
		Iterator<File> fileIterator = fs.getAllFiles().iterator();
		File file = null;
		Boolean found = false;

		while ((fileIterator.hasNext()) && (!found)) {
			file = fileIterator.next();
			if (file.getLocation().equals(path))
				found = true;
		}
		return found;
	}

	
	/**
	 * 
	 * @param location
	 * @return
	 */
	public File getFile(String location) {
		Iterator<File> fileIterator = configuration.getFileSystem().getAllFiles().iterator();
		File fileParent = null;
		Boolean found = false;

		while ((fileIterator.hasNext()) && (!found)) {
			fileParent = fileIterator.next();
			if (fileParent.getLocation().equals(location))
				found = true;
		}

		if (found == false) {
			fileParent = configuration.getFileSystem().getRoot();
		}
		
		return fileParent;
	}
	

	/**
	 * 
	 * @param location
	 * @return
	 */
	public Boolean deleteFile(String location) {
		
		Iterator<File> allFilesIterator = configuration.getFileSystem().getAllFiles().iterator();
		File fileToBeDeleted= null;
		Boolean found = false;
		
		while (allFilesIterator.hasNext() && !found) {
			fileToBeDeleted = allFilesIterator.next();
			if (fileToBeDeleted.getLocation().equals(location)) {
				found = true;

				if ((fileToBeDeleted.isIsDirectory() && fileToBeDeleted.getChilds().size()==0)
					|| (!fileToBeDeleted.isIsDirectory())) {
					// Delete only empty directory or file
					EcoreUtil.delete(fileToBeDeleted, true);
				}
			}
		}
		return found;
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	private Group getGroupByName(String name) {
		
		EList<Group> groups = configuration.getEnvironment().getGroups();
		Group g = null;
		Boolean found = false;
		
		for (int i=0; i<groups.size() && !found; i++) {
			if (groups.get(i).getName().equals(name)) {
				g = groups.get(i);
				found = true;
			}
		}
		
		return g;
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	private User getUserByName(String name) {
		
		EList<User> users = configuration.getEnvironment().getUsers();
		User u = null;
		Boolean found = false;
		
		for (int i=0; i<users.size() && !found; i++) {
			if (users.get(i).getName().equals(name)) {
				u = users.get(i);
				found = true;
			}
		}
		
		return u;
	}

	/**
	 * 
	 * @param path
	 */
	public Boolean addFile(String path, Boolean isDirectory) {

			Boolean added = false;

			if (!existFile(path)) {
				
				String parentLocation = path.substring(0, path.lastIndexOf("/"));
				String name = path.substring(path.lastIndexOf("/")+1);
				
				File file = MancoosiFactory.eINSTANCE.createFile();

				file.setName(name);
				file.setIsDirectory(isDirectory);
				file.setLocation(path);
				file.setParent(getFile(parentLocation));

				User owner = getUserByName("root");
				if (owner != null) {
					file.setOwner(owner);
				}
				
				Group group = getGroupByName("root");
				if (group != null) {
					file.setGroup(group);
				}
				
				//if (isDirectory) {
				//	file.setPermission("");
				//} else {
				//	file.setPermission("");
				//}
				
				configuration.getFileSystem().getAllFiles().add(file);
				added = true;
			}

		return added;
	}
}
