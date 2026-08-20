class Student {

    String name;
    int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println(name + " " + rollNo);
    }
}

public class parameterized_cons {

    public static void main(String[] args) {

        Student s1 = new Student("Arun", 101);
        Student s2 = new Student("Kumar", 102);

        s1.display();
        s2.display();
    }
}