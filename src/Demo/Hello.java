package Demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date; 


public class Hello {
	
	   public static void main(String[] args) throws ParseException {
	        
	         // �������󣬶�����Ϊhello,TeΪ��
	    	Te hello = new EE();
	    	Te hellow = new EE(5,"��","����");
	    	Te hello3 = new EE();
	        
	        // ���÷�����������ֵ�����ڱ�����
			int[] nums = hello.getArray(4);
	        hello.age = 3;
	        
	        
	        // ������ת��Ϊ�ַ��������
			System.out.println(Arrays.toString(nums)+hello.age); 
			System.out.println(hello3);//toString��д
			if(hello.equals(hello3)){//equals �÷�
				System.out.println("��������ͬ");
			}else{
				System.out.println("��������ͬ");
			}
			//�ӿ��÷�
			IPlay ip1 = new EE();
			ip1.playGame();
			//�ӿ��÷�2
			IPlay ip2 = new IPlay(){

				public void playGame() {
					// TODO Auto-generated method stub
					System.out.println("����Ϸ�ӿ�2");
				}
			};
			 ip2.playGame();
			//�ӿ��÷�3
			 new IPlay(){
				 public void playGame() {
						// TODO Auto-generated method stub
						System.out.println("����Ϸ�ӿ�3");
					}
			 }.playGame();

			 hellow.showDate();
			 
		}
	  		
}
