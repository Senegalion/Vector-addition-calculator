package laboratory_7.service;

import java.util.List;

public class VectorLengthsComparator {

    public static void printVectorsLengths(List<Integer> vectorLengths) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < vectorLengths.size(); i++) {
            System.out.println("Vector " + (i + 1) + ": Length = " + vectorLengths.get(i));
        }
        System.out.println("---------------------------------------");
    }

    public static void printVectorsLengthsComparisons(List<Integer> vectorLengths) {
        System.out.println("---------------------------------------");
        for (int i = 0; i < vectorLengths.size(); i++) {
            for (int j = i + 1; j < vectorLengths.size(); j++) {
                compareVectorsLengths(vectorLengths.get(i), vectorLengths.get(j), i + 1, j + 1);
            }
        }
        System.out.println("---------------------------------------");
    }

    private static void compareVectorsLengths(int length1, int length2, int i, int j) {
        if (length1 > length2) {
            System.out.println("The length of the vector " + i + " is bigger than the length of vector " + j);
        } else if (length1 < length2) {
            System.out.println("The length of the vector " + i + " is lower than the length of vector " + j);
        }
    }
}