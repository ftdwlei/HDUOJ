package Day2;

import java.util.Scanner;

/**
 * 要求：海选女主角
Problem Description
potato老师虽然很喜欢教书，但是迫于生活压力，不得不想办法在业余时间挣点外快以养家糊口。
“做什么比较挣钱呢？筛沙子没力气，看大门又不够帅...”potato老师很是无奈。
“张艺谋比你还难看，现在多有钱呀，听说还要导演奥运开幕式呢！你为什么不去娱乐圈发展呢？”lwg在一旁出主意。
嗯，也是，为了生存，就委屈点到娱乐圈混混吧，马上就拍一部激光电影《杭电记忆——回来我的爱》。
说干就干，马上海选女主角（和老谋子学的，此举可以吸引媒体的眼球，呵呵），并且特别规定，演员必须具有ac的基本功，否则直接out!
由于策划师风之鱼（大师级水王）宣传到位，来应聘的MM很多，当然包括nit的蛋糕妹妹等呼声很高的美女，就连zjut的jqw都男扮女装来应聘（还好被安全顾问hdu_Bin-Laden认出，给轰走了），看来娱乐圈比acm还吸引人哪...
面试那天，刚好来了m*n个MM，站成一个m*n的队列，副导演Fe(OH)2为每个MM打了分数，分数都是32位有符号整数。
一开始我很纳闷：分数怎么还有负的？Fe(OH)2解释说，根据选拔规则，头发染成黄色、化妆太浓、穿的太少等等都要扣分数的，扣的多了就可能是负分了，当然，如果发现话语中夹有日语，就直接给-2147483648分了。
分数送上来了，是我做决定的时候了，我的一个选拔原则是，要选一个面试分数绝对值（必须还是32位整数）最大的MM。
特别说明：如果不幸选中一个负分的MM,也没关系，因为我觉得，如果不能吸引你，那要想法恶心你。
Input
输入数据有多组，每组的第一行是两个整数m和n，表示应聘MM的总共的行列数，然后是m行整数，每行有n个，m和n的定义见题目的描述。
Output
对于每组输入数据，输出三个整数x,y和s，分别表示选中的MM的行号、列号和分数。
note:行号和列号从一开始，如果有多个MM的分数绝对值一样，那么输出排在最前面的一个（即行号最小的那个，如果行号相同则取列号最小的那个）。
 * @author Administrator
 *
 */
public class Exp2022 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int m=input.nextInt();
			int n=input.nextInt();
			int arr[][]=new int[m][n];
			//输入数纳入数组中
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++)
					arr[i][j]=input.nextInt();
			}
			//遍历数组，取绝对值最大值
			int max=arr[0][0];
			int x=0,y=0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(Math.abs(max)<Math.abs(arr[i][j])){
						max=arr[i][j];
						x=i;             //+1后可输出行号
						y=j;             //+1后可输出列号
					}
				}
			}
			System.out.println((x+1)+" "+(y+1)+" "+max);
		}
	}
}
