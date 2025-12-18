
@Entity
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    private LocalDate purchaseDate;
    private LocalDate expiryDate;

    @Column(unique = true)
    private String warrantyNumber;

    private boolean active;

    public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Product getProduct() {
    return product;
}

public void setProduct(Product product) {
    this.product = product;
}

public LocalDate getPurchaseDate() {
    return purchaseDate;
}

public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
}

public LocalDate getExpiryDate() {
    return expiryDate;
}

public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
}

public String getWarrantyNumber() {
    return warrantyNumber;
}

public void setWarrantyNumber(String warrantyNumber) {
    this.warrantyNumber = warrantyNumber;
}

public boolean isActive() {
    return active;
}

public void setActive(boolean active) {
    this.active = active;
}

}
