package java_base;

public class Break {
    public static void main(String[] args){
        int[] ns = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int sum = 0;
        for (int i = 0; i < ns.length; i++) {
            if (i == 5) {
                System.out.println("break");
                break;
            }
            System.out.println("add ns[" + i + "]");
            sum = sum + ns[i];
        }
        System.out.println(sum);
    }
}

/*

break是跳出循环

多个循环跳出最近的
 */