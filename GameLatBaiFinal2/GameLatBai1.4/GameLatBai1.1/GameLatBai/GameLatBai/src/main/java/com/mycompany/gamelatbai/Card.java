/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamelatbai;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ezlik
 */
public class Card extends JButton{
    private ImageIcon matTruoc;
    private ImageIcon matSau;
    private boolean anMatTruoc, khongMat;

    public Card(ImageIcon matTruoc, ImageIcon matSau) {
        this.matTruoc = matTruoc;
        this.matSau = matSau;
        setSize(100, 100);
        setFocusable(false);
    }
    public void hienMatTruoc() {
        setIcon(matTruoc);
        anMatTruoc = true;
    }
    public void hienMatSau() {
        setIcon(matSau);
        anMatTruoc = false;
    }
    public void xoaMat(){
        setIcon(null);
        khongMat = true;
    }
    public ImageIcon getMat(){
        return matTruoc;
    }
    public boolean isKhongMat(){
        return khongMat;
    }
    
}
