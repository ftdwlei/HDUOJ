package Day1;

import java.util.Scanner;
/**
要求： 计算两点间的距离
Problem Description
输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
Input
输入数据有多组，每组占一行，由4个实数组成，分别表示x1,y1,x2,y2,数据之间用空格隔开。
Output
对于每组输入数据，输出一行，结果保留两位小数。
 * @author Administrator
 *
 */
public class Exp2001 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x1,y1,x2,y2,distance;
		while(input.hasNext()){
			x1=input.nextDouble();
			y1=input.nextDouble();
			x2=input.nextDouble();
		    y2=input.nextDouble();
			distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			System.out.printf("%.2f",distance);//此处编译不通过，要修改项目编译器1.5版本以上（选中project点击右键->Properties->compiler）
			System.out.println();
		}
	}
	
}
