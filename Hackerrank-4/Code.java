import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String r = s.replace(' ', '_');
        System.out.println("The string after replacing spaces with underscore is : " + r);
        sc.close();

    }
}