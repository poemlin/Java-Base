import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 2, 5, 7};
        System.out.println(arr); //[I@61bbe9ba
        System.out.println(Arrays.toString(arr));
    }
}

/*
Arrays.toString()快速打印数组

直接打印数组是地址
 */