package model;

/**
 * Created by 13260 on 2017/8/31.
 */
public class Example {
    public static void sort(Comparable[] a){
    }

    protected static boolean less (Comparable v,Comparable w){
        //判断v 是否大于 w
        return v.compareTo(w)<0;
    }

    protected static void exch(Comparable[] a,int i,int j){
        //交换a[] 中的第 i-1 和 j-1 这两个元素
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    protected static void show(Comparable[] a){
        //将a[]中的元素在一行打印出来
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static boolean isSorted(Comparable[] a){

        //判断a[]是否是从小到大排列的
        for (int i =1;i<a.length;i++){
            if (less(a[i],a[i-1]))
                return false;
        }
        return true;
    }


}
