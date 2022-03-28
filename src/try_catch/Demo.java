package try_catch;

public class Demo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a []= {1,5,7,8};
		int b = 5;
		int res;
	
		try {
			res = a[5]/b;
		}
		catch(ArithmeticException e) {
		System.out.println("Cant divide ny zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			}
		finally {
			System.out.println("ended");
		}
		
	}

}
