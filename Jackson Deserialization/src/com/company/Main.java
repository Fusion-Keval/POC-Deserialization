package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main
{
    public static void main( String[] args ) throws IOException

    {

while(true) {
    try {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("creating objectmapper");
            ObjectMapper om = new ObjectMapper();
            om.enableDefaultTyping();

            inner i = om.readValue(Files.readAllBytes(Paths.get("1.txt")), inner.class);
            System.out.println("done");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}


}

}
class inner {
    public int id;
    public Object obj;}