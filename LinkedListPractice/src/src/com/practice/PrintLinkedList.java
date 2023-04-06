package src.com.practice;

public class PrintLinkedList {
	public static int  func(int[]A, int M) {
		int N = A.length;
		boolean flag=false;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 1;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                	flag=true;
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return flag==true?A[index]:A[0];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 3, 1, 3, 1};
		int M=3;
		int ans=PrintLinkedList.func(A,M);
		System.out.println(ans);
		
	}

}
