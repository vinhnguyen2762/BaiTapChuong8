/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapchuong8;

/**
 *
 * @author ADMIN
 */
public class BaiTapChuong8 {

    public static void main(String[] args) {
        Context context = new Context();
        
        // Đăng ký thành công
        State success = new Success();
        success.doAction(context);
        System.out.println(context.getState().toString());
        
        // Đăng ký thất bại
        State fail = new Fail();
        fail.doAction(context);
        System.out.println(context.getState().toString());
    }
}
