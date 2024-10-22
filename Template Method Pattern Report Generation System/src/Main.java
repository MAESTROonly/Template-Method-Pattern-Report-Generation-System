public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        System.out.println("Generating PDF Report:");
        ReportGenerator pdfReport = new PDFReportGenerator();
        reportingSystem.generateReport(pdfReport);

        System.out.println("\nGenerating HTML Report:");
        ReportGenerator htmlReport = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlReport);

        System.out.println("\nGenerating Plain Text Report:");
        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        reportingSystem.generateReport(plainTextReport);
    }
}
