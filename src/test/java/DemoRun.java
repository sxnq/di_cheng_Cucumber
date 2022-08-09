import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith注解就是指定运行的是黄瓜测试框架，
//@CucumberOptions则是指定对应的feature文件所在的位置，此处是src目录下的test下的resources文件夹。
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/mini.feature")
public class DemoRun {
}
