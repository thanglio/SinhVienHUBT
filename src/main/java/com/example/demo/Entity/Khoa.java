package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "khoa")
public class Khoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String khoaName;

    @OneToMany(mappedBy = "khoa")
    private Set<GiaoVien> giaoViens;

    @OneToMany(mappedBy = "khoa")
    private Set<Lop> lops;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getkhoaName() {
        return khoaName;
    }

    public void setkhoaName(String khoaName) {
        this.khoaName = khoaName;
    }

    public Set<GiaoVien> getGiaoViens() {
        return giaoViens;
    }

    public void setGiaoViens(Set<GiaoVien> giaoViens) {
        this.giaoViens = giaoViens;
    }

    public Set<Lop> getLops() {
        return lops;
    }

    public void setLops(Set<Lop> lops) {
        this.lops = lops;
    }
}
