package ListU;

1. list按照元素的先后顺序存放，每个元素可以通过索引确定自己的位置。类似数组，但大小可变

2. list<E>是一种有序链表，支持泛型
void add(E e)   //在末尾添加一个元素
void add(int index, E e)    //指定索引添加一个元素
int remove(int index)   //删除指定索引元素
int remove(Object e)    //删除某个元素
E get(int index)    //获取指定索引的元素
int size()  //链表大小

3. 数组删除元素时，需要移动元素。list是链表

4. ArrayList和LinkedList是两种不同的List实现，优先使用ArrayList

5. list元素可以重复，元素可以为null;
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(2);
list.add(null);
list.add(3);
list.size(); //5

6. 遍历list：
a. 通过get(index)
List<String> li = new ArrayList<>();
for(int i = 0; i<li.size(); i++){
    String s = li.get(i);
}

b.使用Iterator<E>
List<String> li = new ArrayList<>();
for(Iterator<String> it = li.iterator(); it.hasNext();){
    String s = it.next();
}

c.for each
List<String> li = new ArrayList<>();
for( String s : li){

        }

7. list转换成array
list.toArray()

8. array转换成list
Arrays.asList(array)

9.使用contains()和indexOf()查找元素