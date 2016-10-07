import java.util.Scanner;

/*
  给定数组arr，arr 中所有的值都为正数且不重复。每个值代表一种面值的货币，每种
面值的货币可以使用任意张，再给定一个整数aim 代表要找的钱数，求换钱有多少种方法。
*/

public class HuanLinQianFangFaShu {

	public static int coins(int []array,int aim){
		if(array==null    ||array.length==0||aim<0){
			return 0;
		}
		return process(array,0,aim);
	}
	
	private static int process(int[] array, int index, int aim) {
		int res=0;
		int i=0;
		if(index==array.length){
			res=aim==0?1:0;
		}else{
			for(i=0;array[index]*i<=aim;i++){
				res+=process(array, index+1, aim-array[index]*i);
			}
		}
		return res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()){
			int n=in.nextInt();
			int []array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=in.nextInt();
			}
			int aim=in.nextInt();
			System.out.println(coins(array, aim));
		}
	}

}



