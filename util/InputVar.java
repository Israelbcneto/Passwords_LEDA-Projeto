package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputVar {

    public int getSizePassword(String str) {
        int startIndex = str.lastIndexOf('"') + 2;
        int endIndex = str.indexOf(',', startIndex);
        if (startIndex > 0 && endIndex > startIndex) {
            return Integer.parseInt(str.substring(startIndex, endIndex));
        }
        return 0;
    }

    public int getMesData(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        if (partesData.length >= 2) {
            return Integer.parseInt(partesData[1]);
        }
        return 0;
    }

    public int getData(String str) {
        String[] partesData = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split(" ")[0].split("/");
        return Integer.parseInt(partesData[2]) * 10000 + Integer.parseInt(partesData[1]) * 100 + Integer.parseInt(partesData[0]);
    }

    public String[] arrayData() {
        try (BufferedReader br = new BufferedReader(new FileReader("dataset/passwords_test.csv"))) {
            br.readLine();

            int numLines = 0;
            String line;
            while ((line = br.readLine()) != null) {
                numLines++;
            }

            String[] dataArray = new String[numLines];

            br.close();

            BufferedReader br2 = new BufferedReader(new FileReader("dataset/passwords_test.csv"));

            br2.readLine();

            int index = 0;
            while ((line = br2.readLine()) != null) {
                dataArray[index++] = line;
            }

            return dataArray;
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}
