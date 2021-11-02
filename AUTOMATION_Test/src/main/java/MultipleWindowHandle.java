import com.TestBase.Base;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowHandle extends Base {
    public static void main(String[] args) {
        Chrome_launch();
        OpenUrl("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[3]/img")).click();
        Set<String> handles= driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String ParentWindowId= it.next();
        System.out.println("Parent Window Id: "+ParentWindowId);
        String ChildrenWindowId= it.next();
        System.out.println("Childrenwindow id: "+ChildrenWindowId);

        //Switching
        driver.switchTo().window(ChildrenWindowId);
        System.out.println("Pararent Window Url: "+driver.getCurrentUrl());
        driver.switchTo().window(ParentWindowId);
        System.out.println("Parent Window Url: "+driver.getCurrentUrl());
        driver.navigate().to("https://www.google.com");
        System.out.println("parent new webpage Title: "+driver.getTitle());
        driver.quit();

    }


}
