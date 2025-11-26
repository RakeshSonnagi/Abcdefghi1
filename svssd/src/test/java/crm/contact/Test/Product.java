package crm.contact.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product {

	@FindBy(xpath ="//input")
	private WebElement createproductpage;

	public WebElement getCreateproductpage() {
		return createproductpage;
	}

	 

}
