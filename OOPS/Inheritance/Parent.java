package OOPS.Inheritance;

class Parent {

    public void parentInformation(String fatherName)
    {
        System.out.println("this method is used to validate parent names "+fatherName);
    }
}

class Child extends Parent{
    public void childrenInformation()
    {
        System.out.println("this method is for child information");
    }
}
