/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facade;

/**
 *
 * @author Vagger(Camilo Linares)
 */

import facade.subsystem.FileEncryptor;
import facade.subsystem.FileReader;
import facade.subsystem.FileWriter;
import java.io.IOException;

public class Facade {
    private static Facade instance;
    private final FileReader fileReader;
    private final FileWriter fileWriter;
    private final FileEncryptor fileEncryptor;

    private Facade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileEncryptor = new FileEncryptor();
    }

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void writeEncryptedFile(String filePath, String content) throws IOException {
        String encrypted = fileEncryptor.encrypt(content);
        fileWriter.write(filePath, encrypted);
    }

    public String readDecryptedFile(String filePath) throws IOException {
        String encryptedContent = fileReader.read(filePath);
        return fileEncryptor.decrypt(encryptedContent);
    }
}