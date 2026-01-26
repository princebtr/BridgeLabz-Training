import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id; String name, department; double salary;
    Employee(int i,String n,String d,double s){id=i;name=n;department=d;salary=s;}
}
public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Amit","IT",75000));
        list.add(new Employee(2,"Ravi","HR",60000));
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employees.ser"))){
            oos.writeObject(list);
        }catch(IOException e){e.printStackTrace();}
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employees.ser"))){
            List<Employee> emp=(List<Employee>)ois.readObject();
            for(Employee e:emp){
                System.out.println(e.id+" "+e.name+" "+e.department+" "+e.salary);
            }
        }catch(IOException|ClassNotFoundException e){e.printStackTrace();}
    }
}
