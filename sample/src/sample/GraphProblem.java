package sample;

import java.util.HashMap;
import java.util.*;

public class GraphProblem {


    public static boolean existPath(int[] A, int[] B, int N) {

        if ((A == null) || (B == null) || (A.length == 0) || (B.length == 0) || (N == 0)) {
            return false;
        }

        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.get(A[i]).add(B[i]);
            } else {
                HashSet<Integer> setA = new HashSet<>();
                setA.add(B[i]);
                map.put(A[i], setA);
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                map.get(B[i]).add(A[i]);
            } else {
                HashSet<Integer> setB = new HashSet<>();
                setB.add(A[i]);
                map.put(B[i], setB);
            }
        }

        for (int i = 1; i < N; i++) {
            if (map.containsKey(i)) {
                Set<Integer> set = map.get(i);
                if (!set.contains(i + 1)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int N=3;
        int[] A = {1,3};
        int[] B = {2,2};
        System.out.println(existPath(A,B,N));
    }
}
