/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        jsLinter("./app/src/main/resources/gates.js");
    }
    //"./app/src/main/resources/gates.js"
    public static String jsLinter(String pathToFile) {
        int lineCounter = 0;
        String finalString = "";
        Path jsPath = Paths.get(pathToFile);
        Scanner scanner = null;
        try{
            scanner = new Scanner(jsPath);
            while(scanner.hasNextLine()) {
                lineCounter++;
                String currentLine = scanner.nextLine();
                if(!(currentLine.endsWith(";") || currentLine.endsWith("{") ||currentLine.endsWith("}") || currentLine.isEmpty() || currentLine.contains("if") || currentLine.contains("else") || currentLine.startsWith("//"))) {
                    finalString += "Line " +lineCounter+ ": Missing semicolon.\n";
                }
            }
            System.out.println(finalString);
        } catch (Exception e) {
            System.out.println(e);
        }
        return finalString;
    }
}
