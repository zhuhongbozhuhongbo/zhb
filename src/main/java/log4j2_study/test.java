package log4j2_study;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class test {

    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static boolean hello(){
        logger.trace("entry");	//等同于logger.entry();但此方法在新版本好像已经废弃

        logger.error("Did it again!");

        logger.info("这是info级信息");

        logger.debug("这是debug级信息");

        logger.warn("这是warn级信息");

        logger.fatal("严重错误");

        logger.trace("exit");

        return false;
    }

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("mylog");
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }

}
