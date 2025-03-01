package TheObjectClass;


public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 20);
        System.out.println(max.toString());
        PrimarySchoolStudent john = new PrimarySchoolStudent("John", 10, "Doe");
        System.out.println(john.toString());
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*@Override
    public String toString() {
        return super.toString() ;
    }*/
    @Override
    public String toString() {
        return "Student's " +
                "name is '" + name + '\'' +
                "and  age is " + age +
                ' ';
    }
}
class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }
    @Override
    public String toString(){
        return parentName + "'s child " + super.toString();
    }
}
