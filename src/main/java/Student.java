public class Student {
    private String name;
    private Integer age;
    private static String school = "atguigu";


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + "\t" + this.age + "\t" + Student.school);
    }

    public static void main(String[] args) {
        Student alice = new Student("alice", 32);
        Student bob = new Student("bob", 32);
        alice.printInfo();
        bob.printInfo();
    }
}
