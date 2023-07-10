package com.epam.tc.jdi;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.tc.jdi.entities.User;

public class LoginForm extends Form<User> {
    @FindBy(id = "name")
    private TextField name;
    @FindBy(id="password")
    private TextField password;
    @FindBy(id = "login-button")
    private Button submit;
}
