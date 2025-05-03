package test;

import algorithms.CountingSort;
import algorithms.HeapSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.QuickSortMedianaTres;
import algorithms.SelectionSort;
import dataset.CreateCasesByDate;
import dataset.CreateCasesByLength;
import dataset.CreateCasesByMonth;

public class RunTests {

    CreateCasesByLength byLength = new CreateCasesByLength();
    CreateCasesByDate byDate= new CreateCasesByDate();
    CreateCasesByMonth byMonth = new CreateCasesByMonth();

    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    QuickSort quickSort = new QuickSort();
    MergeSort mergeSort = new MergeSort();
    CountingSort countingSort = new CountingSort();
    HeapSort heapSort = new HeapSort();
    QuickSortMedianaTres quickSortMedianaTres = new QuickSortMedianaTres();


    public void tamanhoSenha() {
        String[] bestCaseByLength = byLength.bestCase();
        String[] mediumCaseByLength = byLength.mediumCase();
        String[] worstCaseByLength = byLength.worstCase();

        System.out.println("\nSelectionSort P/ Tamanho da Senha:");
        selectionSort.length(bestCaseByLength, "melhor caso");
        selectionSort.length(mediumCaseByLength, "médio caso");
        selectionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nInsertionSort P/ Tamanho da Senha:");
        insertionSort.length(bestCaseByLength, "melhor caso");
        insertionSort.length(mediumCaseByLength, "médio caso");
        insertionSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort P/ Tamanho da Senha:");
        quickSort.length(bestCaseByLength, "melhor caso");
        quickSort.length(mediumCaseByLength, "médio caso");
        quickSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nMergeSort P/ Tamanho da Senha:");
        mergeSort.length(bestCaseByLength, "melhor caso");
        mergeSort.length(mediumCaseByLength, "médio caso");
        mergeSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nCountingSort P/ Tamanho da Senha:");
        countingSort.length(bestCaseByLength, "melhor caso");
        countingSort.length(mediumCaseByLength, "médio caso");
        countingSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nHeapSort P/ Tamanho da Senha:");
        heapSort.length(bestCaseByLength, "melhor caso");
        heapSort.length(mediumCaseByLength, "médio caso");
        heapSort.length(worstCaseByLength, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Tamanho da Senha:");
        quickSortMedianaTres.length(bestCaseByLength, "melhor caso");
        quickSortMedianaTres.length(mediumCaseByLength, "médio caso");
        quickSortMedianaTres.length(worstCaseByLength, "pior caso");
    }

    public void porMes() {
        String[] bestCaseByMonth = byMonth.bestCase();
        String[] mediumCaseByMonth = byMonth.mediumCase();
        String[] worstCaseByMonth = byMonth.worstCase();

        System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort P/ Mês:");
        selectionSort.month(bestCaseByMonth, "melhor caso");
        selectionSort.month(mediumCaseByMonth, "médio caso");
        selectionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nInsertionSort P/ Mês:");
        insertionSort.month(bestCaseByMonth, "melhor caso");
        insertionSort.month(mediumCaseByMonth, "médio caso");
        insertionSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort P/ Mês:");
        quickSort.month(bestCaseByMonth, "melhor caso");
        quickSort.month(mediumCaseByMonth, "médio caso");
        quickSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nMergeSort P/ Mês:");
        mergeSort.month(bestCaseByMonth, "melhor caso");
        mergeSort.month(mediumCaseByMonth, "médio caso");
        mergeSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nCountingSort P/ Mês:");
        countingSort.month(bestCaseByMonth, "melhor caso");
        countingSort.month(mediumCaseByMonth, "médio caso");
        countingSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nHeapSort P/ Mês:");
        heapSort.month(bestCaseByMonth, "melhor caso");
        heapSort.month(mediumCaseByMonth, "médio caso");
        heapSort.month(worstCaseByMonth, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Mês:");
        quickSortMedianaTres.month(bestCaseByMonth, "melhor caso");
        quickSortMedianaTres.month(mediumCaseByMonth, "médio caso");
        quickSortMedianaTres.month(worstCaseByMonth, "pior caso");
    }

    public void pordata() {
        String[] bestCaseByDate = byDate.melhorCaso();
        String[] mediumCaseByDate = byDate.medioCaso();
        String[] worstCaseByDate = byDate.piorCaso();

        System.out.println("\nOs arrays para melhor, pior e medio caso foram criados...");

        System.out.println("\nSelectionSort P/ Data:");
        selectionSort.date(bestCaseByDate, "melhor caso");
        selectionSort.date(mediumCaseByDate, "médio caso");
        selectionSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nInsertionSort P/ Data:");
        insertionSort.date(bestCaseByDate, "melhor caso");
        insertionSort.date(mediumCaseByDate, "médio caso");
        insertionSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nQuickSort P/ Data:");
        quickSort.date(bestCaseByDate, "melhor caso");
        quickSort.date(mediumCaseByDate, "médio caso");
        quickSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nMergeSort P/ Data:");
        mergeSort.date(bestCaseByDate, "melhor caso");
        mergeSort.date(mediumCaseByDate, "médio caso");
        mergeSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nCountingSort P/ Data:");
        countingSort.date(bestCaseByDate, "melhor caso");
        countingSort.date(mediumCaseByDate, "médio caso");
        countingSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nHeapSort P/ Data:");
        heapSort.date(bestCaseByDate, "melhor caso");
        heapSort.date(mediumCaseByDate, "médio caso");
        heapSort.date(worstCaseByDate, "pior caso");

        System.out.println("\nQuickSort com Mediana 3 P/ Data:");
        quickSortMedianaTres.date(bestCaseByDate, "melhor caso");
        quickSortMedianaTres.date(mediumCaseByDate, "médio caso");
        quickSortMedianaTres.date(worstCaseByDate, "pior caso");
    }

}
