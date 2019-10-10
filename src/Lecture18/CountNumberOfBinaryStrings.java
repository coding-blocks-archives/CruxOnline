package Lecture18;

public class CountNumberOfBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=40;
		
		int[] ones=new int[n];
		int[] zeroes=new int[n];
		long one=System.currentTimeMillis();
		//seed
		zeroes[0]=1;
		ones[0]=1;
		
		for(int i=1;i<zeroes.length;i++) {
			ones[i]=zeroes[i-1]+ones[i-1];
			zeroes[i]=ones[i-1];
		}	
		
		int ans=zeroes[n-1]+ones[n-1];
		System.out.println(ans);
		long two=System.currentTimeMillis();
		System.out.println(two-one);
	}

}
