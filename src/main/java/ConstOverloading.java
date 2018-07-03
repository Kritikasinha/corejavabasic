public class ConstOverloading {
    int id;
    String name;
    int age;
    ConstOverloading(int id,String n){
        this.id=id;
        name=n;
    }
    ConstOverloading(int id,String n,int a){
        this.id=id;
        name=n;
        age=a;
    }

    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstOverloading c= new ConstOverloading('1',"a");
        ConstOverloading c1= new ConstOverloading('1',"b",6);
        c.display();
        c1.display();
    }
}


