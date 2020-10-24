package com.weborders.Pages;

import com.weborders.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "ct100_MainContent_username")
    private WebElement usernameElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
