package OOPS.Constructors;

public class Student {
    String name;
    int age;
    String course;

    Student()
    {
        this("Prasanth", 28);
    }
    //this : it refers the constructor of current class
    // super : it refers constructor of parent class

    Student(String name, int age)
    {
        System.out.println(" student name is "+ name + " student age is "+ age);
    }

    Student(String name, int age, String course)
    {
        System.out.println(" student name is "+ name + " student age is "+ age + "and course is B.Tech "+course);
    }

    public static void main(String[] args) {
        new Student();
    }
}
