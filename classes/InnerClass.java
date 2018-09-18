class Inner {
    /* This is a class-level variable. It's initialized
     * when the class is invoked, and it always usable
     * from instances of that class
     */

    int innerInt;

    /* This is a class "constructor", used to get
     * new copies. You've seen this with String(),
     * Integer(), and a couple of others
     */
    Inner() {
    }

    public void innerMethod() {
        // Either one works.
        // Using this. is preferable if there's another
        // variable which may have the same name
        System.out.println(this.innerInt);
        System.out.println(innerInt);
    }

    public void setInnerInt(int newValue) {
        innerInt = newValue;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Inner in = new Inner();

        in.innerMethod();
        in.setInnerInt(5);
        in.innerMethod();
    }
}
