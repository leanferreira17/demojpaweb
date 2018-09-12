package net.leanif17.demojpaweb.models;

import org.springframework.beans.factory.annotation.Required;

public class Profession {
    private String title;
    private float anual_salary;

    public String getTitle() {
        return title;
    }

    @Required
    public void setTitle(String title) {
        this.title = title;
    }

    public float getAnual_salary() {
        return anual_salary;
    }

    @Required
    public void setAnual_salary(float anual_salary) {
        this.anual_salary = anual_salary;
    }
}
