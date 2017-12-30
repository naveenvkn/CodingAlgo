package Arrays;

import java.util.ArrayList;

public class RemoveDeup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5000);
		a.add(5000);
		a.add(5000);
		int i=0;
	    for(int j=1;j<a.size();j++)
	    {
	        if(!a.get(i).equals(a.get(j)))
	        {
	            a.set(++i,a.get(j));
	            System.out.println(a.get(i)+" "+a.get(j));
	            System.out.println(i);
	        }	        
	    }
	    
	}

}
