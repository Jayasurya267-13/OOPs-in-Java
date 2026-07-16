@FunctionalInterface
interface add{
    int sum(int a,int b);
}

class sum{
    public static void main(String[] args){
        add a=(x,y)->x+y;
        System.out.println("Sum of two numbers is: "+a.sum(10,20));
    }
}