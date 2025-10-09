package OOPS.Constructors;
//parent class
class StudentExampleSuper {

    StudentExampleSuper()
    {
        System.out.println("Parent Constructor");
    }
}
//child class
class ChildStudent extends StudentExampleSuper {
    ChildStudent(){
        super();
        System.out.println("Child constructor is called");

    }
}
