package Day1;

import java.util.Scanner;

/**
要求： 数值统计
Problem Description
统计给定的n个数中，负数、零和正数的个数。
Input
输入数据有多组，每组占一行，每行的第一个数是整数n（n<100），表示需要统计的数值的个数，然后是n个实数；如果n=0，则表示输入结束，该行不做处理。
Output
对于每组输入数据，输出一行a,b和c，分别表示给定的数据中负数、零和正数的个数。
 * @author Administrator
 *
 */
public class Exp2008 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int negativeNum=0,zeroNum=0,positiveNum=0;
			int n=input.nextInt();
			if(n==0)  //如果n=0，则表示输入结束，该行不做处理。
				break;
			for(int i=0;i<n;i++){
				double x=input.nextDouble();
				if(x<0)
					negativeNum++;
				else if(x==0)
					zeroNum++;
				else
					positiveNum++;
			}
			System.out.println(negativeNum+" "+zeroNum+" "+positiveNum);
		}
	}
}
