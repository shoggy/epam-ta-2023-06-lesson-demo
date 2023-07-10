package com.epam.tc.jdi;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Icon;
import com.epam.tc.jdi.entities.User;

public class JdiHomePage extends WebPage {

    @FindBy(css = ".benefit")
    private WebList benefits;

    @FindBy(id = "user-name")
    private Label userName;

    @FindBy(id = "user-icon")
    public Icon userIcon;

    private LoginForm loginForm;

    public int getBenefitsCount() {
        return benefits.size();
    }

    public void login(User user) {
        userIcon.click();
        loginForm.login(user);
    }

    public String getUserName() {
        return userName.getText();
    }
}
