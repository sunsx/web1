public class TestExtend extends Employee
{
	public static void main(String args[])
	{
		System.out.println("覆盖方法调用:"+getSalary("王一",500));
		System.out.println("继承方法调用:"+getSalary2("王一",500));
		System.out.println("覆盖方法调用:"+getSalary("王菲",10000));
		System.out.println("继承方法调用:"+getSalary2("王菲",10000));
	}
	public static String getSalary(String name,int salary)
	{
		String str;
		if(salary>5000)
			str="名字:"+name+"Salary:"+salary;
		else
			str="名字:"+name+"Salary:低于5000";
		return str;
	}
};
class Employee
{
	public String name;
	public int salary;
	public static String getSalary(String name,int salary)
	{
		String str;
		str="名字:"+name+"Salary:"+salary;
		return str;
	}
	public static String getSalary2(String name,int salary)
	{
		String str;
		str="名字:"+name+"Salary:"+salary;
		return str;
	}
};