package com.example.programmerstests;

import java.io.*;

public class MergeSqlFiles {
    public static void main(String[] args) {
        // total_commute_data 폴더 경로
        String folderPath = System.getProperty("user.home") + "\\Desktop\\total_commute_data";

        // 결과를 저장할 메모장 파일 경로
        String outputFilePath = System.getProperty("user.home") + "\\Desktop\\merged_output.sql";

        try (PrintWriter outputWriter = new PrintWriter(outputFilePath)) {
            processFolder(new File(folderPath), outputWriter);

            System.out.println("작업이 완료되었습니다. 결과는 " + outputFilePath + "에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFolder(File folder, PrintWriter outputWriter) throws IOException {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // 폴더일 경우 재귀적으로 폴더를 처리
                    processFolder(file, outputWriter);
                } else if (file.isFile() && file.getName().endsWith(".sql")) {
                    // SQL 파일일 경우 내용을 메모장 파일에 추가
                    outputWriter.println("--- " + file.getName() + " ---");
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            outputWriter.println(line);
                        }
                    }
                    outputWriter.println("\n");
                }
            }
        }
    }
}
