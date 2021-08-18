import java.util.Scanner;
public class EqualityUC2 {
	
	public static void main(String []args) {
		
		
		        Scanner scan = new Scanner(System.in);
		        double length1;
		        double x1;
		        double y1;
		        double x2;
		        double y2;
		        
		        double length2;
		        double x11;
		        double y11;
		        double x22;
		        double y22;
		        System.out.println("enter Line 1 cordinates");
		        
		        System.out.println("Enter X1 coordinates:");
		        x1= scan.nextDouble();
		        System.out.println("Enter Y1 coordinates:");
		        y1= scan.nextDouble();
		        System.out.println("Enter X2 coordinates:");
		        x2= scan.nextDouble();
		        System.out.println("Enter Y2 coordinates:");
		        y2= scan.nextDouble();
		        
		        System.out.println("enter Line 2 cordinates");
		        
		        
		        System.out.println("Enter X11 coordinates:");
		        x11= scan.nextDouble();
		        System.out.println("Enter Y11 coordinates:");
		        y11= scan.nextDouble();
		        System.out.println("Enter X22 coordinates:");
		        x22= scan.nextDouble();
		        System.out.println("Enter Y22 coordinates:");
		        y22= scan.nextDouble();
		        scan.close();



		        length1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		        System.out.println("The length of line 1 :"+length1);

		        length2 = Math.sqrt((y22 - y11) * (y22 - y11) + (x22 - x11) * (x22 - x11));
		        System.out.println("The length of line 2 :"+length2);
		        if
		        (length1 == length2) {
		        	System.out.println("lines are same");}
		        
		        	else 
		        		
			        	System.out.println("lines are notsame");
		        		
		        

		    
			
	}
}
	
	
	   