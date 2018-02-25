package Day1;

import java.util.Scanner;
/**
 * 要求：素数判定
Problem Description
对于表达式n^2+n+41，当n在（x,y）范围内取整数值时（包括x,y）(-39<=x<y<=50)，判定该表达式的值是否都为素数。
Input
输入数据有多组，每组占一行，由两个整数x，y组成，当x=0,y=0时，表示输入结束，该行不做处理。
Output
对于每个给定范围内的取值，如果表达式的值都为素数，则输出"OK",否则请输出“Sorry”,每组输出占一行。
 * @author Administrator
 *
 */

public class Exp2012 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int x=input.nextInt();
			int y=input.nextInt();
			if(x==0&&y==0){
				break;
			}else{
				int flag=1;  //标记表达式的值是否有非素数
				for(int k=x;k<=y;k++){
					if(isPrime(k*k+k+41)){
						continue;
					}else{
						flag=-1;
					}
				}
				if(flag==1){   //循环完没有素数，返回OK
					System.out.println("OK");
				}else{
					System.out.println("Sorry");
				}
			}
		}
	}
	//判断素数函数
	public static boolean isPrime(int num){
		for(int i=2;i<(int)Math.sqrt(num)+1;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
}
