package laboratory_7.service;

import laboratory_7.model.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInputServiceImpl implements UserInputService {
    @Override
    public List<Vector> getUserInput() {
        List<Vector> vectorList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number of vectors: ");
        int iterator = 0;
        while (true) {
            iterator++;
            System.out.println("Vector " + iterator + ": ");
            String stringVector = scanner.nextLine();
            if (stringVector.isEmpty()) {
                System.out.println("Vector " + iterator + ": (no vector)");
                break;
            }
            String[] stringVectorCoordinates = stringVector.split(",");
            Vector vector = createVector(stringVectorCoordinates);
            vectorList.add(vector);
        }
        return vectorList;
    }

    private Vector createVector(String[] stringVectorCoordinates) {
        List<Integer> vectorCoordinates = new ArrayList<>();
        for (String stringVectorCoordinate : stringVectorCoordinates) {
            try {
                Integer vectorCoordinate = Integer.parseInt(stringVectorCoordinate);
                vectorCoordinates.add(vectorCoordinate);
            } catch (Exception ignored) {
            }
        }
        return new Vector(vectorCoordinates);
    }
}
