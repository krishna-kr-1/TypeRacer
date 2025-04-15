package Full;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class typeRacerMain {

	public static void main(String[] args) {
		typeRacerMain ob = new typeRacerMain();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://play.typeracer.com/");
		driver.manage().window().maximize();
		ob.EnterRace(driver);
		ob.StartRace(driver);
	}

	public void EnterRace(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,350)");
		driver.findElement(By.xpath("//*[@class = 'gwt-Anchor prompt-button bkgnd-green']")).click();
		System.out.println("Entered in Race Track");
	}

	public void StartRace(WebDriver driver) {
		WebElement Words = driver.findElement(By.xpath("//*[@class = 'inputPanel smoothCaretInputBox']"));
		String word = Words.getText();
		word = word.replace("change display format", "").trim();
		System.out.println(word);
		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'txtInput']")));
		driver.findElement(By.xpath("//*[@class = 'txtInput']")).click();
		String[] character = word.split("\\s+");

		for (String w : character) {
		    try {
		        WebElement inputBox = driver.findElement(By.xpath("//*[@class = 'txtInput']"));
		        if (inputBox.isDisplayed() && inputBox.isEnabled()) {
		            inputBox.sendKeys(w);
		            inputBox.sendKeys(" ");
		            Thread.sleep(50);
		        } else {
		            System.out.println("Typing completed...");
		            break;
		        }
		    } catch (NoSuchElementException e) {
		        System.out.println("Typing completed. Input box not found.");
		        break;
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    } catch (ElementNotInteractableException e) {
		        System.out.println("Typing completed.");
		        break;
		    }
		}
		driver.quit();
		return;

	}

}
