package edu.kirkwood.java;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean Geraets
 */
public class SumModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private static final Double DEFAULT_USER_NUMBER = 0.0;
    private static final String DEFAULT_ERROR_MESSAGE = "";
    
    private Double userNumber1;
    private Double userNumber2;
    private String userNumberError;
    
    public SumModel(String userNumber1, String userNumber2){
        validateUserNumber1(userNumber1);
        validateUserNumber2(userNumber2);
    }
    public SumModel(){
        validateUserNumber1(null);
        validateUserNumber2(null);
    }
    private void validateUserNumber1(String userNumber){
        if(userNumber == null){
            this.userNumber1 = DEFAULT_USER_NUMBER;
            this.userNumberError = DEFAULT_ERROR_MESSAGE;
        }else if(userNumber.isBlank()){
            this.userNumber1 = DEFAULT_USER_NUMBER;
            this.userNumberError = "No number supplied";
        }else{
            try{
                this.userNumber1 = Double.parseDouble(userNumber);
                this.userNumberError = DEFAULT_ERROR_MESSAGE;
            }catch(NumberFormatException ex){
                this.userNumber1 = DEFAULT_USER_NUMBER;
                this.userNumberError = "Not a number";
            }
        }
    }
    private void validateUserNumber2(String userNumber){
        if(userNumber == null){
            this.userNumber2 = DEFAULT_USER_NUMBER;
            this.userNumberError = DEFAULT_ERROR_MESSAGE;
        }else if(userNumber.isBlank()){
            this.userNumber2 = DEFAULT_USER_NUMBER;
            this.userNumberError = "No number supplied";
        }else{
            try{
                this.userNumber2 = Double.parseDouble(userNumber);
                this.userNumberError = DEFAULT_ERROR_MESSAGE;
            }catch(NumberFormatException ex){
                this.userNumber2 = DEFAULT_USER_NUMBER;
                this.userNumberError = "Not a number";
            }
        }
    }

    public Double getUserNumber1() {
        return userNumber1;
    }

    public void setUserNumber1(String userNumber1) {
        validateUserNumber1(userNumber1);
    }

    public Double getUserNumber2() {
        return userNumber2;
    }

    public void setUserNumber2(String userNumber2) {
        validateUserNumber2(userNumber2);
    }

    public String getUserNumberError() {
        return userNumberError;
    }

}
