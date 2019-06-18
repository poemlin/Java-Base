package java_base;

public class ifString {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "HELlo".toLowerCase();
        if(s1 == s2){
            System.out.println("s1=s2");
        }

        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)");
        }
    }
}

/*
引用类型判断用equals
 */