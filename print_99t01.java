class print_99t01 {
    public static void main(String[] args) {
        print_99t01 obj=new print_99t01();
        obj.print(99);
    }
    public int print(int target){
        if (target!=0){
            System.out.println(target);
            return print(target-1);
        }
        else{
            return 0;
        }
    }
}