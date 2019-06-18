package StringB;

public class Main {
    public static void main(String[] args){
        String name = "world";
        StringBuilder sb = new StringBuilder();
        sb.append("hello ").append(name).append("!");
        String s = sb.toString();
        System.out.println(s);
    }
}


/*
string是不可变对象，在拼接时会频繁生成多个string实例

stringbulider可以高效拼接字符串

stringbuilder可以支持链式操作
 */