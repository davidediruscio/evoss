package fdjarexample;

import failuresdetector.QueryExecutor;

public class QueriesExecFromJarExample {

	public static void main(String[] args) {
		String query1 = "mancoosi::InstalledPackage.allInstances()->exists(c | c.installedSize < 85)";
		String query2 = "mancoosi::InstalledPackage.allInstances()->exists(c | c.name = 'a')";
		String[] queries = new String[] {query1, query2};
		Object[] results = QueryExecutor.executeQueries("model/systemModel.ecore", queries);
		for(int i = 0; i < results.length; i++) {
			if(results[i].toString().equals("[false]")) {
				System.out.println("Failure detected for the query " + queries[i] + "!");
			} else {
				System.out.println("No failures detected for the query " + queries[i] + ".");
			}
		}
	}
	
}
