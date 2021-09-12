package secondweek.handong.edu;

public class Student implements Comparable<Student>{
	
	private int no;
	private int age;
	private String name;
	
	public Student(int no,String name,int age) {
		this.age = age;
		this.name = name;
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [no ="+this.no+", name="+this.name+", age="+this.age+"]";
	}
}
