package SOLID.OpenAndClosedPrinciple;

class Invoice {
    private long invoiceNumber;
    private String invoiceName;

    public Invoice(long invoiceNumber, String invoiceName) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceName = invoiceName;
    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }
}
