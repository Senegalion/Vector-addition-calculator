package laboratory_7.service;

import laboratory_7.exceptions.DifferentVectorsLengthsException;
import laboratory_7.exceptions.NoVectorsException;
import laboratory_7.model.Vector;

import java.util.ArrayList;
import java.util.List;

public class AddVectorServiceImpl implements AddVectorsService {
    @Override
    public Vector addVectors(List<Vector> vectorList) throws
            DifferentVectorsLengthsException, NoVectorsException {

        List<Integer> finalVectorCoordinates = new ArrayList<>();

        if (compareVectorsLength(vectorList)) {
            addVectorsCoordinates(vectorList, finalVectorCoordinates);
        }

        return new Vector(finalVectorCoordinates);
    }

    private void addVectorsCoordinates(List<Vector> vectorList, List<Integer> finalVectorCoordinates) {
        int vectorLength = vectorList.get(0).calculateVectorLength();
        Integer sumOfTheSameCoordinates;
        for (int i = 0; i < vectorLength; i++) {
            sumOfTheSameCoordinates = 0;
            for (Vector vector : vectorList) {
                sumOfTheSameCoordinates += vector.getVectorCoordinates().get(i);
            }
            finalVectorCoordinates.add(sumOfTheSameCoordinates);
        }
    }

    private boolean compareVectorsLength(List<Vector> vectorList) throws DifferentVectorsLengthsException, NoVectorsException {
        if (vectorList.isEmpty()) {
            throw new NoVectorsException();
        }

        Integer vectorLength = vectorList.get(0).calculateVectorLength();
        List<Integer> vectorLengths = new ArrayList<>();

        for (Vector vector : vectorList) {
            vectorLengths.add(vector.calculateVectorLength());
        }

        for (Integer length : vectorLengths) {
            if (!length.equals(vectorLength)) {
                System.out.println(vectorLengths);
                throw new DifferentVectorsLengthsException(vectorLengths, "Error");
            }
        }

        return true;
    }


}
