public class TestCustomException {
    static void Validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Valid");
        }
        else
        {
            System.out.println("Welcome to Vote");
        }

    }

    public static void main(String[] args) {
        try {
            Validate(19);
        }
        catch(Exception m){
            System.out.println(m);
        }
        System.out.println("Normal code");
    }

}
