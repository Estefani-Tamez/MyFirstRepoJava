package Steps;


import Page.HomePage;

public class FormSteps extends HomePage {


    public void enterFirstName (){
        String FIRST_NAME = "Estefani";
        this.first_name.sendKeys(FIRST_NAME);

    }

    public void  click_Highest_level_of_education () {

        this.college.click();
    }


}
