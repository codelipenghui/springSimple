package simple.spring.ioc.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lipenghui on 2017/1/10.
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isBlank(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }

        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId) {
        return (T)context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clazz) {
        return (T)context.getBean(clazz);
    }

}
