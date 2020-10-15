package loggingTutorial;

import org.apache.log4j.Logger;

/**
 * @Description
 * @Author Dinglong Zhang
 * @Date 2020-10-13 20:11
 */
public class test {
    //得到记录器
    private static Logger logger = Logger.getLogger(test.class);


    public static void main(String[] args) {
        logger.info("INFO");
        logger.debug("DEBUG");
        logger.warn("WARN");
        logger.error("ERROR");
    }
}
