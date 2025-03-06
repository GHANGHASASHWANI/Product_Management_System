package com.labmst.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    private int supplier_id;
    private String supplier_name;
    private String supplier_contactInfo;

}
