@FunctionalInterface
interface parent{
    void sayHello();
}
class lambda{
    public static void main(String[] args){
        parent s1=()->{
            System.out.println("Ramesh");

        };
        s1.sayHello();
    }
}
