package OOPS.Inheritance;

class Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.childrenInformation();

        //other way

        OldParent oldChild = new Child();
        oldChild.parentInformation("parent");
    }
}

class OldParent
{
    public void parentInformation(String fatherName) {
        System.out.println("this method is used to validate parent names " + fatherName);
    }
}

class Child extends OldParent{
    public void childrenInformation()
    {
        System.out.println("this method is for child information");
    }
}
