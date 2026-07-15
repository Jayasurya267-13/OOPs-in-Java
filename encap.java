class student{
    private int marks;

    public void setmarks(int marks){
        this.marks=marks;

    }
    public int getmarks(){
        return marks;
    }
}
class encap{
    public static void main(String[] args){
        
        student s=new student();
        s.setmarks(90);
        System.out.println(s.getmarks());


    }
}