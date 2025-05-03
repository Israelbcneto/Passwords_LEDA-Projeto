package dataset;

import java.util.Arrays;
import java.util.Comparator;
import util.InputVar;

public class CreateCasesByMonth {
    InputVar csvToArray = new InputVar();
    String[] data = csvToArray.arrayData();

    Comparator<String> comparadorMonthCrescent = Comparator.comparingInt((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(piecesDate[1]);
    });
    Comparator<String> comparadorMonthDecreasing = Comparator.comparingInt((String str) -> {
        String[] piecesDate = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)[3].split("/");
        return Integer.parseInt(piecesDate[1]);
    }).reversed();

    public String[] bestCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMonthCrescent);
        return dataTransforming;
    }
    public String[] mediumCase() {
        return data;
    }
    public String[] worstCase() {
        String[] dataTransforming = Arrays.copyOf(data, data.length);
        Arrays.sort(dataTransforming, comparadorMonthDecreasing);
        return dataTransforming;
    }
}
