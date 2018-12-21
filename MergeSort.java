import javax.swing.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class hwOne {
	private static final int SENTINEL = 0;

	public static void insertionSort(int A[])
	{
		Integer key =0;
		Integer i=0;
		for(int j = 1; j < A.length; j++)
		{
			key = A[j];
			i = j - 1;
			while((i>=0)&&(A[i]>key))
			{
				A[i+1] = A[i];
				i = i - 1;	
			}
			A[i+1] = key;
		}
	}
	public static void sort(int[] A,int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q ;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		int i=0;
		int j=0;
		for(i=0; i < n1;i++)
		{
			L[i]= A[p+i];
			
		}
		for(j = 0; j <n2; j++)
		{
			R[j]= A[q+j+1];
		}
		
		i=0;
		j=0;
		int k = p;
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				A[k] = L[i];
				i++;
			}
			else
			{
				A[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			A[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	public static void mergeSort(int A[],int p, int r)
	{
		if(p < r)
		{
			int q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			sort(A,p,q,r);		
		}
	}
	
	public static void printAll(int A[])
	{
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int A[] = {20,15,18,7,16,19,14,3,12,11,10,9,8,17,6,5,4,13,2,1};
		
		int length = A.length;
		mergeSort(A,0,length-1);
		
		printAll(A);
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("\n\nRunning Time: "+ duration + " ns"); 	
	}
}


