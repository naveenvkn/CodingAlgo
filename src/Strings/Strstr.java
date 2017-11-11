package Strings;

public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="mississippi";
		String needle="issip";
		int result=-1,j=0;
        /*if(haystack.equals(needle))
            return 0;
        else if(needle.equals(""))
            return 0;*/
        
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                result=i;
                i++;j++;
                while(i<haystack.length() && j< needle.length() && haystack.charAt(i)==needle.charAt(j))
                {
                    i++;j++;
                    continue;
                }
                if(j==needle.length())
                {
                    System.out.println( result);
                    return;
                }
                else
                {
                    j=0;
                    i=result;
                }
            }
        }
        System.out.println("-1");

	}

}
