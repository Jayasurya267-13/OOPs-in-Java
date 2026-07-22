import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int x=a/b;
            System.out.println("Result: "+x);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
   }
}
