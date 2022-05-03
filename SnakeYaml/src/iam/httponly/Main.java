package iam.httponly;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.yaml.snakeyaml.Yaml;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                FileInputStream inputStream = new FileInputStream("C:\\temp\\1.txt");
                Yaml yaml = new Yaml();
                yaml.load(inputStream);
            }
        }
    }
}