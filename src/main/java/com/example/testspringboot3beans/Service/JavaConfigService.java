package com.example.testspringboot3beans.Service;

public class JavaConfigService {

    private  final String timeOfInitialization;

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    private  Integer dayOfMonth;

    public String hello() {
        return "Hello from java config!" + "time: "+ timeOfInitialization
                + " day: " + dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
}
