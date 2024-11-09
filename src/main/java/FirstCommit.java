import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class FirstCommit {
    public static void firstCommitMethod(){


        /**
         *
         * Some dev1 changes
         *
         *
         *
         *
         *
         *
         *
         */


        Scanner sc = new Scanner(System.in);
        /**
         *
         * Some dev2 changes
         *
         *
         *
         *
         *
         *
         *
         */

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);

        sc.close();

        secondCommitMethod();
        System.out.println("First commit with changes");
        System.out.println("First commit with changes new");
    }

    /**
     *
     * Some dev1 changes
     *
     *
     *
     *
     *
     *
     *
     */
    private static void secondCommitMethod(){
        System.out.println("Second commit");
        /**
         *
         * Some dev2 changes
         *
         *
         *
         *
         *
         *
         *
         */
    }

}
