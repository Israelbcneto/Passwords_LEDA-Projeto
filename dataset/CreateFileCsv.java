package dataset;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileCsv {

    public void criaCsv(String[] data, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append(",password,length,date,class\n");

            for (String dado : data) {
                writer.append(partirLinhaParaCSV(dado)).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gerar o arquivo CSV.");
            e.printStackTrace();
        }
    }

    public static String partirLinhaParaCSV(String linha) {
        String[] partes = linha.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        return String.join(",", partes);
    }
}
