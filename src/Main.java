import data.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        LocalDate createdOn = LocalDate.of(2026, 2, 26);
        LocalDate.now();

        Document doc = new Document(1, "Introduction", BigDecimal.valueOf(15.8));
        Document doc2 = new Document(2);
        Document doc3 = new Document(3, "Another title", BigDecimal.valueOf(3));

        System.out.println("Max size: " + Document.getMaxSize());
        System.out.println(doc);
        System.out.println(doc2);
        System.out.println("doc equals doc3: " + doc.equals(doc3));
    }
}
