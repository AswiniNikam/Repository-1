package sample;

public class RemoveOccuranceOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,2,3};
		 int i=0;int k=0;int val=3,j=0;
		 int[] result=new int[arr.length];
	        while(i<arr.length){
	            if(arr[i]==val){
	                i++;
	            }else {
	            	result[j]=arr[i];	               
	            	k++;
	                i++;
	                j++;
	            }
	        }
	        for(i=0;i<result.length;i++) {
	    System.out.println(result[i]);
	        }

	}

}
