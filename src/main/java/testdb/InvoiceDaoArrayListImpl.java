package testdb;

import java.sql.Date;
import java.util.ArrayList;

public class InvoiceDaoArrayListImpl implements  InvoiceDao{

    ArrayList<Invoice> invoices;

    public InvoiceDaoArrayListImpl()
    {
        this.invoices = new ArrayList<>();
        java.util.Date date2 = new  java.util.Date();
        this.invoices.add(new Invoice(1L, new Date(date2.getTime()),"Beschreibung"));
        this.invoices.add(new Invoice(2L, new Date(date2.getTime()),"Beschreibung"));
        this.invoices.add(new Invoice(3L, new Date(date2.getTime()),"Beschreibung"));
    }

    @Override
    public ArrayList<Invoice> showAllInvoices() {
        return this.invoices;
    }

    @Override
    public void insertInvoice(Invoice i) {
        if(i!=null) {
            this.invoices.add(i);
        }
    }

    @Override
    public void deleteInvoid(Long i) {
        for(Invoice i2 : this.invoices)
        {
            if(i2.getId()==i)
            {
                this.invoices.remove(i2);
                return;
            }
        }
    }
}
