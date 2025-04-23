/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facade.client;

/**
 *
 * @author Vagger(Camilo Linares)
 */

import facade.Facade;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        String filePath = "test.txt";
        String originalContent = "!Hola, patron Facade en Java!";
        Facade facade = Facade.getInstance();

        try {
            facade.writeEncryptedFile(filePath, originalContent);
            String decryptedContent = facade.readDecryptedFile(filePath);
            System.out.println("Contenido descifrado: " + decryptedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}