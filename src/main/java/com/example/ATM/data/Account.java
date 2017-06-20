package com.example.ATM.data;

/**
 * Created by student on 6/20/17.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Account {

    @Id
    @NotNull
    @Min(0)
    private int acctNum;

    //private int pin;
    //private String userName;
    //private BigDecimal balance2;

    @NotNull
    private float balance;

    /*
    public Account(int  anAcct,int aPin, String aUserName, BigDecimal aBalance) {
        acctNum = anAcct;
        pin = aPin;
        userName = aUserName;
        balance2 = aBalance;

    }
    public Account(int  anAcct,BigDecimal aBalance)
    {
        acctNum = anAcct;
        balance2 = aBalance;

    }
    */
    public Account()
    {
        balance=0;
    }

    public Account(int  anAcct,float aBalance)
    {

        acctNum = anAcct;

        balance = aBalance;

    }

    public int getAcctNum()
    {

        return acctNum;
    }
    public void setAcctNum(int aAcct)
    {
        acctNum=aAcct;
    }
    /*
    public String getUser()
    {
        return userName;
    }
    public int getPin()
    {
        return pin;
    }
    */
    public void setBalance(float abalance)
    {
        balance=abalance;

    }
    public float getBalance()
    {
        return balance;
    }

    public float depositFunds(float amt)
    {
        balance+=amt;
        return balance;
    }
    public float withdrawFunds(float amt)
    {
        balance-=amt;
        return balance;
    }

    /*public BigDecimal getBalance2()
    {
        return balance2;
    }
    public void setBalance2(BigDecimal newBal)
    {
        balance2 =newBal;
    }
*/

}
