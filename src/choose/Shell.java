package choose;

import model.Example;

/**
 * Created by 13260 on 2017/8/31.
 */
public class Shell extends Example {
    /**
     * 希尔排序————是一种特殊的插入排序
     * 它将一个数组分成由多个元素组成的小数组
     * 对每个小数组进行插入排序
     * 最后比较
     */

    public static void sort(Comparable[] a){
        //将数组a按升序排列，、
        int N =a.length;
        int h =1;
        while (h<N/3)
            h = 3*h+1;
        while (h >= 1) {
            //将数组变为h有序
            for (int i=h;i<N;i++){
                for (int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h = h/3;
        }
    }

}
