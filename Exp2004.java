package Day1;

import java.util.Scanner;

/**
Ҫ�� �ɼ�ת��
Problem Description
����һ���ٷ��Ƶĳɼ�t������ת���ɶ�Ӧ�ĵȼ�������ת���������£�
90~100ΪA;
80~89ΪB;
70~79ΪC;
60~69ΪD;
0~59ΪE;
Input
���������ж��飬ÿ��ռһ�У���һ��������ɡ�
Output
����ÿ���������ݣ����һ�С�����������ݲ���0~100��Χ�ڣ������һ�У���Score is error!����
 * @author Administrator
 *
 */
public class Exp2004 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int num=input.nextInt();
			if(num<0||num>100){
				System.out.println("Score is error!");
			}else if(num>=90){
				System.out.println("A");;
			}else if(num>=80){
				System.out.println("B");
			}else if(num>=70){
				System.out.println("C");
			}else if(num>=60){
				System.out.println("D");
			}else{
				System.out.println("E");
			}
		}
	}
}
