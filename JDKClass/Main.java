package JDKClass;

import java.security.SecureRandom;
import java.util.Random;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void  main(String[] args){
        // Math
        Math.pow(2, 10); //1024
        Math.sqrt(2); //1.414
        Math.exp(2);
        Math.log(4);
        Math.log10(100); //2
        Math.sin(Math.PI / 6); //0.5
        Math.cos(Math.PI / 3); //0.5
        double pi = Math.PI;
        double e = Math.E;

        //Math.random
        double x1 = Math.random(); //0<= x1 <1

        // 生成一个区间随机数
        long MIN = 1000;
        long MAX = 9000;
        double x2 = Math.random() * (MAX-MIN) +MIN;
        double r = (long) x2;

        // Random
        Random rnd = new Random(12345);
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt());

        // SecureRandom
        SecureRandom sc;
        sc = new SecureRandom();
        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());

        // BigInteger
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));

        // BigDecimal
        BigDecimal bd = new BigDecimal("123.10");
        System.out.println(bd.multiply(bd));


    }
}

/*
给定种子后，伪随机数算法会生成完全相同的序列，不给定种子，使用当前系统时间戳。都是伪随机。

SecureRandom可以创建安全的随机数

BigInteger和BigDecimal可以进行更精确的计算（软件模拟）
 */