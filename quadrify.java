import java.util.Scanner

//ax2+bx+c=0

public class Program
{
	public static void main(String[] args){
		int a = new int();
		int b = new int();
		int c = new int();
		if(confirm(a) == true){
			if(check(a,b,c) == true){
				System.out.println("x1 = ")
				System.out.println(qsolve1(a,b,c))
				System.out.println("x2 = ")
				System.out.println(qsolve2(a,b,c))
			}
		}
		
	}

	protected static boolean confirm(a){
			double result = new double();
			if(a == 0){
				System.out.println("not quadratic, solve anyway? (y/n)");
					str y-or-n = (str) new Scanner(System.in);
					if(y-or-n == "y"){
						return true;
					}else{
						return false;
					}
				}else{
					return true;
				}
		}
		
		protected static boolean check(a,b,c){
			if(b*2 - 4*a*c < 0){
				return false;
			}else{
				return true;
			}
		}
		
		protected static qsolve1(a,b,c){
			int x1 = new int();
			x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
			return x1;
		}
		
		protected static qsolve2(a,b,c){
			int x2 = new int();
			x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
			return x2;
		}
	}
	
	