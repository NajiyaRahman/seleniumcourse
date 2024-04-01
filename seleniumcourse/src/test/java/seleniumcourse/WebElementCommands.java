package seleniumcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void webElementCommands()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement radioButton=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partialLink=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement nameExample=driver.findElement(By.name("keywords"));
		WebElement tagname=driver.findElement(By.tagName("div"));
		WebElement cssselect=driver.findElement(By.cssSelector("button#button-one"));
		WebElement combination=driver.findElement(By.cssSelector("div.header-top"));
		WebElement csscombination=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.browserQuit();
		

	}

}
