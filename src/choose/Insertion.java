package choose;

import model.Example;

/**
 * Created by 13260 on 2017/8/31.
 */
public class Insertion extends Example {

    /**
     * 插入排序，遍历数组，将当前值和这个值左边的值进行比较，插入到左边有序队中。
     * 例如  4895
     * 首先 第一位4确定
     * 然后读到 8  8>4 因此不变
     * 然后督导 9  9>8 因此不变
     * 最后读到 5  5<9 5<8  5>4,因此将5插入到4和8之间
     * 4589
     * 在这里没有直接插入，而是直接比较当前值和其左边的值的大小，如果大于则不变，如果小于则交换位置，继续比较
     *
     * 当一个数组有序度越高的时候，插入排序的消耗就越少。
     * @param a
     */
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0;i<N;i++){
            for (int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

}
