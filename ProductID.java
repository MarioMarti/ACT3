package data;

final public class ProductID {

    private final String productID;

    public ProductID (String code) { this.productID = code;}

    public String getProductID() { return productID; }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductID prodID = (ProductID) o;
        return productID.equals(prodID.productID);
    }

    @Override
    public int hashCode() {return productID.hashCode();}

    @Override
    public String toString() {
        return "HealthCardID(" + "personal code )='" + productID + '\'' + '}';
    }
}