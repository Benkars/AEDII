public class Prodemge {
    public static void main(String[] args) {

        for (int lix = 0; lix < 10; lix++) {
            if (lix == 0 || lix == 9)
                for (int aux = 0; aux < 60; aux++) {
                    System.out.print("+");
                }
            if (lix > 0 && lix < 9) {
                System.out.print("+");
                for (int aux = 0; aux < 58; aux++) {
                    System.out.print(" ");
                }
                System.out.print("+");
            }
            System.out.println();
        }
    }
}