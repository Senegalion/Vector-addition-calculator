package laboratory_7.model;

import java.util.List;

public class Vector {
    private final List<Integer> vectorCoordinates;

    public Vector(List<Integer> vectorCoordinates) {
        this.vectorCoordinates = vectorCoordinates;
    }

    public List<Integer> getVectorCoordinates() {
        return vectorCoordinates;
    }

    public Integer calculateVectorLength() {
        return vectorCoordinates.size();
    }

    @Override
    public String toString() {
        return "Vector = " +
                vectorCoordinates;
    }
}
