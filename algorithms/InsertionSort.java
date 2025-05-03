package algorithms;

import dataset.CreateFileCsv;
import util.InputVar;

public class InsertionSort {
    CreateFileCsv create = new CreateFileCsv();

    public void length(String[] data,String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getSizePassword(copiaDados[j]) < v.getSizePassword(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução InsertionSort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if(nameCase == "melhor caso") {
            filename = "dataset/passwords_length_insertionSort_melhorCaso.csv";
        } else if (nameCase == "médio caso" ){
            filename = "dataset/passwords_length_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_insertionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename );
    }

    public void month(String[] data, String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getMesData(copiaDados[j]) > v.getMesData(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Insertion Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_month_insertionSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_month_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_insertionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename);
    }

    public void date(String[] data, String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 1; i < copiaDados.length; i++) {
            String chave = copiaDados[i];
            int j = i - 1;
            while (j >= 0 && v.getData(copiaDados[j]) > v.getData(chave)) {
                copiaDados[j + 1] = copiaDados[j];
                j = j - 1;
            }
            copiaDados[j + 1] = chave;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução Insertion Sort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if (nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_data_insertionSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")) {
            filename = "dataset/passwords_data_insertionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_insertionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename);
    }

}
