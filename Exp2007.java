package Day1;

import java.util.Scanner;

/**
Ҫ��ƽ������������
Problem Description
����һ���������������������������ż����ƽ�����Լ����������������͡�
Input
�������ݰ����������ʵ����ÿ�����ʵ������һ�У�����������m��n��ɡ�
Output
����ÿ���������ݣ����һ�У�Ӧ������������x��y���ֱ��ʾ�ö�����������������ż����ƽ�����Լ����������������͡�
�������Ϊ32λ�������Ա�������
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
