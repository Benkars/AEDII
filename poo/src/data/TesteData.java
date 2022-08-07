package data;

public class TesteData {
    public static void main(String[] args) {

        Data data = new Data(45);

        //data.setAno(5000);
        //data.setMes(40);
        //data.setDia(-1);

        Data d1 = new Data();
        System.out.println(d1.toString());

        Data d2 = new Data(12);
        System.out.println(d2.toString());

        Data d3 = new Data(31,12);
        System.out.println(d3.toString());

        Data d4 = new Data(9, 11, 541386564);
        System.out.println(d4.toString());

        System.out.println(data.toString());
    }
}