public class PlainTextReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header for Plain Text report...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body for Plain Text report...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer for Plain Text report...");
    }
}