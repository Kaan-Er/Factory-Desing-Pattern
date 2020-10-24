package factory;

public class Run {
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("Text file content");
        String file2 = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL).export("Text file content");

        System.out.println(file);
        System.out.println(file2);
    }
}
