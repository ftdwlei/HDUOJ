package Day1;

import java.util.Scanner;

/**
要求：求数列的和
Problem Description
数列的定义如下：
数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
Input
输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
Output
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 * @author Administrator
 *
 */
public class Exp2009 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			double sum=0;
			int n=input.nextInt();
			int m=input.nextInt();
			double temp=n;
			for(int i=0;i<m;i++){
				sum+=temp;
				temp=Math.sqrt(temp);
			}
			System.out.printf("%.2f",sum);  //用\n OJ上不通过，改为println换行
			System.out.println();
		}
	}
}
