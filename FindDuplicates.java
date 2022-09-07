package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Myarray = {3,15,87,33,3,67,12,15};
			Arrays.sort(Myarray);
			
			int len = Myarray.length;
			for(int i=0;i<len-1;i++) {
				if(Myarray[i]==Myarray[i+1])
					System.out.println(Myarray[i]);
			}
		
}

}
