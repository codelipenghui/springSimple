package simple.spring.ioc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import simple.spring.ioc.SayHelloInterface;

/**
 * Created by lipenghui on 2017/1/10.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class SayHelloTest extends UnitTestBase {

    public SayHelloTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void sayHello(){
        SayHelloInterface sayHelloInterface = super.getBean("sayHelloInterface");
        System.out.println(sayHelloInterface.sayHello("lipenghui"));;
    }
}
