package laboratory_7;

import laboratory_7.exceptions.DifferentVectorsLengthsException;
import laboratory_7.exceptions.NoVectorsException;
import laboratory_7.model.Vector;
import laboratory_7.service.AddVectorServiceImpl;
import laboratory_7.service.AddVectorsService;
import laboratory_7.service.UserInputService;
import laboratory_7.service.UserInputServiceImpl;
import laboratory_7.service.VectorLengthsComparator;
import laboratory_7.service.WriteToFileService;
import laboratory_7.service.WriteToFileServiceImpl;

import java.io.IOException;
import java.util.List;

public class VectorAdditionCalculator {
    public static void main(String[] args) {
        VectorAdditionCalculator vectorAdditionCalculator = new VectorAdditionCalculator();
        vectorAdditionCalculator.calculateAndDisplayVector();
    }

    private void calculateAndDisplayVector() {
        List<Vector> vectorList;
        UserInputService userInputService = new UserInputServiceImpl();
        vectorList = userInputService.getUserInput();
        AddVectorsService addVectorsService = new AddVectorServiceImpl();
        try {
            Vector finalVector = addVectorsService.addVectors(vectorList);
            System.out.println("Vector has been written to the file");
            WriteToFileService writeToFileService = new WriteToFileServiceImpl();
            writeToFileService.writeVectorToFile(finalVector);
        } catch (IOException e) {
            System.out.println("File does not exist");
        } catch (NoVectorsException ex) {
            System.out.println(ex.getMessage());
        } catch (DifferentVectorsLengthsException exception) {
            VectorLengthsComparator.printVectorsLengths(exception.getVectorLengths());
            VectorLengthsComparator.printVectorsLengthsComparisons(exception.getVectorLengths());
            System.out.println(exception.getMessage());
            calculateAndDisplayVector();
        }
    }
}
