package Enum;

public class Main {
    public static void  main(String[] args){
        for(Weekday day : Weekday.values()){
            System.out.println(day.name());
        }


        Weekday fri = Weekday.FRI;
        System.out.println(fri.name());

        System.out.println(Weekday.valueOf("FRI").name());
    }
}
