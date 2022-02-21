package Ques2;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

     if(  UserMainCode.validateColorCode(s1)==1){
         System.out.println("Valid");
     }else {
         System.out.println("Invalid");
     }

    }
}
