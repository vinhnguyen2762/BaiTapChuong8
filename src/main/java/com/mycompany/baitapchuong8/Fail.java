/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong8;

/**
 *
 * @author ADMIN
 */
public class Fail implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Registered borrow book failed");
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "Fail State";
    }
    
}
