/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package openSAPdto.core;

/**
 *
 * @author GhostMachine
 */
public class Fund {
    private float amount_in_numbers;
    private String amount_in_words;
    

    public Fund() {
        this.amount_in_numbers=0;
        this.amount_in_words="Zero rupees only";
    }

    public Fund(float amount_in_numbers, String amount_in_words) {
        this.amount_in_numbers = amount_in_numbers;
        this.amount_in_words = amount_in_words;
    }
    
    

    public float getAmount_in_numbers() {
        return amount_in_numbers;
    }

    public void setAmount_in_numbers(float amount_in_numbers) {
        this.amount_in_numbers = amount_in_numbers;
    }

    public String getAmount_in_words() {
        return amount_in_words;
    }

    public void setAmount_in_words(String amount_in_words) {
        this.amount_in_words = amount_in_words;
    }
    
    
    
}
