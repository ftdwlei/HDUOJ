package Day2;

import java.util.Scanner;

/**
 * 要求：Lowest Common Multiple Plus
Problem Description
求n个数的最小公倍数。
Input
输入包含多个测试实例，每个测试实例的开始是一个正整数n，然后是n个正整数。
Output
为每组测试数据输出它们的最小公倍数，每个测试实例的输出占一行。你可以假设最后的输出是一个32位的整数。
 * @author Administrator
 *  思路：从1遍历到n个数的乘积，当存在除以任何数都余数为0截止
 *  OJ上类型不通过，把乘积用long保存即可
 */
public class Exp2028 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			int arr[]=new int[n];
			//录入n个正整数
			long numProduct=1; 
			for(int i=0;i<n;i++){
				arr[i]=input.nextInt();
				numProduct*=arr[i];     //n个正整数乘积作为循坏最大值
			}
			//输出最小公倍数
			for(long j=1;j<=numProduct;j++){   //从1到n个正整数乘积遍历
				boolean flag=true;
				for(int k=0;k<n;k++){         //依次对录入的数组元素进行取余操作
					if(j%arr[k]==0)
						continue;
					else{
						flag=false;
						break;
					}
				}
				if(flag){                     //如果j对数组中所有元素取余为0，则结束循环，输出最小公倍数j
					System.out.println(j);
					break;
				}
			}
		}
	}
}
