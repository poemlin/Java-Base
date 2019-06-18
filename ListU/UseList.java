package ListU;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UseList {
    public static void main(String[] args){
        //向上转型List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");

        // 三种遍历方式

        for(int i = 0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

        for(Iterator<String> it = list.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

        for(String s : list){
            System.out.println(s);
        }

        // list转换成array
        String[] ss = list.toArray(new String[list.size()]);

        // array 转换成list
        List<String> list2 = new ArrayList<>(Arrays.asList(ss));

        //查找元素
        System.out.println(list.contains("apple"));

        System.out.println(list.indexOf("pear"));
    }
}
