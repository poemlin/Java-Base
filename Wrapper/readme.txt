package Wrapper;

1. java的数据类型：
基本类型：int bool float
引用类型：所有class类型

基本类型不能视为对象（引用类型）：
int n = null; //error

2. 可以定义一个Integer类，包含一个int字段，这就是int的包装类型

Integer n = null;
Interger n2 = new Interger(99);

3.JDK为每一个基本类型都创建了对应的包装类型：

4. 相互转换
int i = 100;
Interger n = new Integer(99);
Integer n1 = new Integer(i);
Integer n2 = Integer.valueOf(i);
Integer n3 = Integer.valueOf("100");

int x1 = n1.intValue();
int x2 = Integer.parseInt("100");

String s = n1.toString();

5. 编译器可以自动装箱和拆箱
Integer n = 99; //自动装箱
int i = n //自动拆箱

6. 包装类型定义了一些常用的静态变量
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;
int sizeofLong = Long.SIZE;

7. 所有包装类型都继承自Number,可以向上转型
Number n = new Integer(999);
