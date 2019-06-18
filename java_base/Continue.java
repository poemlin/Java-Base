package java_base;

public class Continue {
    public static void main(String[] args) {
        int[] ns = { 31, 21, 22, 73, 79, 56, 7, 83, 19, 12, 53, 84, 68 };
        int sumOfOdds = 0;
        for (int n : ns) {
            if (n % 2 == 0) {
                System.out.println("skip " + n);
                continue;
            }
            sumOfOdds = sumOfOdds + n;
        }
        System.out.println(sumOfOdds);
    }
}


/*
continue 提前结束当前循环，继续下一轮循环

下一轮循环前 计数器更新
 */