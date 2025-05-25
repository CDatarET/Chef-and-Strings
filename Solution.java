import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int c = 0; c < cases; c++){
		    int l = scan.nextInt();
		    long[] nums = new long[l];
		    for(int i = 0; i < l; i++){
		        long t = scan.nextLong();
		        nums[i] = t;
		    }
		    
		    long sum = 0;
		    for(int i = 0; i < l-1; i++){
		        sum = sum + Math.abs(nums[i] - nums[i+1]) - 1;
		    }
		    System.out.println(sum);
		}
	}
}
