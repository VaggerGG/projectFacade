/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facade.subsystem;

/**
 *
 * @author Vagger(Camilo Linares)
 */

import java.util.Base64;

public class FileEncryptor {
    public String encrypt(String content) {
        return Base64.getEncoder().encodeToString(content.getBytes());
    }

    public String decrypt(String encryptedContent) {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedContent);
        return new String(decodedBytes);
    }
}