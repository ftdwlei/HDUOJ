package Day1;

import java.util.Scanner;
/**
Ҫ�� ���������ľ���
Problem Description
�����������꣨X1,Y1��,��X2,Y2��,���㲢��������ľ��롣
Input
���������ж��飬ÿ��ռһ�У���4��ʵ����ɣ��ֱ��ʾx1,y1,x2,y2,����֮���ÿո������
Output
����ÿ���������ݣ����һ�У����������λС����
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
			System.out.printf("%.2f",distance);//�˴����벻ͨ����Ҫ�޸���Ŀ������1.5�汾���ϣ�ѡ��project����Ҽ�->Properties->compiler��
			System.out.println();
		}
	}
	
}
