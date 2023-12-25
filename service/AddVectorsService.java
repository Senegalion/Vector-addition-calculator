package laboratory_7.service;

import laboratory_7.exceptions.DifferentVectorsLengthsException;
import laboratory_7.exceptions.NoVectorsException;
import laboratory_7.model.Vector;

import java.util.List;

public interface AddVectorsService {
    Vector addVectors(List<Vector> vectorList) throws DifferentVectorsLengthsException, NoVectorsException;
}
