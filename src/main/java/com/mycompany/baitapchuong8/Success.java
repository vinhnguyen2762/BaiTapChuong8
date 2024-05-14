/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong8;

/**
 *
 * @author ADMIN
 */
public class Success implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Registered borrow book successfully");
        context.setState(this);
    }
    
    @Override
    public String toString() {
        return "Success State";
    }
    
}
