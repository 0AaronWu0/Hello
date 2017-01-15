package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Te {
	public int age=0;
	private String sex;
	public String name;
	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
	public abstract void eat();
	public Te(){
		System.out.println("Te构造方法执行了");
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Te(int a,String b,String c){
		System.out.println("#Te构造方法执行了");
		age = a;
		sex =b;
		name = c;
	}
	public int[] getArray(int length) {
        // 定义指定长度的整型数组
		int[] nums = new int[length];
        
        // 循环遍历数组赋值
		for (int i=0;i<length-1;i++) {
            nums[i]= (int)(Math.random() * 100);
			// 产生一个100以内的随机数，并赋值给数组的每个成员
		        
		}
		return nums; // 返回赋值后的数组
	}
	public void showDate() {
		Date d = new Date();//先定义Date型对象
		 System.out.println(d);//输出格式不好，如：Wed Jun 11 09：22：30 CST 2014
		 //定义一个SimpledateFormat对象，并指定格式
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String today = df.format(d);//调用Format方法将Date数据转化为日期格式
		 System.out.println(today);//显示输出
		 String day1 = "1989年01月02日 05:03:12";//定义日期字符串
		 SimpleDateFormat df1= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date day;
		try {
			day = df1.parse(day1);
			System.out.println(day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//使用parse方法将日期字符串，转化为Date型日期
		
	}

}
