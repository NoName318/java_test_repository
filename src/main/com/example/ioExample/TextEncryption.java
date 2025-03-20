package com.example.ioExample;

import java.io.*;

public class TextEncryption {
    private static final String KEY = "secretKey"; // 加密密钥

    // 异或加密方法
    private static String xorEncrypt(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            char keyChar = TextEncryption.KEY.charAt(i % TextEncryption.KEY.length());
            output.append((char) (inputChar ^ keyChar)); // 异或运算
        }
        return output.toString();
    }

    // 读取文件内容
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    // 写入文件内容
    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // 加密文件
    public static void encryptFile(String inputFilePath, String outputFilePath) throws IOException {
        // 读取文件内容
        String originalText = readFile(inputFilePath);

        // 加密内容
        String encryptedText = xorEncrypt(originalText);

        // 写入加密后的内容
        writeFile(outputFilePath, encryptedText);
    }


}