// Java Program to check if the given set of words has unique characters in each word.
package Arrays;

public class IsUnique {
	
	public static boolean checkUniqueChars(String str)
	{
		if(str.length() > 128)
			return false;
		boolean[] ind=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(ind[val])
				return false;
			ind[val]=true;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]= {"Hello","Naveen","How","are","you"};
		for ( String word : words)
		{
			System.out.println("Is "+word+"has unique chars: "+checkUniqueChars(word));
		}

	}

}
