package de.felixhoevel.application.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A GarageCode.
 */
@Entity
@Table(name = "garage_code")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class GarageCode implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private Integer code;

    @Column(name = "customer")
    private String customer;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "valid_until")
    private LocalDate validUntil;

    @ManyToOne
    @JsonIgnoreProperties("garageCodes")
    private Garage garageId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public GarageCode code(Integer code) {
        this.code = code;
        return this;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCustomer() {
        return customer;
    }

    public GarageCode customer(String customer) {
        this.customer = customer;
        return this;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public GarageCode createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public GarageCode validUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Garage getGarageId() {
        return garageId;
    }

    public GarageCode garageId(Garage garage) {
        this.garageId = garage;
        return this;
    }

    public void setGarageId(Garage garage) {
        this.garageId = garage;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GarageCode)) {
            return false;
        }
        return id != null && id.equals(((GarageCode) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "GarageCode{" +
            "id=" + getId() +
            ", code=" + getCode() +
            ", customer='" + getCustomer() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", validUntil='" + getValidUntil() + "'" +
            "}";
    }
}
