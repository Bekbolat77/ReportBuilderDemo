
public class Main {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                .title("Clean Code Report")
                .author("Tileukhan Bekbolat")
                .content("This report explains the Builder pattern with Clean Code principles.")
                .footer("Generated in 2025")
                .build();

        System.out.println(report);
    }
}
