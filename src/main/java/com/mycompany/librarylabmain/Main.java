/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librarylabmain;

import com.mycompany.librarylab.Employee;//this class I made!!

/**
 *
 * @author soblab
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(10);
        e.setDept("Garden");
        e.setName("Nick");
        
        System.out.println(e.toString());
    }
}
