import com.baidu.logging.util.JavaLoggingUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * java 日志
 * 日志级别:
 * SEVERE (最高级别)
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST (最低级别)
 */
public class JavaLoggingTest {

    private static final Logger LOGGER = Logger.getLogger(JavaLoggingTest.class.getName());

    /**
     * 输出到控制台
     */
    @Test
    public void test01() {
        //设置日志级别,只有大于等于此日志级别的才会输出
        LOGGER.setLevel(Level.WARNING);
        LOGGER.log(Level.INFO, "info");
        LOGGER.log(Level.WARNING, "warning");
    }

    /**
     * 输出到文件中
     */
    @Test
    public void test02() throws IOException {
        FileHandler fileHandler = new FileHandler("E:\\test.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);
        LOGGER.log(Level.WARNING, "测试日志");
    }

    @Test
    public void test03() {
        JavaLoggingUtil.setLevel(Level.WARNING);
        JavaLoggingUtil.info("数据修复失败.");
    }

    @Test
    public void test04() {

        try {
            int i = 10 / 0;
        } catch (Exception e) {
            JavaLoggingUtil.error(e);
        }
    }

    @Test
    public void test05(){
        JavaLoggingUtil.error("修复K线数据失败!");
    }
}
