package MapU;

import java.util.*;

public class UseMap {
    public static void  main(String[] args){
        // 新建存在三个person实例的list
        List<Person> list = new ArrayList<>(Arrays.asList(new Person("ming", 12), new Person("hong", 15),
                new Person("jun", 18)));

        // 新建String-person的map
        Map<String, Person> map = new HashMap<>();

        //put添加map元素
        for(Person p : list){
            map.put(p.getName(), p);
        }

        //Map是key-value的元素对，可以通过key查找value
        System.out.println(map.get("ming"));

        //使用keyset()遍历map的key
        // key的顺序是随机的
        // 如果需要以key排序输出，需要将Hashmap改成TreeMap
        for(String key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }


        //可以传入compartor对象来修改key的排序方式
        List<Person> list2 = new ArrayList<>(Arrays.asList(new Person("ming", 12), new Person("hong", 15),
                new Person("jun", 18)));
        Map<String, Person> map2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });
        for(Person p : list){
            map.put(p.getName(), p);
        }
        // 此时key按字母倒序输出
        for(String key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }

        // 使用entryset同时遍历key和value
        for(Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
