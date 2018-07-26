/*public class SayableLambdaEx {
    public static void main(String[] args) {
   Sayablelambda s= ()->{
                return  "I have nothing to say no parameters";
        };
        System.out.println(s.say());

    }
}*/


public class SayableLambdaEx{
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayablelambda s1=(name)->{
            return "Hello, "+ name;
        };
        System.out.println(s1.say("KS"));

        // You can omit function parentheses
            Sayablelambda s2= name ->{
                return "Hello, "+name;
            };
        System.out.println(s2.say("RK"));
    }
}

