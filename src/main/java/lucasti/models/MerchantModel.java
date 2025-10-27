package lucasti.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lucasti.controllers.dtos.MerchantDTO;

import java.util.Objects;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tb_merchant")
public class MerchantModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String owner;
    private Integer bornYear;

    public MerchantModel() {
    }

    public MerchantModel(MerchantDTO merchantDTO) {
        this.name = merchantDTO.name();
        this.owner = merchantDTO.owner();
        this.bornYear = merchantDTO.bornYear();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }


    public Integer getBornYear() {
        return bornYear;
    }


    @Override
    public String toString() {
        return "MerchantModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", bornYear=" + bornYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MerchantModel that = (MerchantModel) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

}
