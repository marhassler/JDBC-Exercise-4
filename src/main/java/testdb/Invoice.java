package testdb;

import java.sql.Date;

public class Invoice {

    private Long id;
    private Date date;
    private String description;

    public Invoice(Long id, Date datum, String description) {
        this.id = id;
        this.date = datum;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return date;
    }

    public void setDatum(Date datum) {
        this.date = datum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", datum=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
