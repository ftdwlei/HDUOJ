package Day2;

import java.util.Scanner;

/**
 * Ҫ��ͳ��Ԫ��
Problem Description
ͳ��ÿ��Ԫ����ĸ���ַ����г��ֵĴ�����
Input
�����������Ȱ���һ������n����ʾ����ʵ���ĸ�����Ȼ����n�г��Ȳ�����100���ַ�����
Output
����ÿ������ʵ�����5�У���ʽ���£�
a:num1
e:num2
i:num3
o:num4
u:num5
�������ʵ��֮����һ�����и�����

���ر�ע�⣺���һ���������û�п��У���
 * @author Administrator
 *
 */
public class Exp2027 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		String str[]=new String[n];
		//�洢n���ַ���
		for(int i=0;i<n;i++){
			str[i]=input.nextLine();
		}
		//�ۼӸ�Ԫ���ĸ���
		for(int i=0;i<n;i++){
			int countA=0,countE=0,countI=0,countO=0,countU=0;
			for(int j=0;j<str[i].length();j++){
				if(str[i].charAt(j)=='a')
					countA++;
				else if(str[i].charAt(j)=='e')
					countE++;
				else if(str[i].charAt(j)=='i')
					countI++;
				else if(str[i].charAt(j)=='o')
					countO++;
				else if(str[i].charAt(j)=='u')
					countU++;
				else
					continue;
			}
			System.out.println("a:"+countA);
			System.out.println("e:"+countE);
			System.out.println("i:"+countI);
			System.out.println("o:"+countO);
			System.out.println("u:"+countU);
			if(i!=n-1)
				System.out.println();
		}
	}
}
