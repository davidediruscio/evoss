package it.univaq.mancoosi.validator.helper;

public class Operation {
	private String type;
	private String name;
	private String version;
	private String architecture;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersion() {
		return version;
	}
	
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}	
	public String getArchitecture() {
		return architecture;
	}
	
}