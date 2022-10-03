package cinematicbysys;

//import java.util.Scanner;

public class Customer {
    // public Scanner inp = new Scanner(System.in);
    String name;
    int say, day, i;
    // int[] places;
    int places;
    Admin obja = new Admin();
    // Scanner inp = new Scanner(System.in);
    Films objf = new Films();
    private double amount = 100;// guya istifadecinin kartinda olan mebleg

    private void operation(int index) {
        System.out.println("Hello World!");
        for (i = 0; i < Admin.getFilm().size(); i++) {
            if (Admin.getFilm().get(i).getDay() == index) {
                System.out.println(Admin.getFilm().get(i).getName() + "|" + Admin.getFilm().get(i).getTime()
                        + "|" + Admin.getFilm().get(i).getPrice() + "$|" + Admin.getFilm().get(i).getPlace());
            } /*
               * else {
               * System.out.println("Nese var");
               * }
               */
        }
    }

    public void representTickets() {
        // Films objf = new Films();
        // Admin obja = new Admin();
        System.out.println("*********** :Ticket buying: ***********");
        System.out.println("Choose day of the week:[1,7]:");
        // Scanner inp = new Scanner(System.in);
        // int day;
        day = Main.inp.nextInt();
        switch (day) {
            case 1:
                operation(1);
                break;

            case 2:
                operation(2);
                break;

            case 3:
                operation(3);
                break;

            case 4:
                operation(4);
                break;

            case 5:
                operation(5);
                break;

            case 6:
                operation(6);
                break;

            case 7:
                operation(7);
                break;
            default:
                break;
        }
    }

    // String name;
    // int say;
    // private String cardNumber = "1234 5678 9012 3456";// kart nomresi
    // private String fourdigitPass = "0000";// 4 reqemli parol
    private int cardNumber = 12345678;
    private int fourdigitPass = 1111;
    public static double counter;

    public void login() {
        while (true) {
            System.out.println("# LOGIN #");
            System.out.println("8 digit car number(xxxxxxxx)");
            // String kartNo = Main.inp.nextLine();
            // String kartNo = Main.inp.next();
            int kartNo = Main.inp.nextInt();
            System.out.println("\n");
            System.out.println("4 digit password:");
            // String pass = Main.inp.nextLine();
            int pass = Main.inp.nextInt();
            // pass = Main.inp.next();
            if (/* kartNo.equals(cardNumber) && pass.equals(fourdigitPass) */kartNo == cardNumber
                    && pass == fourdigitPass) {
                System.out.println("Login successfull!");
                break;
            } else {
                System.out.println("Card number or password is incorrect,please try again");
            }
        }
    }

    public void sellTicket() {
        // boolean condition = true;
        System.out.println("Enter name of film and place number[1 to 80]");
        System.out.print("name:");
        name = Main.inp.next();
        System.out.print("day:");
        day = Main.inp.nextInt();
        System.out.print("number of tickets:");
        say = Main.inp.nextInt();
        // places = new int[say];
        System.out.println("Enter places you want:");
        counter = 0;
        System.out.println("size of list:" + Admin.getFilm().size());// yoxlama
        for (int i = 0; i < say; i++) {
            System.out.println("for ticket " + (i + 1));
            places = Main.inp.nextInt();
            amount = amount - Admin.getFilm().get(places).getPrice();
            // Admin.films.get(j).setState("sold");// satildi
            if (amount < 0) {
                System.out.println("You haven't enough money to buy this ticket!Exitting from system...");
                // condition = false;
                break;
            }

            else {
                while (Admin.getFilm().get(places).getState().equals("sold")) {
                    System.out.println(
                            "Ticket for this place has already been bought,please choose another place,place for ticket "
                                    + (i + 1));
                    places = Main.inp.nextInt();
                }

                Admin.getFilm().get(places).setState("sold");
                counter += Admin.getFilm().get(places).getPrice();
                // System.out.println("Works...");// yoxlama
                objf.generateTicket(this.name, this.day, this.places);// printing ticket

            }

        }
    }

    // Main.inp.close();
}
