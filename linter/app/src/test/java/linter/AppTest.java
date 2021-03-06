/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appLinter() {
        App sut = new App();
        Path jsPaths = Paths.get(".");
        System.out.println("Path: "+jsPaths.toAbsolutePath());
        String actualNoErrors = sut.jsLinter("./src/test/resources/no-errors-gates.js");
        String actualManyErrors = sut.jsLinter("./src/test/resources/gates.js");
        String actualOneError = sut.jsLinter("./src/test/resources/one-error-gates.js");
        String actualFewErrors = sut.jsLinter("./src/test/resources/few-errors-gates.js");
        String actualEmptyFile = sut.jsLinter("./src/test/resources/empty-gates.js");
        String expectedNoErrors = "";
        String expectedManyErrors = "Line 3: Missing semicolon.\n" +
                "Line 5: Missing semicolon.\n" +
                "Line 11: Missing semicolon.\n" +
                "Line 13: Missing semicolon.\n" +
                "Line 15: Missing semicolon.\n" +
                "Line 26: Missing semicolon.\n" +
                "Line 28: Missing semicolon.\n" +
                "Line 32: Missing semicolon.\n" +
                "Line 36: Missing semicolon.\n" +
                "Line 40: Missing semicolon.\n" +
                "Line 41: Missing semicolon.\n" +
                "Line 50: Missing semicolon.\n" +
                "Line 51: Missing semicolon.\n" +
                "Line 64: Missing semicolon.\n" +
                "Line 70: Missing semicolon.\n" +
                "Line 71: Missing semicolon.\n" +
                "Line 72: Missing semicolon.\n" +
                "Line 73: Missing semicolon.\n" +
                "Line 74: Missing semicolon.\n" +
                "Line 76: Missing semicolon.\n" +
                "Line 77: Missing semicolon.\n" +
                "Line 78: Missing semicolon.\n" +
                "Line 79: Missing semicolon.\n" +
                "Line 80: Missing semicolon.\n" +
                "Line 82: Missing semicolon.\n" +
                "Line 83: Missing semicolon.\n" +
                "Line 84: Missing semicolon.\n" +
                "Line 85: Missing semicolon.\n" +
                "Line 86: Missing semicolon.\n" +
                "Line 88: Missing semicolon.\n" +
                "Line 89: Missing semicolon.\n" +
                "Line 90: Missing semicolon.\n" +
                "Line 91: Missing semicolon.\n" +
                "Line 92: Missing semicolon.\n" +
                "Line 94: Missing semicolon.\n" +
                "Line 95: Missing semicolon.\n" +
                "Line 96: Missing semicolon.\n" +
                "Line 97: Missing semicolon.\n" +
                "Line 98: Missing semicolon.\n" +
                "Line 99: Missing semicolon.\n" +
                "Line 100: Missing semicolon.\n" +
                "Line 101: Missing semicolon.\n";
        String expectedOneError = "Line 3: Missing semicolon.\n";
        String expectedFewErrors = "Line 3: Missing semicolon.\n" +
                "Line 5: Missing semicolon.\n" +
                "Line 11: Missing semicolon.\n" +
                "Line 13: Missing semicolon.\n";
        String expectedEmptyFile = "";
        assertEquals(expectedNoErrors, actualNoErrors, "No Errors Failed");
        assertEquals(expectedManyErrors, actualManyErrors, "Many Errors Failed");
        assertEquals(expectedOneError, actualOneError, "One Error Failed");
        assertEquals(expectedFewErrors, actualFewErrors, "Few Errors Failed");
        assertEquals(expectedEmptyFile, actualEmptyFile, "Empty File Failed");
    }
}
