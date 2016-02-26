/*
 *
 */
/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, count;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int count) {
 *         this.start = start;
 *         this.end = end;
 *         this.count = count;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class SegmentTreeQueryII {

    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The count number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        if (root == null || end < root.start || start > root.end) {
            return 0;
        }
        if (start <= root.start && end >= root.end) {
            return root.count;
        }
        return query(root.left, start, end) + query(root.right, start, end);
    }

}
