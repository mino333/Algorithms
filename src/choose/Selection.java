package choose;

import model.Example;

/**
 * Created by 13260 on 2017/8/31.
 */
public class Selection extends Example{

    /**
     * 选择排序，选择第几小的值放在第几的位置，最小放在第一位，最大放在最后一位
     * @param a
     */
    public static void sort(Comparable[] a){
        int N = a.length;


        for (int i=0;i<N;i++){
            int min = i ;
            for (int j=i+1;j<N;j++){
                if (less(a[j],a[min]))
                    min = j;
                exch(a,i,min);
            }
        }
    }
}
