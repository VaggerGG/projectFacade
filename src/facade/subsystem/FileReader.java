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

public class FileReader {
    public String read(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
