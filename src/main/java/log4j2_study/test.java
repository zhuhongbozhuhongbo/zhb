package log4j2_study;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class test {

    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static boolean hello(){
        logger.trace("entry");	//��ͬ��logger.entry();���˷������°汾�����Ѿ�����

        logger.error("Did it again!");

        logger.info("����info����Ϣ");

        logger.debug("����debug����Ϣ");

        logger.warn("����warn����Ϣ");

        logger.fatal("���ش���");

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
