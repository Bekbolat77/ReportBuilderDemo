
public class Report {
    private final String title;
    private final String author;
    private final String content;
    private final String footer;

    // Private constructor
    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.footer = builder.footer;
    }

    @Override
    public String toString() {
        return "Report:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Content: " + content + "\n" +
                "Footer: " + footer;
    }

    // Builder class
    public static class Builder {
        private String title;
        private String author;
        private String content;
        private String footer;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
