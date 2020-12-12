package Test;

import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    String lastName;
    Integer age;
    List<String> listOfCars;

    public Person(String name, String lastName, Integer age, List<String> listOfCars) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.listOfCars = listOfCars;
    }

    public List<String> getListOfCars() {
        return listOfCars;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
public class ReflectionExample {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1= new Person("Bob", "Michael", 20, Arrays.asList("BMW", "Hyundai", "Volkswagen"));
		
			try {
				System.out.println("Class name "+Class.forName("TestPackage.Person").getName());
				System.out.println("Class hascode "+Class.forName("TestPackage.Person").hashCode());
				System.out.println("Class to string "+Class.forName("TestPackage.Person").toString());
				System.out.println("Class getfilds "+Class.forName("TestPackage.Person").getFields());
				
				try {
					try {
						System.out.println("Class 1 method "+Class.forName("TestPackage.Person").getMethod("getAge"));
						System.out.println("Class getMethods "+Class.forName("TestPackage.Person").getMethods());
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Class hascode "+Class.forName("TestPackage.Person").getFields());
					System.out.println("Class hascode "+Class.forName("TestPackage.Person").getField("age"));
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
