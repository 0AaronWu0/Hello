package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EE extends Te implements IPlay {

	public int age=2;
	private String sex;
	public String name;
	@Override
	public String toString() {
		return "EE [age=" + age + ", name=" + name + "]";
	}
	public EE(){
		System.out.println("EE构造方法执行了");
	}
	public EE(int a,String b,String c){
		System.out.println("#EE构造方法执行了");
		age = a;
		sex =b;
		name = c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EE other = (EE) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃的抽象类");
	}
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("玩游戏接口1");
	}

	

}
