package custom_exception;

public class StudentNotFoundException extends Exception {
	
	private static String message = "Student Not Found !!!";
	
	public StudentNotFoundException() {
		this(message);
	}
	
	public StudentNotFoundException(String message) {
		super(message);
	}
	
	

}
