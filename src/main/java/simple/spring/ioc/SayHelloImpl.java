package simple.spring.ioc;

/**
 * Created by lipenghui on 2017/1/10.
 */
public class SayHelloImpl implements SayHelloInterface {


    @Override
    public String sayHello(String text) {

        String result = "Say Hello : " + text;
        return result;
    }
}
