package cinematicbysys;

public class Films {
    private String name;
    private double price;
    private int day;
    private String time;// it will contain start and stop time of film
    private int place;// yer nomresi
    private int numofticket;// satila bilecek mumkun biletlerin sayi
    private String state = "unsold";

    public Films() {

    }

    public Films(String name, double price, int day, String time, int place, String state) {
        this.name = name;
        this.price = price;
        this.day = day;
        this.time = time;
        this.place = place;
        this.state = state;
        // this.numofticket = numofticket;
    }

    // writing getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public void setNumOfTicket(int numofticket) {
        this.numofticket = numofticket;
    }

    public int getNummOfTicket() {
        return numofticket;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void generateTicket(String name, int day, int place) {
        System.out.println("***************************************************************************************");
        System.out.println("FilmName:" + name);
        System.out.println("Day of the week:" + day);
        System.out.println("Place:" + place);
        System.out.println("************************            !Good watching!            ************************");
        System.out.println("***************************************************************************************");
    }
}
