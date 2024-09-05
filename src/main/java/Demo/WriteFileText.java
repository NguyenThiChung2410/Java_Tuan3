/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Demo;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class WriteFileText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str= "Em là cô gái hay nàng tiên\nEm có tuổi hay không có tuổi";
        try {
            FileWriter fw= new FileWriter("baitho.txt");
            fw.write(str);
            fw.close();
            System.out.println("Da ghi xong");
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Thao tac ghi file that bai");
        }
    }
    
}
