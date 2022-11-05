package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	@FindBy (id="add")
	private WebElement plus;
	
	@FindBy (xpath="(//button[text()=' Add to Cart'])")
	private WebElement cartbtn; 
	
	public Addtocartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

    public WebElement getaddcartbtn() {
	
	return plus;
}
    
    public void addcartbtn() 
    {
  	   cartbtn.click();
     }
}
