package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
		
	
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private String designation;
	
	
	public Employee() {
	
	}
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + "]";
	}
	
	
	
}


public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new Employee(101, "Chetan Kochar", "Java Developer");
		String fileName = "employee.txt";
		
			FileOutputStream file = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\project\\"+fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(e1); 
			file.close();
			out.close();
	
			FileInputStream fileIn = new FileInputStream("C:\\Users\\lenovo\\Desktop\\project\\"+fileName);
			ObjectInputStream fileOut =  new ObjectInputStream(fileIn);
			e1= (Employee)fileOut.readObject();
			System.out.println(e1);
			fileIn.close();
			fileOut.close();
			
	}

}
