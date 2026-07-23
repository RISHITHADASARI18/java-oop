public class student1 {
    String name;
    int roll_no;
    int age;

    // No parameter constructor
    student1() {
        System.out.println("No Parameter");
    }

    // One parameter constructor
    student1(String n) {
        name = n;
    }

    // Two parameter constructor
    student1(String n, int r_no) {
        name = n;
        roll_no = r_no;
    }

    // Three parameter constructor
    student1(String n, int r_no, int a) {
        name = n;
        roll_no = r_no;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        student1 S1 = new student1();
        S1.display();

        student1 S2 = new student1("abc");
        System.out.println(S2.name);
        S2.display();

        student1 S3 = new student1("abc", 43);
        System.out.println(S3.name + " " + S3.roll_no);
        S3.display();

        student1 S4 = new student1("abc", 43, 21);
        System.out.println(S4.name + " " + S4.roll_no + " " + S4.age);
        S4.display();
    }
}