package programmes;

import java.util.Scanner;

public class Reverse_of_number {
	 public static void main(String[] args) {
//TAKE INPUT FROM THE USER
	Scanner sc=new Scanner(System.in);//ACCEPT THE VAULE AT THE USER RUNTIME  (THEY HAV PASSED ARGUMENT CALLED SYS.IN)
	 System.out.println("Enter a number:");//write some message in console window
	int num=sc.nextInt();//scanner object to get the value from user(SC),i have method call (next INT)IT WILL ACCEPT THE VAULE FROM USER,AND STORE THE NUMBER IN NUM VARIABLE

		int rev=0;//TAKING TEMP VARIABLE REV
		 while(num!=0) //NUM=1234
		 {
             rev=rev*10+ num%10; //0*10+1234%10=4   //40+3=43    430+2=432  432+1=4321
             num=num/10;//1234/10=123 ELIMINATE 4  123/10=12  12/10=1 1/10=0
}
		 System.out.println("revese number is:"+ rev);
}
}