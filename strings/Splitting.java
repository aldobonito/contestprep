public class Splitting {
    public static String trim(String toTrim) {
        return toTrim.trim();
    }
    public static void main(String[] args) {
        String splitMe = "I, am, a, comma, separated, string";
        String[] splitString = splitMe.split(",");
        for (String s : splitString) {
            System.out.println(s);
        }
        for (String s : splitString) {
            System.out.println(trim(s));
        }
    }
}
