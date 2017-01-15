package Demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date; 


public class Hello {
	
	   public static void main(String[] args) throws ParseException {
	        
	         // 创建对象，对象名为hello,Te为类
	    	Te hello = new EE();
	    	Te hellow = new EE(5,"男","张三");
	    	Te hello3 = new EE();
	        
	        // 调用方法并将返回值保存在变量中
			int[] nums = hello.getArray(4);
	        hello.age = 3;
	        
	        
	        // 将数组转换为字符串并输出
			System.out.println(Arrays.toString(nums)+hello.age); 
			System.out.println(hello3);//toString重写
			if(hello.equals(hello3)){//equals 用法
				System.out.println("这两个相同");
			}else{
				System.out.println("这两个不同");
			}
			//接口用法
			IPlay ip1 = new EE();
			ip1.playGame();
			//接口用法2
			IPlay ip2 = new IPlay(){

				public void playGame() {
					// TODO Auto-generated method stub
					System.out.println("玩游戏接口2");
				}
			};
			 ip2.playGame();
			//接口用法3
			 new IPlay(){
				 public void playGame() {
						// TODO Auto-generated method stub
						System.out.println("玩游戏接口3");
					}
			 }.playGame();

			 hellow.showDate();
			 
		}
	  		
}
