import java.util.*;

class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(checkRotation(s1, s2))
            System.out.println(s1 + " and " + s2 + " are reverse of each other");
        else    
            System.out.println(s1 + " and " + s2 + " are not reverse of each other");
    }

    static boolean checkRotation(String s1, String s2) {
        if(s1.length() == s2.length()) {
            int length = s1.length();
            for(int i=0; i<length; i++)
                if(s1.charAt(i) != s2.charAt(length-i-1))
                    return false;
            return true;
        } return false;
    }
}