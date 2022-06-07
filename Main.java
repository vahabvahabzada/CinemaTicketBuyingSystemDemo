package cinematicbysys;

import java.util.Scanner;

//heftelik satis sistemi seklinde yazmaq lazimdir
public class Main {
    static Scanner inp = new Scanner(System.in);
    static Films kino = new Films();
    static Admin admin = new Admin();

    public static void app() {
        int d = 1;

        while (d != -1) {// istifadeci sistemden cixmaq ucun -1 - i basmalidi
            System.out.println("*********** Welvome to V-Cinema! ***********");
            System.out.println("*********** Weekly ticket buying system ***********");
            System.out.println("Are you Admin or Customer:(press (A,a) for admin,press (C,c) for customer");
            String choose;
            choose = inp.next();

            if (choose.equals("a") || choose.equals("A")) {
                System.out.println();
                Admin obj = new Admin();
                obj.login();
                obj.uploadFilm();
                obj.getTotalMoney();
                System.out.println("# Enter -1 to exit from system or 1  to continue #");
                d = inp.nextInt();
            }

            else if (choose.equals("c") || choose.equals("C")) {
                // Customer-e aid
                Customer objc = new Customer();
                System.out.println();// bir line buraxmaq ucun
                objc.representTickets();
                objc.login();
                objc.sellTicket();

                System.out.println("# Enter -1 to exit from system or 1 to continue #");
                d = inp.nextInt();
            }

            else {
                System.out.println("Please choose valid variant Admin(A,a) or Customer(C,c)");
                app();
            }
        }
    }

    public static void main(String[] args) {
        app();
    }
}
