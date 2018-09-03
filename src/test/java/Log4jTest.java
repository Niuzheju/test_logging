import com.baidu.logging.util.Log4jUtil;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileInputStream;

/**
 * log4j测试
 * 级别:
 * off         最高等级，用于关闭所有日志记录。
 * fatal       指出每个严重的错误事件将会导致应用程序的退出。
 * error      指出虽然发生错误事件，但仍然不影响系统的继续运行。
 * warm     表明会出现潜在的错误情形。
 * info         一般和在粗粒度级别上，强调应用程序的运行全程。
 * debug     一般用于细粒度级别上，对调试应用程序非常有帮助。
 * all           最低等级，用于打开所有日志记录。
 */
public class Log4jTest {

    private static final Logger logger = Logger.getLogger(Log4jTest.class);

    @Test
    public void test01() {
        //默认配置,不使用配置文件
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.info("info");
        logger.debug("debug");
        logger.warn("warning");
        logger.error("error");
    }

    @Test
    public void test02(){
        logger.info("测试日志!");
    }

    @Test
    public void test03(){
        Log4jUtil.info("修复数据成功!");
    }

    @Test
    public void test04(){
        try {
            FileInputStream inputStream = new FileInputStream("");
        } catch (Exception e) {
            Log4jUtil.error("test04", e);
        }

    }

}
