package it.univaq.mancoosi.injectors.packages.util;



public class InjectorStatistics {
	
	private static InjectorStatistics INSTANCE = null;
	
	private Integer correctPackageNoScript;
	private Integer correctPackageWithScript;
	private Integer errorPackageNoScript;
	private Integer errorPackageWithScript;	

	public static InjectorStatistics getInstance() {
		if (INSTANCE == null)
			INSTANCE = new InjectorStatistics();
		return INSTANCE;
	}

	protected InjectorStatistics() {
		correctPackageNoScript = 0;
		correctPackageWithScript = 0;
		errorPackageNoScript = 0;
		errorPackageWithScript = 0;	
	}

	public void incrementCorrectPackageNoScript() {
		this.correctPackageNoScript = correctPackageNoScript + 1;
	}

	public Integer getCorrectPackageNoScript() {
		return correctPackageNoScript;
	}

	public void incrementCorrectPackageWithScript() {
		this.correctPackageWithScript = correctPackageWithScript + 1;
	}

	public Integer getCorrectPackageWithScript() {
		return correctPackageWithScript;
	}

	public void incrementErrorPackageNoScript() {
		errorPackageNoScript = errorPackageNoScript + 1;
	}

	public Integer getErrorPackageNoScript() {
		return errorPackageNoScript;
	}

	public void incrementErrorPackageWithScript() {
		this.errorPackageWithScript = errorPackageWithScript + 1;
	}

	public Integer getErrorPackageWithScript() {
		return errorPackageWithScript;
	}
}
