
public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,temp,r;
		int n=545;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("PAlindrome");
		}
		else
		{
			System.out.println(" NOT PAlindrome");
		}
		

	}

}
