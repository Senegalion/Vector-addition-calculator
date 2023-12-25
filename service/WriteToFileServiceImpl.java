package laboratory_7.service;

import laboratory_7.model.Vector;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static laboratory_7.model.FileAddress.OUTPUT_FILE;

public class WriteToFileServiceImpl implements WriteToFileService {
    @Override
    public void writeVectorToFile(Vector finalVector) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE.getFileAddress()));

        bufferedWriter.write(String.valueOf(finalVector));
        bufferedWriter.close();
    }
}
