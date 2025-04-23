/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facade.subsystem;

/**
 *
 * @author Vagger(Camilo Linares)
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void write(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}