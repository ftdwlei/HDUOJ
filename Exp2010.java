package Day1;

import java.util.Scanner;

/**
 * Ҫ��ˮ�ɻ���
Problem Description
�������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����������������ģ�
��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3��
����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
Input
���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����
Output
����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵�������ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
��������ķ�Χ�ڲ�����ˮ�ɻ����������no;
ÿ������ʵ�������ռһ�С�

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
			int arr[]=new int[1000];//��������洢ˮ�ɻ��������ʱ�޳����һ�������ո������
			for(i=m;i<=n;i++){
				a=i/100;
				b=(i-a*100)/10;
				c=i%10;            //����ط�֮ǰ����%100����������
				sum=a*a*a+b*b*b+c*c*c;//�����ˮ�ɻ�������ֵ
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
