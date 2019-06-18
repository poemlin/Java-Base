package java_base;

public class forA {
    public static void main(String[] args){
        int[] arr = {1, 4, 9, 16, 25};
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

/*

数组定义方式 大括号

for里面有三个条件，初始计数器，循环条件，更新计数器。

三个条件都可以省略 但是不建议

计数器初始化定义建议在for内部定义 局部参数

循环体内部不建议修改计数器




 */