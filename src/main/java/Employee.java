public class Employee implements Comparable<Employee>{
int id;
 String name;
 String dept;
 public Employee(int id, String name,String dept)
 {
  this.id=id;
  this.name=name;
  this.dept=dept;
 }
 public int compareTo(Employee e){
  if (id == e.id)
   return 0;
  else if(id>e.id)
          return 1;
  else
   return -1;
   }

}
