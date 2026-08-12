import java.util.*;
public class StudentMarksCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("=============Student Result================");
		String name=sc.nextLine();
       
        int roll=sc.nextInt();
        
        int e=sc.nextInt();
        int m=sc.nextInt();
        int j=sc.nextInt();
        int d=sc.nextInt();
        int a=sc.nextInt();
       
        System.out.println("name         : " +name);
        System.out.println("Roll Number  : " + roll);
        System.out.println("English      : " + e);
        System.out.println("Maths        : " + m);
        System.out.println("Java         : " + j);
        System.out.println("DSA          : " + d);
        System.out.println("Aptitude     : " + a);
        
        int total=(e+m+j+d+a);
        System.out.println("Total        : " + total + "/ 500");
        double avg=(e+m+j+d+a)/5.0;
        System.out.println("Average      : " + avg);
        double per=(total/500.0)*100;
        System.out.println("Percentage   : " + per + "%");
        
        	
        if(per>=40 && e>=35 && m>=35 && j>=35 && d>=35 && a>=35) {
        	System.out.println("Result    :  pass" );
        }
        else {
        	System.out.println("Result    :  fail" );
        }
        }
         
        
	}


