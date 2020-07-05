
public class AstrixLogger implements Logger{

	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		System.out.println(createLogs(Log)); 
	}

	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
		String errorMessage = createLogs("ERROR: " + Error); 
		String stars = ""; 
		for (int i = 0; i < errorMessage.length(); i++) {
			stars += "*"; 
		}
		System.out.println(stars); 
		System.out.println(errorMessage); 
		System.out.println(stars); 
	}
	private String createLogs(String logs) {
		return "***" + logs +  "***"; 
		
	}

}
