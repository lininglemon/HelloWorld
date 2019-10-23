import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testCase1(){
        Assert.assertEquals("Hello World!",new HelloWorld().sayHello());
        Assert.assertEquals(2,new HelloWorld().Switch(2));
        System.out.println("testCase1");
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("Hello World!",new HelloWorld().sayHello());
        Assert.assertEquals(2,new HelloWorld().Switch(2));
        Assert.assertEquals(1,new HelloWorld().Switch(1));
        Assert.assertEquals(3,new HelloWorld().Switch(3));
        System.out.println("testCase2");
    }

}
