package laboratory_7.service;

import laboratory_7.model.Vector;

import java.io.IOException;

public interface WriteToFileService {
    void writeVectorToFile(Vector finalVector) throws IOException;
}
