
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "abcdecba";
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!=x.charAt(j))
			{
				System.out.println("NOT PALINDROME");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("PAlindrome");

	}

}
