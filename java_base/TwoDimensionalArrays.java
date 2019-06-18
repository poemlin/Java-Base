package java_base;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] stds = {
                // 语文, 数学, 英语, 体育
                { 68, 79, 95, 81 },
                { 91, 89, 53, 72 },
                { 77, 90, 87, 83 },
                { 92, 98, 89, 85 },
                { 94, 75, 73, 80 }
        };
        System.out.println(stds.length);
        System.out.println(Arrays.toString(stds));
        System.out.println(Arrays.deepToString(stds));
        // 获取每个学生的平均分:
        for (int[] std : stds) {
            // std: [68, 79, 95, 81]
            int sum = 0;
            for(int k : std){
                sum += k;
            }
            int avg = sum / std.length;
            System.out.println("Average score: " + avg);
        }
        // 获取语文、数学、英语、体育的平均分:
        int[] sums = { 0, 0, 0, 0 };
        for (int[] std : stds) {
            for(int i = 0; i<sums.length; i++){
                sums[i] += std[i];
            }

        }
        System.out.println("Average Chinese: " + sums[0] / stds.length);
        System.out.println("Average Math: " + sums[1] / stds.length);
        System.out.println("Average English: " + sums[2] / stds.length);
        System.out.println("Average Physical: " + sums[3] / stds.length);
    }
}

/*
多维数组是数组的数组

打印多维数组使用Arrays.deepToString

 */