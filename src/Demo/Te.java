package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Te {
	public int age=0;
	private String sex;
	public String name;
	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	public abstract void eat();
	public Te(){
		System.out.println("Te���췽��ִ����");
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Te(int a,String b,String c){
		System.out.println("#Te���췽��ִ����");
		age = a;
		sex =b;
		name = c;
	}
	public int[] getArray(int length) {
        // ����ָ�����ȵ���������
		int[] nums = new int[length];
        
        // ѭ���������鸳ֵ
		for (int i=0;i<length-1;i++) {
            nums[i]= (int)(Math.random() * 100);
			// ����һ��100���ڵ������������ֵ�������ÿ����Ա
		        
		}
		return nums; // ���ظ�ֵ�������
	}
	public void showDate() {
		Date d = new Date();//�ȶ���Date�Ͷ���
		 System.out.println(d);//�����ʽ���ã��磺Wed Jun 11 09��22��30 CST 2014
		 //����һ��SimpledateFormat���󣬲�ָ����ʽ
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String today = df.format(d);//����Format������Date����ת��Ϊ���ڸ�ʽ
		 System.out.println(today);//��ʾ���
		 String day1 = "1989��01��02�� 05:03:12";//���������ַ���
		 SimpleDateFormat df1= new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date day;
		try {
			day = df1.parse(day1);
			System.out.println(day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//ʹ��parse�����������ַ�����ת��ΪDate������
		
	}

}
