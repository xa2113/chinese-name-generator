package com.eileen.chinesenamegenerator.logic;

public class InputName {

    private String inputName;
    private String inputNameMeaning;

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputNameMeaning() {
        return inputNameMeaning;
    }

    public void setInputNameMeaning(String inputNameMeaning) {
        this.inputNameMeaning = inputNameMeaning;
    }

    @Override
    public String toString() {
        return "InputName{" +
                "inputName='" + inputName + '\'' +
                ", inputNameMeaning='" + inputNameMeaning + '\'' +
                '}';
    }
}
