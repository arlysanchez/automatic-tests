package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo del producto")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }
    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplay(){
        return lbl_errorMessage.isDisplayed();
    }
}
