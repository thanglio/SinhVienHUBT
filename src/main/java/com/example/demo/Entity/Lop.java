package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "lop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lop_name")
    private String lopname;

    @Column(name = "siso")
    private int siSo;

    @Column(name = "isdelete")
    private int isDelete;

    @OneToMany(mappedBy = "lop")
    Set<SinhVien> sinhViens;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "khoa_id")
    private Khoa  khoa;

    public Lop() {
    }

    public Lop(Long id, String lopname, int siSo, int isDelete) {
        this.id = id;
        this.lopname = lopname;
        this.siSo = siSo;
        this.isDelete = isDelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLopname() {
        return lopname;
    }

    public void setLopname(String lopname) {
        this.lopname = lopname;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public int isDelete() {
        return isDelete;
    }

    public void setDelete(int delete) {
        isDelete = delete;
    }

    public Set<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(Set<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
}
