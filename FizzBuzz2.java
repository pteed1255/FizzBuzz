
public class FizzBuzz2 {

	public static void main(String[] args) {
		
		FizzBuzzProgram(100);
	
	}
		private static void FizzBuzzProgram(int num)
		{
			for(int i = 1; i <= num; i++)
			{
				//multiple of 3 & 5?
				if(((i % 5)==0) && ((i % 3)==0))
				{
					System.out.println("Fizz Buzz " + i);
				}
				//multiple of 3?
				else if((i % 3)==0)
				{
					System.out.println("Fizz " + i);
				}
				//multiple of 5?
				else if((i % 5) == 0)
				{
					System.out.println("Buzz " + i);
				}
				else
				{
					System.out.println(i);
				}
				
				
			}
		}
	}


