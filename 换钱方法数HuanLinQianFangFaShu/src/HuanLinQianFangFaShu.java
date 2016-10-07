import java.util.Scanner;

/*
  ��������arr��arr �����е�ֵ��Ϊ�����Ҳ��ظ���ÿ��ֵ����һ����ֵ�Ļ��ң�ÿ��
��ֵ�Ļ��ҿ���ʹ�������ţ��ٸ���һ������aim ����Ҫ�ҵ�Ǯ������Ǯ�ж����ַ�����
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



