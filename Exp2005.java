package Day1;

import java.util.Scanner;

/**
Ҫ�� �ڼ��죿
Problem Description
����һ�����ڣ������������Ǹ���ĵڼ��졣
Input
���������ж��飬ÿ��ռһ�У����ݸ�ʽΪYYYY/MM/DD��ɣ�����μ�sample input ,���⣬��������ȷ�����е����������ǺϷ��ġ�
Output
����ÿ���������ݣ����һ�У���ʾ�������Ǹ���ĵڼ��졣
 * @author Administrator
 *
 *˼·��1����Ϊ������������֣�  2����String.split()���������ڸ�ʽ���в�ֳ��ַ�������
 */
public class Exp2005 {
	public static void main(String[] args) {
		int []days={31,28,31,30,31,30,31,31,30,31,30,31}; //�����������·������������洢
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			String []ss=s.split("/");  //��1985/1/20��ʽ���ַ������в��
			int year=Integer.parseInt(ss[0]); //ȡ���
			int month=Integer.parseInt(ss[1]);//ȡ�·�
			int day=Integer.parseInt(ss[2]);  //ȡ����
			int totalDays=0;
			for(int i=0;i<month-1;i++){
				totalDays+=days[i];
			}
			if((month>2)&&(year%400==0||(year%4==0&&year%100!=0))) //�ж��Ƿ����겢���·ݴ��ڶ���
				totalDays=totalDays+day+1;
			else
				totalDays=totalDays+day;
			System.out.println(totalDays);
		}
	}
}
