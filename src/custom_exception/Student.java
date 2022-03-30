package custom_exception;

public class Student {
	public static void main(String[] args) {
		try {
			System.out.println(studentNotFound(1234));
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static boolean studentNotFound(int studentId) throws StudentNotFoundException {
		
		if(studentId == 1245)
		return true;
		else {
			throw new StudentNotFoundException();
		}
	}
	

}
