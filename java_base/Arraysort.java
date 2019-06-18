package java_base;

import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        // 排序:
        Arrays.sort(ns);
        // 排序后:
        System.out.println(Arrays.toString(ns));
    }
}

/*
直接使用Arrays.sort(ns)对数组进行排序

冒泡排序和这里的排序都对原数组进行了改变，原数组发生了变化
 */