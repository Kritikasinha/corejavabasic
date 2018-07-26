import java.util.function.BiFunction;

public class Methodref3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer,Integer> add = Arithmetic::add;
        BiFunction<Integer, Float,Float> add1 = Arithmetic::add;
        BiFunction<Float, Float,Float> add2 = Arithmetic::add;
        int result = add.apply(10,20);
        float result1 = add1.apply(10,10.2f);
        float result2 = add2.apply(10.1f,20.1f);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
