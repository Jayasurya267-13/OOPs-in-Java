@FunctionalInterface
interface Calculator{
    int multiply(int a,int b);
}
class multiply {
    public static void main(String[] args) {
        Calculator a= (x,y)->x*y;
        System.out.println("6 x 7 = "+a.multiply(6,7));
    }
}