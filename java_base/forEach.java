package java_base;

public class forEach {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        for(int n : arr){
            System.out.println(n);
        }
    }
}


/*

foreach 可以遍历所有可迭代对象

无法指定遍历顺序

无法获取索引

 */