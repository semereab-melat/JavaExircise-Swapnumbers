
/***************************************************************
 Filename: SwapNumbers
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment:  Create and run the Java application SwapNumbers and test your program with different numbers.
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
        int num1 = 25;
        int num2 = 39;
        int tem;// this variable will hold the value temporarily

        System.out.println("Value of num1 is " + num1);
        System.out.println("Value of num2 is " + num2 +"\n");

        tem=num1; //temp will have a value of 25
        num1=num2; // num1 will have a value of 39
        num2=tem; // num2 will have a value of 25

        System.out.println("Value of num1 is now " + num1);
        System.out.println("Value of num2 is now " + tem);

  }//main
}//class