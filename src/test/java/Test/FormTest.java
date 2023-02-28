package Test;

import Step.*;
import Steps.FormSteps;


public class FormTest {

    public void submitForm() {

        FormSteps actions = new FormSteps();
        actions.enterFirstName();
        actions.click_Highest_level_of_education();
    }

}
