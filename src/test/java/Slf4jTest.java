import com.baidu.logging.util.Slf4jUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.util.Date;

public class Slf4jTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void test01(){
        LOGGER.info("修复数据成功!{}", new Date());
    }

    @Test
    public void test02(){
        try {
            FileInputStream inputStream = new FileInputStream("");
        } catch (Exception e) {
            Slf4jUtil.error("test04", e);
        }
    }

}
