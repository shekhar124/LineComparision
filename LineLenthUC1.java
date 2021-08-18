	import java.util.Scanner;
	public class LineLenthUC1 {

	
		
		public static void main(String []args) {
			
			
			        Scanner scan = new Scanner(System.in);
			        double x1;
			        double y1;
			        double x2;
			        double y2;
			        double Length;
			        System.out.println("Enter X1 coordinates:");
			        x1= scan.nextDouble();
			        System.out.println("Enter Y1 coordinates:");
			        y1= scan.nextDouble();
			        System.out.println("Enter X2 coordinates:");
			        x2= scan.nextDouble();
			        System.out.println("Enter Y2 coordinates:");
			        y2= scan.nextInt();
			        scan.close();


			        Length = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
			        System.out.println("The length of line is :"+ Length);

			    
				
		}
	}
		
		
		   