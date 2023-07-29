package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class democode {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.smartbazaar.co.uk/");

        //   driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);       //implicit wait

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='sgpb-popup-close-button-2']")).click();   //pop-up


        driver.findElement(By.xpath("//div[@class='sp-arrow sp-next-arrow']")).click();   //click on the offer slides in the top

        driver.findElement(By.xpath("//input[@class='aws-search-field']")).sendKeys("frozen", Keys.ENTER);    //enter data in the search field

        Thread.sleep(2000);

        WebElement samosa = driver.findElement(By.xpath("//h4//a[.=' Humza Vegetable Samosas (20 pcs) ']"));  //click on samosa
        samosa.click();
        /*String ss = samosa.getText();
        //String ele1=" Humza Vegetable Samosas (20 pcs) ";
        // if(ss.equals(ele1)) {
                //samosa.click();
                //  String url="https://www.smartbazaar.co.uk/product/humza-vegetable-springrolls-20pcs-2/";
                // Assert.assertEquals("https://www.smartbazaar.co.uk/product/humza-vegetable-springrolls-20pcs-2/","url");
                // System.out.println(" last");
            }
*/
/* Adding an item to wsihlist and checking the wishlist */

         driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
        WebElement wishlist = driver.findElement(By.xpath("(//a[@class='wishlist_products_counter top_wishlist-heart top_wishlist- wishlist-counter-with-products'])[1]/span[@class='wishlist_products_counter_number']"));
        String countwishlist = wishlist.getText();
        if (countwishlist.equals(0))
        {
            System.out.println("wishlist is empty, add item to wish list");
        }
        else
        {
            System.out.println(countwishlist);
        }
    }
}
