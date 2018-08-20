import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a letter :");
	int n=in.nextInt();
	boolean flag=false;
	if(n%4==0 || n%400==0) {
		flag=true;
	}else if(n%100==0){
		flag=false;
	}
	else {
		flag=false;
	}
	if(flag) 
		System.out.println("LEAP YEAR");
	else
		System.out.println("NON-LEAP YEAR");
}
}
