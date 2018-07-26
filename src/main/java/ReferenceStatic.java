public class ReferenceStatic {

        public static void saysomething(){
            System.out.println("Hello this is static method");
        }

    public static void main(String[] args) {
            newMethodref s = ReferenceStatic::saysomething;
            s.say();
        }
    }

