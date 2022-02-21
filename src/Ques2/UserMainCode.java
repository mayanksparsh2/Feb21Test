package Ques2;

public class UserMainCode {
    public static int validateColorCode(String s1) {
        if (s1.matches("[#]{1}[A-F0-9]{6}")) {
            return 1;
        } else {
            return -1;
        }
    }
}