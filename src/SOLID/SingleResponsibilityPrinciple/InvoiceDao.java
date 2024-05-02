package SOLID.SingleResponsibilityPrinciple;

class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        // logic goes here
    }
}
