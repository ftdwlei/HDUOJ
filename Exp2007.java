package Day1;

import java.util.Scanner;

/**
要求：平方和与立方和
Problem Description
给定一段连续的整数，求出他们中所有偶数的平方和以及所有奇数的立方和。
Input
输入数据包含多组测试实例，每组测试实例包含一行，由两个整数m和n组成。
Output
对于每组输入数据，输出一行，应包括两个整数x和y，分别表示该段连续的整数中所有偶数的平方和以及所有奇数的立方和。
你可以认为32位整数足以保存结果。
 * @author Administrator
 *
 */
public class Exp2007 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int evenSum=0,oddSum=0;
			int m=input.nextInt();
			int n=input.nextInt();
			if(m>n){
				m=m^n;
				n=m^n;
				m=m^n;
			}
			for(int i=m;i<=n;i++){
				if(i%2==0){
					evenSum+=i*i;
				}else{
					oddSum+=i*i*i;
				}
			}
			System.out.println(evenSum+" "+oddSum);
		}
	}
}
