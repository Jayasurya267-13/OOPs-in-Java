class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int roll) {
        System.out.println(name + " " + roll);
    }
}
class overloading_cons{
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Arun");
        Student s3 = new Student("Kumar", 101);
    }
}