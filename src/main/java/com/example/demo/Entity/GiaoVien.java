package com.example.demo.Entity;

import com.example.demo.Security.SecurityEntity.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "giaovien")
public class GiaoVien extends BasePeople {

    @Column
    private String chucVu;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "khoa_id")
    private Khoa khoa;

    @OneToMany(mappedBy = "giaoVien")
    private Set<DuAn> duAns;

    @OneToMany(mappedBy = "giaoVien")
    private Set<TinTuc> tinTucs;

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    public Set<DuAn> getDuAns() {
        return duAns;
    }

    public void setDuAns(Set<DuAn> duAns) {
        this.duAns = duAns;
    }

    public Set<TinTuc> getTinTucs() {
        return tinTucs;
    }

    public void setTinTucs(Set<TinTuc> tinTucs) {
        this.tinTucs = tinTucs;
    }
}
