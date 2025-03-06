package com.labmst.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    private int category_id;
    private String category_name;
    private String category_description;
    
}
