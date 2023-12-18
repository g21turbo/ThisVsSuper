public class SuperClass {

    public void printMethod () {
        System.out.println("Printed in SuperClass");
    }

}

class SubClass extends SuperClass {

    // overrides methods from the parent class
    @Override
    public void printMethod() {
        // super.printMethod(); // calls the method in the SuperClass (parent)
        System.out.println("printed in Subclass");
    }
}
