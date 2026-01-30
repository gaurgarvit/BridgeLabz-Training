interface Exporter {
    void exportPDF();
    
    // Newly added feature
    default void exportToJSON() {
        System.out.println("Default JSON export logic invoked.");
    }
}

class ReportModule implements Exporter {
    public void exportPDF() {
        System.out.println("Exporting to PDF...");
    }
}

public class ExportingData {
    public static void main(String[] args) {
        Exporter report = new ReportModule();
        report.exportPDF();
        report.exportToJSON(); // Works without code change in ReportModule
    }
}