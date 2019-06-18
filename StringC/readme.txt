package StringC;


1. String也是一个类，不需要通过new创建

String a = "hello";
String b = new String("hello")

2. string类一旦创建 类不可变

3. 比较string的内容，通过String.equals()

String s = "hello";
s.equals("Hello");  //false
s.equalsIgnoreCase("Hello") //true

4. String判断是否包含子串
String s = "hello";
s.contains("ll")    //true
s.indexOf("ll")     //2
s.startsWith("he")  //true
s.endsWith("lo")    //true

5. 移除空白
String s = " \t hello\r\n";
String s2 = s.trim();   //"hello"
trim()不改变字符串内容，而是返回新字符串

6. 提取子串
String s = "hello, world";
s.substring(7); // "world"
s.substring(1, 5) //"ello"

7. 大小写转换
String s = "heLLo";
s.toUpperCase(); //"HELLO"
s.toLowerCase(); //"hello"

8. 替换子串
String s = "hello";
s.replace('l', 'w'); //"hewwo"
s.replace("l", "w~"); //"hew~w~o"

9. 拼接字符串
String[] arr = {"A", "B", "C"};
String s = String.join("~~", arr); //"A~~B~~C"

10. 其它数据类型转换成string
String.valueOf(123); //"123"
String.valueOf(true); //"true"
String.valueOf(new object()); //"java.lang.object"

11.string转换成int
int i = Integer.paraseInt("123"); //123

12. String和char[]相互转换
String s = "hello";

char[] cs = s.toCharArray(); //{'h','e','l','l','o'}
String s2 = new String(cs);














