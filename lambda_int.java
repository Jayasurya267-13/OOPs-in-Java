@FunctionalInterface
interface square{
    int square(int x);
}
class lambda_int{
    public static void main(String[] args){
        square s1= (x)-> x * x;
        System.out.println(s1.square(5));
    }
}

