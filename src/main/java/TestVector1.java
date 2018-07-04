import java.util.*;
class TestVector1{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();//creating vector
        v.add("Kritika");//method of Collection
        v.addElement("tul");//method of Vector
        v.addElement("tultuli");
        //traversing elements using Enumeration
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}