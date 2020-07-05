
public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		System.out.println(CreateLog(Log)); 	
	}

	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + CreateLog(Error)); 
		
	}
	private String CreateLog(String logs) {
		// TODO Auto-generated method stub
		String spaces = ""; 
		for (int i = 0; i < logs.length(); i++) { 
			spaces += logs.charAt(i); 
			spaces += " "; 
		}
		return spaces;
	}
}
