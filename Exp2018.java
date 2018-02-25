package Day1;

import java.util.Scanner;

/**
 * 要求：母牛的故事
Problem Description
有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头开始，每年年初也生一头小母牛。请编程实现在第n年的时候，共有多少头母牛？
Input
输入数据由多个测试实例组成，每个测试实例占一行，包括一个整数n(0<n<55)，n的含义如题目中描述。
n=0表示输入数据的结束，不做处理。
Output
对于每个测试实例，输出在第n年的时候母牛的数量。
每个输出占一行。
 * @author Administrator
 *  思路：递归  f(1)=1 f(2)=2 f(3)=3 f(4)=4 f(5)=f(4)+f(2)
 */
public class Exp2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			if(n==0){
				break;
			}
			System.out.println(f(n));
		}
	}
	public static int f(int n){
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 3;
		else
			return f(n-1)+f(n-3);
	}
}
