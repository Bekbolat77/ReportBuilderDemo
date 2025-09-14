public class ReportValidator {
    public boolean isValid(Report report) {
        return report != null
                && report.toString().length() > 10; // мысалға қарапайым шарт
    }
}
