package multicatchblock;

public class ByUsingPipeLineOperator {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	int []array= {8,7,5,3};	
	int num1,num2;
		try {
			num1=0;
			num2=78/num1;
			
			
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			
			num1=0;
			num2=array[6]/num1;
			
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	

}
