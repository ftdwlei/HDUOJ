package Day1;

import java.util.Scanner;
/**
 * Ҫ�������ж�
Problem Description
���ڱ��ʽn^2+n+41����n�ڣ�x,y����Χ��ȡ����ֵʱ������x,y��(-39<=x<y<=50)���ж��ñ��ʽ��ֵ�Ƿ�Ϊ������
Input
���������ж��飬ÿ��ռһ�У�����������x��y��ɣ���x=0,y=0ʱ����ʾ������������в�������
Output
����ÿ��������Χ�ڵ�ȡֵ��������ʽ��ֵ��Ϊ�����������"OK",�����������Sorry��,ÿ�����ռһ�С�
 * @author Administrator
 *
 */

public class Exp2012 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int x=input.nextInt();
			int y=input.nextInt();
			if(x==0&&y==0){
				break;
			}else{
				int flag=1;  //��Ǳ��ʽ��ֵ�Ƿ��з�����
				for(int k=x;k<=y;k++){
					if(isPrime(k*k+k+41)){
						continue;
					}else{
						flag=-1;
					}
				}
				if(flag==1){   //ѭ����û������������OK
					System.out.println("OK");
				}else{
					System.out.println("Sorry");
				}
			}
		}
	}
	//�ж���������
	public static boolean isPrime(int num){
		for(int i=2;i<(int)Math.sqrt(num)+1;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
}
