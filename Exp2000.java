package Day1;

import java.util.Scanner;
/**
 * ��ʼˢ����oj��һ�⣬submit����ʱҪ��������ΪMain
 * @author Administrator
2000	 ASCII������
Problem Description
���������ַ��󣬰����ַ���ASCII���С�����˳������������ַ���
Input
���������ж��飬ÿ��ռһ�У��������ַ���ɣ�֮���޿ո�
Output
����ÿ���������ݣ����һ�У��ַ��м���һ���ո�ֿ���
 * 
 */
public class Exp2000 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			String s=input.nextLine();
			char a=s.charAt(0);
			char b=s.charAt(1);
			char c=s.charAt(2);
			if(a<b){
				if(b<c){
					System.out.println(a+" "+b+" "+c);
				}
				else if(a<c){
					System.out.println(a+" "+c+" "+b);
				}
				else{
					System.out.println(c+" "+a+" "+b);
				}
			}
			else{
				if(a<c){
					System.out.println(b+" "+a+" "+c);
				}
				else if(b<c){
					System.out.println(b+" "+c+" "+a);
				}
				else{
					System.out.println(c+" "+b+" "+a);
				}
			}
		}
	}
}
