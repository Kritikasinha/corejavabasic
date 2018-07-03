public class Stringcomp {
    public static void main(String[] args) {
        String s = "Kritika";
        String s1 = "Sinha";
        String s2 = new String("Kritika");
        if (s == s1) {
            System.out.println("Both the string reference is same");
        }
        if (s == s2) {
            System.out.println("The rference is same");
        } else {
            System.out.println("The reference is different");
        }

        if (s.equals(s2)){
            System.out.println("Both the contents are equal");
        }
        System.out.println(s1.compareTo(s2));
        System.out.println(s.contains("Kr"));
        System.out.println(s.endsWith("Kr"));
        System.out.println(s.getBytes());
    }
}