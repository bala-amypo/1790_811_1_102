@Entity
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Warranty warranty;

    private Integer daysBeforeExpiry;
    private boolean enabled;

    public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Warranty getWarranty() {
    return warranty;
}

public void setWarranty(Warranty warranty) {
    this.warranty = warranty;
}

public Integer getDaysBeforeExpiry() {
    return daysBeforeExpiry;
}

public void setDaysBeforeExpiry(Integer daysBeforeExpiry) {
    this.daysBeforeExpiry = daysBeforeExpiry;
}

public boolean isEnabled() {
    return enabled;
}

public void setEnabled(boolean enabled) {
    this.enabled = enabled;
}

}
