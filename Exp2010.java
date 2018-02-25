package Day1;

import java.util.Scanner;

/**
 * 要求：水仙花数
Problem Description
春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
现在要求输出所有在m和n范围内的水仙花数。
Input
输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
Output
对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
如果给定的范围内不存在水仙花数，则输出no;
每个测试实例的输出占一行。

 * @author Administrator
 *
 */
public class Exp2010 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int m=input.nextInt();
			int n=input.nextInt();
			boolean flag=true;
			int i,a,b,c,sum,x=0;
			int arr[]=new int[1000];//利用数组存储水仙花数，输出时剔除最后一个数带空格的问题
			for(i=m;i<=n;i++){
				a=i/100;
				b=(i-a*100)/10;
				c=i%10;            //这个地方之前犯了%100的余数错误
				sum=a*a*a+b*b*b+c*c*c;//求出“水仙花数”右值
				if(i==sum){
					arr[x]=i;
					x++;
					flag=false;
				}
			}
			if(flag){
				System.out.print("no");
			}else{
				for(int j=0;j<x;j++){
					if(j!=x-1)
						System.out.print(arr[j]+" ");
					else
						System.out.print(arr[j]);
				}
			}
			System.out.println();
			
		}
	}
}
