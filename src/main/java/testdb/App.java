package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Test","root","1234");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Invoices");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}

        InvoiceDao invoiceDao = new InvoiceDaoArrayListImpl();

        ArrayList<Invoice> liste = invoiceDao.showAllInvoices();
        for(Invoice i : liste)
        {
            System.out.println(i);
        }
    }

    public static void showInvoices()
    {

    }

    public static void insertInvoice(Invoice i)
    {

    }
}