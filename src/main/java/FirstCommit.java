import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class FirstCommit {
    public static void firstCommitMethod(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);

        sc.close();

        secondCommitMethod();

        System.out.println("First commit");
    }

    private static void secondCommitMethod(){
        System.out.println("Second commit");
    }

}
