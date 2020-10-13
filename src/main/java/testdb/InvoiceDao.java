package testdb;

import java.util.ArrayList;

public interface InvoiceDao {

    ArrayList<Invoice> showAllInvoices();
    void insertInvoice(Invoice i);
    void deleteInvoid(Long i);

}
