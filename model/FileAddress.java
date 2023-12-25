package laboratory_7.model;

public enum FileAddress {
    OUTPUT_FILE("src/laboratory_7/vectorFile.txt");

    private final String fileAddress;

    FileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getFileAddress() {
        return fileAddress;
    }
}
