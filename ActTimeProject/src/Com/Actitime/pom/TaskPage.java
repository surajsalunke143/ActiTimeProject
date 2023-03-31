package Com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TaskPage {
	//declaration 
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomer;
	
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
   private WebElement CustName;
   
    public WebElement getAddNewBtn() {
	return addNewBtn;
}
    @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
    private WebElement CustDescp;
   
     @FindBy(xpath="//div[.='Create Customer']")
     private WebElement createCust;
public WebElement getNewCustomer() {
	return NewCustomer;
}

public WebElement getCustName() {
	return CustName;
}

public WebElement getCustDescp() {
	return CustDescp;
}

public WebElement getCreateCust() {
	return createCust;
}

	
   
     public TaskPage (WebDriver driver)
     {
    	 PageFactory.initElements( driver,this);
     }
     
     
   
   
	
	
	
	

}
