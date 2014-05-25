/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openSAPdto.cheque;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import openSAPdto.core.Fund;

@Entity
public class Cheque {

    @Id
    @GeneratedValue
    private int check_id;
    private String PAY_TO;
    @Embedded
    private Fund amount;
    private String from_account;
    private int check_type;
    // value to be filled frmo checkType.ACC_DETAILS
    private Date checkq_date;
//
//    public String getCheck_id() {
//        return check_id;
//    }
//
//    public void setCheck_id(String check_id) {
//        this.check_id = check_id;
//    }

    public Cheque() {
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public String getPAY_TO() {
        return PAY_TO;
    }

    public void setPAY_TO(String PAY_TO) {
        this.PAY_TO = PAY_TO;
    }

    public Fund getAmount() {
        return amount;
    }

    public void setAmount(Fund amount) {
        this.amount = amount;
    }

    public String getFrom_account() {
        return from_account;
    }

    public void setFrom_account(String from_account) {
        this.from_account = from_account;
    }

    public int getCheck_type() {
        return check_type;
    }

    public void setCheck_type(int check_type) {
        this.check_type = check_type;
    }

    public Date getCheckq_date() {
        return checkq_date;
    }

    public void setCheckq_date(Date checkq_date) {
        this.checkq_date = checkq_date;
    }

    @Override
    public String toString() {
        return "[" + this.getCheck_id() + "]"
                + "{"
                + "PAY_TO:" + this.PAY_TO + ""
                + " ,PAY FROM:" + this.from_account + ""
                + " ==> " + this.getAmount() + "}";
    }
}
