import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Tests extends TestsMet{
    @Test
    public void testDragDrop() {
        driver.get("https://jqueryui.com/droppable/");

        WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(frame);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);

        act.dragAndDrop(draggable,droppable).build().perform();

        Assert.assertEquals(droppable.findElement(By.tagName("p")).getText(),"Dropped!");


    }
}
