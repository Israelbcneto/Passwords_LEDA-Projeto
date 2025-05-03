package main;

import domain.PasswordClassifier;
import domain.PasswordClassifierFilter;
import domain.PasswordDateFormatter;
import test.RunTests;

public class Main {

    public static void main(String[] args) {
        // NOTA: Verificaremos e corrigiremos esses caminhos a seguir.
        PasswordClassifier classifier = new PasswordClassifier();
        classifier.classifyPasswords("dataset/passwords.csv", "dataset/password_classifier.csv");

        PasswordDateFormatter formatter = new PasswordDateFormatter();
        formatter.formatDates("dataset/password_classifier.csv", "dataset/passwords_formated_data.csv");

        PasswordClassifierFilter filterClassifier = new PasswordClassifierFilter();
        filterClassifier.filterPasswords("dataset/password_classifier.csv", "dataset/passwords_classifier.csv");

        RunTests runTests = new RunTests();

        System.out.println("\n\n__________Ordenação levando em conta o *TAMANHO DA SENHA*_________");
        runTests.tamanhoSenha();

        System.out.println("\n\n__________Ordenação levando em conta o *MES*_________");
        runTests.porMes();

        System.out.println("\n\n__________Ordenação levando em conta a *DATA*_________");
        runTests.pordata();

    }
} 