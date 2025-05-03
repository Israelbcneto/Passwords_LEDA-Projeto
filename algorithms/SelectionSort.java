package algorithms;

import dataset.CreateFileCsv;
import util.InputVar;

public class SelectionSort {

    CreateFileCsv create = new CreateFileCsv();

    public void length(String[] data,String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 0; i < copiaDados.length - 1; i++) {
            int maiorIndex = i;
            for (int j = i + 1; j < copiaDados.length; j++) {
                if (v.getSizePassword(copiaDados[j]) > v.getSizePassword(copiaDados[maiorIndex])) {
                    maiorIndex = j;
                }
            }
            if (maiorIndex != i) {
                String temp = copiaDados[i];
                copiaDados[i] = copiaDados[maiorIndex];
                copiaDados[maiorIndex] = temp;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução SelectionSort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if(nameCase.equals("melhor caso")) {
            filename = "dataset/passwords_length_selectionSort_melhorCaso.csv";
        } else if (nameCase.equals("médio caso")){
            filename = "dataset/passwords_length_selectionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_length_selectionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename );
    }

    public void month(String[] data, String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 0; i < copiaDados.length - 1; i++) {
            int maiorIndex = i;
            for (int j = i + 1; j < copiaDados.length; j++) {
                if (v.getMesData(copiaDados[j]) < v.getMesData(copiaDados[maiorIndex])) {
                    maiorIndex = j;
                }
            }
            if (maiorIndex != i) {
                String temp = copiaDados[i];
                copiaDados[i] = copiaDados[maiorIndex];
                copiaDados[maiorIndex] = temp;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução SelectionSort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if(nameCase == "melhor caso") {
            filename = "dataset/passwords_data_month_selectionSort_melhorCaso.csv";
        } else if (nameCase == "médio caso" ){
            filename = "dataset/passwords_data_month_selectionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_month_selectionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename );
    }

    public void date(String[] data, String nameCase) {
        InputVar v = new InputVar();
        String[] copiaDados = data.clone();

        long startTime = System.nanoTime();

        for (int i = 0; i < copiaDados.length - 1; i++) {
            int maiorIndex = i;
            for (int j = i + 1; j < copiaDados.length; j++) {
                if (v.getData(copiaDados[j]) < v.getData(copiaDados[maiorIndex])) {
                    maiorIndex = j;
                }
            }
            if (maiorIndex != i) {
                String temp = copiaDados[i];
                copiaDados[i] = copiaDados[maiorIndex];
                copiaDados[maiorIndex] = temp;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Tempo de execução SelectionSort p/ o " + nameCase + ": " + duration + " milissegundos");
        String filename = "";

        if(nameCase == "melhor caso") {
            filename = "dataset/passwords_data_selectionSort_melhorCaso.csv";
        } else if (nameCase == "médio caso" ){
            filename = "dataset/passwords_data_selectionSort_medioCaso.csv";
        } else {
            filename = "dataset/passwords_data_selectionSort_piorCaso.csv";
        }

        create.criaCsv(copiaDados, filename );
    }
}
