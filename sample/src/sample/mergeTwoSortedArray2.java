package sample;

public class mergeTwoSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {4,5,6,0,0,0};
		int[] nums2= {1,2,3};
		int m=3;
		int n=3;
		
		int i=m-1;
		int j=0;
		if(m==0) {
			for(int l=0;l<nums2.length;l++) {
				nums1[l]=nums2[l];
			}
		}else {
		while(i<nums1.length-1||j<nums2.length-1) {
			if(nums2[j]<nums1[i]) {
				nums1[i+1]=nums1[i];
				nums1[i]=nums2[j];
				i++;
				j++;
				}else {
					i++;
					nums1[i]=nums2[j];
					j++;
				}
		}
		}
		for(int l=0;l<nums1.length;l++) {
			System.out.println(nums1[l]);
		}
		
	}

}
