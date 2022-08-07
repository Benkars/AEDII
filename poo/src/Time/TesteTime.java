package Time;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.toString());

        time.setHora(40);
        time.setMinuto(80);
        time.setSegundo(80);
        System.out.println(time);

        Time d1 = new Time(23);
        System.out.println(d1);

        Time d2 = new Time(23, 59);
        System.out.println(d2);

        Time d3 = new Time(23, 59, 59);
        System.out.println(d3);
    }
}