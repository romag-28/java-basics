package String;

import java.util.Arrays;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Shilpi";
        char [] a=name.toCharArray();
        System.out.println(Arrays.toString(a));
        int p=name.length();
        char [] b=new char[p];
        int j=0;
        for(int i=(p-1);i>=0;i--)
        {
                b[j]=a[i];
                j++;
        }
        
System.out.println(Arrays.toString(b));
}




	}

}
