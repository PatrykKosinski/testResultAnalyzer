import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestClass1 {

    private Properties properties = new Properties();
    private InputStream inputStream;



    @Test
    public void test1(){
        System.out.println(this.getClass().getName() + "test nr 1");

        try {
            inputStream = new FileInputStream("src/main/resources/user.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String username = properties.getProperty("name");

        System.out.println(username);


        String valueFromMaven = System.getProperty("propertyName");
        System.out.println(valueFromMaven);



    }

    @Test
    public void test2(){
        System.out.println(this.getClass().getName() + "test nr 2");

    }

    @Test
    public void test3(){
        System.out.println(this.getClass().getName() + "test nr 3");

    }

    @Test
    public void test4() {
        System.out.println(this.getClass().getName() + "test nr 4");
    }

    @Test
    public void test5(){
        System.out.println(this.getClass().getName() + "test nr 5");

    }



}
