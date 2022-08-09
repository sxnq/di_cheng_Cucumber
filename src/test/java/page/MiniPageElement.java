package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MiniPageElement {
	
	public WebDriver pageDriver;
	
	// 通过构造函数 把 webdriver传给页面，这样可以使用pageObject将元素抽离出来在，通过page来调用页面元素
	
	public MiniPageElement(WebDriver driver){
		
		this.pageDriver = driver;
		PageFactory.initElements(pageDriver, this);
		
	}
	
	@FindBy(how = How.XPATH,using="//div[@class='imgIcon ico0']")
	public WebElement imgIcon_ico0;

	@FindBy(how = How.XPATH,using="//a[@class='close']")
	public WebElement close;


	
	

	
	
	
	
	
	
	
	
	
}
