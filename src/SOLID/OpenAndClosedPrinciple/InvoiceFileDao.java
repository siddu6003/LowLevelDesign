package SOLID.OpenAndClosedPrinciple;

public class InvoiceFileDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save to file logic
    }
}
