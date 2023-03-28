package Reflection;
import java.lang.reflect.*;

//interface
interface Function
{
	void display();
}


//class
class Employee implements Function
{
	private int id;
	public String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(id + " " + name);
	}
	
}

public class ReflectionDemo {
	
	public static void main(String[] arg)
	{
		
		try
		{
			
			Employee E1 = new Employee(5453 , "Darsana");
			E1.display();

			//package
			System.out.println("package : " + E1.getClass().getPackage());
			//class
			System.out.println("class : " + E1.getClass().getName());
			//interface
			Class[] objInterface = E1.getClass().getInterfaces();
			for(Class c:objInterface)
				System.out.println("interface : "+c.getName());
			
			//public fields
			Field[] fields = E1.getClass().getFields();
			System.out.println("public fields :");
			for(Field F:fields)
				System.out.println(F.getName());
			
			//all fields including private
			Field[] allFields = E1.getClass().getDeclaredFields();
			System.out.println("fields : ");
			for(Field F:allFields)
				System.out.println(F.getName());
			
			//modifier of fields
			Field name = E1.getClass().getField("name");
			int nameModifier = name.getModifiers();
			System.out.println("modifier of feild name :"+Modifier.toString(nameModifier));
			
			Field id = E1.getClass().getDeclaredField("id");
			id.setAccessible(true);
			int idModifier = id.getModifiers();
			System.out.println("modifier of feild id :"+Modifier.toString(idModifier));
			
			//value of fields
			int idValue = id.getInt(E1);
			String nameValue = (String) name.get(E1);
			System.out.println("id : "+idValue);
			System.out.println("name : "+nameValue);
			
			//change field values
			id.set(E1, 1223);
			name.set(E1, "dechu");
			
			int newIdValue = id.getInt(E1);
			String newNameValue = (String) name.get(E1);
			System.out.println("new id : "+newIdValue);
			System.out.println("new name : "+newNameValue);
			
			
			//all methods
			Method[] methods = E1.getClass().getDeclaredMethods();
			System.out.println("methods :");
			for(Method M: methods)
				System.out.println(M.getName());
			
			//return type of method
			Method display = E1.getClass().getMethod("display");
			System.out.println("return type of method :"+ display.getReturnType());
			//parameter count
			System.out.println("paramter count of method :"+ display.getParameterCount());
			
			
			//constructor
			Constructor[] c = E1.getClass().getDeclaredConstructors();
			for(Constructor C:c)
				System.out.println("constructor name : "+C.getName());
			
			for(int i=0; i<c.length;i++)
			{
				System.out.println("parameter count of constructor : "+ c[i].getParameterCount());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
