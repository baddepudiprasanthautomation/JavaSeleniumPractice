package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleThrows {
    public static void main(String[] args) throws FileNotFoundException {
        FileRead read = new FileRead();
        read.readFile();
    }
}

class FileRead{
    public void readFile() throws FileNotFoundException {
        FileReader readFile = new FileReader("C:\\Users\\Nagarjuna\\OneDrive\\Desktop\\C#Intro.txt");
    }
}