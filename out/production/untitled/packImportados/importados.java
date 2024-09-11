package packImportados;
public class importados extends packProdutos.produtos {
    private Double alfandega;

    public importados(){
        super();
    }

    public importados(String name, Double price, Double alfandega) {
        super(name, price);
        this.alfandega = alfandega;
    }

    public Double getAlfandega() {
        return alfandega;
    }

    public void setAlfandega(Double alfandega) {
        this.alfandega = alfandega;
    }
    public Double totalPrice() {
        return getPrice() + alfandega;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", alfandega)
                + ")";
    }
}
