package OOPS.Constructors;

public class Student {
    String name;
    int age;
    String course;

    public Student()
    {
        this("Prasanth", 28);
    }
    //this : it refers the constructor of current class
    // super : it refers constructor of parent class

    public Student(String name, int age)
    {
        System.out.println(" student name is "+ name + " student age is "+ age);
    }

    public Student(String name, int age, String course)
    {
        /*
           when you try to access a constructor which has same variables and arguments in it,
           inorder to differentiate between them we will be using this key word for that.
         */
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println(" student name is "+ name + " student age is "+ age + "and course is B.Tech "+course);
    }

    public static void main(String[] args) {
        new Student();
        new Student("",10,"");
    }
}
