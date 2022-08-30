package com.enterprises.administrate.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Table(name = "enterprises")
public class Enterprises {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "created_by")
    private String created_by;
    @Getter @Setter @Column(name = "created_date")
    private String created_date;
    @Getter @Setter @Column(name = "modified_by")
    private String modified_by;
    @Getter @Setter @Column(name = "modified_date")
    private String modified_date;
    @Getter @Setter @Column(name = "status")
    private String status;
    @Getter @Setter @Column(name = "address")
    private String address;
    @Getter @Setter @Column(name = "phone")
    private String phone;
}
