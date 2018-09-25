public class Overloading {
    public static void takesParam() {
        System.out.println("Hello world!");
    }
    public static void takesParam(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void takesParam(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello world!");
        }
    }
    public static void takesParam(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name + "!");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\t----\nNo args\n\t----");
        takesParam();
        System.out.println("\n\t----\nString\n\t----");
        takesParam("Abbas");
        System.out.println("\n\t----\nint\n\t----");
        takesParam(5);
        System.out.println("\n\t----\nMultiple param\n\t----");
        takesParam("Abbas", 5);
    }
}
