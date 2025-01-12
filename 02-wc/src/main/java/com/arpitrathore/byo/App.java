package com.arpitrathore.byo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Word count
 */
public class App {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: java WC <filename>");
      System.exit(1);
    }

    String filePath = args[0];

    try {
      String content = Files.readString(Paths.get(filePath));
      long lineCount = content.lines().count() - 1; //wc actually counts number of new line character
      long wordCount = Arrays.stream(content.split("\\s+")).filter(word -> !word.isBlank()).count();
      long charCount = content.length();

      System.out.printf("%7d %7d %7d %s%n", lineCount, wordCount, charCount, filePath);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
      System.exit(1);
    }
  }
}
