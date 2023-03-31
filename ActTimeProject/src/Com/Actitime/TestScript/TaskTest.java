package Com.Actitime.TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import Com.ActiTimeGenericLibrary.BaseClass;
import Com.ActiTimeGenericLibrary.FileLibrary;
import Com.Actitime.pom.HomePage;
import Com.Actitime.pom.TaskPage;

public class TaskTest extends BaseClass{
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getTaskLink().click();
	
		TaskPage tp = new TaskPage(driver);
		tp.getAddNewBtn().click();
		tp.getNewCustomer().click();
		FileLibrary f = new FileLibrary();
		String AxisName = f.readDatafromexcelFile("Sheet1",4, 1);
		tp.getCustName().sendKeys(AxisName);
		String desc = f.readDatafromexcelFile("Sheet1", 4, 2);
		tp.getCustDescp().sendKeys(desc);
		tp.getCreateCust().click();
		
		
	}

}
