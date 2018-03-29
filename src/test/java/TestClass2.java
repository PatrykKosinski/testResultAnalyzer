import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

    @Test
    public void test1(){
        System.out.println(this.getClass().getName() + "test nr 1");
        Assert.fail();
    }

    @Test
    public void test2(){
        System.out.println(this.getClass().getName() + "test nr 2");
        Assert.fail();

    }

    @Test
    public void test3(){
        System.out.println(this.getClass().getName() + "test nr 3");
        Assert.fail();



    }

    @Test
    public void test4(){
        System.out.println(this.getClass().getName() + "test nr 4");
        Assert.fail();

    }

    @Test
    public void test5(){
        System.out.println(this.getClass().getName() + "test nr 5");
    }



}
