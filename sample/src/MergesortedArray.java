
public class MergesortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2={4,5,6};
		int n=3;
		int m=3;
		int end2=n-1;
		int end1=m-1;
		int p1=nums1.length-1;
		while(p1!=end1) {
		if(nums2[end2]>nums1[end1]) {
			nums1[p1]=nums2[end2];
			end2--;
			p1--;
		}else if(nums1[end1]>nums2[end2]) {
			nums1[p1]=nums1[end1];
			end1--;
			p1--;
		}else {
			nums1[p1]=nums1[end1];
			p1--;
			end1--;
		}
		}
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
		

	}

}
