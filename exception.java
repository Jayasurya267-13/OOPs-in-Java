public class exception {

    public static void main(String[] args) {

        try {

            System.out.print("A ");

            int x = 10 / 0;

            System.out.print("B ");

        }

        catch(ArithmeticException e){

            System.out.print("C ");

        }

        System.out.print("D");
    }
}