public class TypeInferExample {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<String>(){
        String show(String a,String b){
            return a + b;
        }
    };
    String result = a.show("Java", "9");
    System.out.println(result);
}
}
