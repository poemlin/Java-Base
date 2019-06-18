package Logger;



import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getGlobal();
        // logger.setLevel(Level.WARNING);
        logger.info("Create new person..."); //.info创建log信息

        Person p = new Person("xiao ming");
        System.out.println(p.hello());

        try{
            new Person(null);

        }catch (Exception e){
            logger.log(Level.WARNING, "Create new person failed", e);

        }

        logger.info("Program end.");
    }
}

/*
logger代替print，且更加具体

info是默认级别，可以设置改变显示级别

.info方法输出默认信息

.log方法输出指定的级别

.warnning输出警告的信息
 */
