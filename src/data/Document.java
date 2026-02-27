package data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public final class Document {
    private static final BigDecimal MAX_SIZE = BigDecimal.TEN;

    private final long id;
    private String name;
    private BigDecimal size;
    private final LocalDate createdOn;

    public Document(long id) {
        this(id, "Untitled", BigDecimal.ZERO, LocalDate.now());
    }

    public Document(long id, String name, BigDecimal size) {
        this(id, name, size, LocalDate.now());
    }

    public Document(long id, String name, BigDecimal size, LocalDate createdOn) {
        this.id = id;
        this.createdOn = createdOn == null ? LocalDate.now() : createdOn;
        setName(name);
        setSize(size);
    }

    @Override
    public String toString() {
        return "Document{id=" + id + ", name='" + name + "', size=" + size + ", createdOn=" + createdOn + "}";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Untitled";
            return;
        }
        this.name = name;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        if (size == null || size.compareTo(BigDecimal.ZERO) < 0) {
            this.size = BigDecimal.ZERO;
            return;
        }
        this.size = size.min(MAX_SIZE);
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public static BigDecimal getMaxSize() {
        return MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id == document.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
