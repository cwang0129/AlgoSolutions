/*
 * Given a permutation which contains no repeated number, 
 * find its index in all the permutations of these numbers, 
 * which are ordered in lexicographical order. The index 
 * begins at 1.

Example
Given [1,2,4], return 1.
 */
public class PermutationIndex {

    /**
     * @param A an integer array
     * @return a long integer
     */

    public long permutationIndex(int[] A) {
        long result = 1;
        
    }

    public long permutationIndex(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return A.length;
        }
        int[] subA = Arrays.copyOfRange(A, 1, A.length);
        int firstItem = A[0];
        Arrays.sort(A);
        long factorial = 1;
        for (int i = 0; i < subA.length; ++i) {
            factorial *= i + 1;
        }
        int index = 0;
        while (A[index] != firstItem) {
            index++;
        }
        return index * factorial + permutationIndex(subA);
    }

}