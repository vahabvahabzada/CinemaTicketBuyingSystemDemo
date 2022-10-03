package cinematicbysys;

//million-e oxsayan bir bilet alma sistemi seklinde yazmisiq
import java.util.List;
import java.util.ArrayList;

public class Admin {
    public Admin() {
    }

    private static List<Films> films = new ArrayList<>();

    public void setFilm(Films kino) {
        films.add(kino);
    }

    public static List<Films> getFilm() {
        return films;
    }

    public void login() {
        // qebul edirik ki guya sistemin real password-u 12345678 dir
        System.out.print("Enter password of system,if you are admin:");
        while (true) {
            String pass = Main.inp.next();
            if (pass.equals("12345678")) {
                System.out.println("Login succesful.welcome to the system!");
                break;
            } else {
                System.out.println("Wrong password!Please try again...");
            }
        }
    }

    public void uploadFilm() {
        Films film;
        int c = 1;
        String name;
        double price, temp;
        int day;
        String time;
        // zalda olan yerlerin sayini 80 qebull edirik,i-ci bilet de i -ci yeri temsil
        // edir,8 cerge var,her cergede de 10 yer
        System.out.println("***********:Film uploading:***********");
        while (c != -1) {

            System.out.println("Film name:");
            name = Main.inp.next();
            System.out.println("Film price(most cheap seats,back seats):");
            price = Main.inp.nextDouble();
            temp = price;
            System.out.println("Day of week:");
            day = Main.inp.nextInt();
            System.out.println("Start and end time:(xx:xx-yy:yy)");// aralarinda bosluq olmamalidi
            time = Main.inp.next();
            for (int i = 0; i < 80; i++) {
                price = price + 3 * (7 - i / 10);// yerin oldugu sira axrici dan her qabaq siraya getdikce qiymet 3
                                                 // AZN artsin

                film = new Films(name, price, day, time, i + 1, "unsold");
                films.add(film);
                // setFilm(film);
                // films.add(new Films(name, price, day, time, i + 1, "unsold"));
                price = temp;// her dovrden cixdiqdan sonra price-i evvelki default qiymetine qaytarmaq
                             // lazimdir
            }
            System.out.println("Enter 1 for continue operation or enter -1 for exit from Admin mode:");
            c = Main.inp.nextInt();
        }
        // Main.inp.close();
    }

    public void getTotalMoney() {
        System.out.println("Total value of tickets sold today is " + Customer.counter + "$");
    }// admin ucun umumi pulu cixarmaq funksiyasi
}
