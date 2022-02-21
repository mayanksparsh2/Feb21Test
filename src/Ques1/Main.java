package Ques1;
import java.util.Scanner;

/*
Question -1
Calculate Electricity Bill
Given a method calculateElectricityBill() with three inputs. Write code to calculate the current bill. Include a class UserMainCode with a static method calculateElectricityBill which accepts 3 inputs .
The return type of the output should be an integer . Create a class Main which would get the inputs and call the static method calculateElectricityBill present in the UserMainCode.
Input and Output Format:
Input consist of 3 integers.
First input is previous reading, second input is current reading and last input is per unit charge
Reading Format - XXXXXAAAAA where XXXXX is consumer number and AAAAA is meter reading. Output is a single integer corresponding to the current bill.
Refer sample output for formatting specifications.
Sample Input 1:
ABC2012345
ABC2012660
4
Sample Output 1: 1260
*/
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int c=sc.nextInt();
        System.out.println(UserMainCode.calculateElectricityBill(s1,s2, c));
    }
}