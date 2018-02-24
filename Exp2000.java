package Day1;

import java.util.Scanner;
/**
 * 开始刷杭电oj第一题，submit程序时要将类名改为Main
 * @author Administrator
2000	 ASCII码排序
Problem Description
输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
Input
输入数据有多组，每组占一行，有三个字符组成，之间无空格。
Output
对于每组输入数据，输出一行，字符中间用一个空格分开。
 * 
 */
public class Exp2000 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			char a=s.charAt(0);
			char b=s.charAt(1);
			char c=s.charAt(2);
			if(a<b){
				if(b<c){
					System.out.println(a+" "+b+" "+c);
				}
				else if(a<c){
					System.out.println(a+" "+c+" "+b);
				}
				else{
					System.out.println(c+" "+a+" "+b);
				}
			}
			else{
				if(a<c){
					System.out.println(b+" "+a+" "+c);
				}
				else if(b<c){
					System.out.println(b+" "+c+" "+a);
				}
				else{
					System.out.println(c+" "+b+" "+a);
				}
			}
		}
	}
}
