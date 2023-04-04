import java.util.Scanner;

public class Main {
    //Function
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //Function work check
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isAllDigits(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}