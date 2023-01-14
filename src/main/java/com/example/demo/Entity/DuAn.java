package com.example.demo.Entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "duan")
public class DuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tenduan")
    private String tenDuAn;

    @Column(name = "thongtin")
    private String thongTin;

    @Column(name = "ngaydangki")
    private LocalDate ngayDangKi;

    @Column(name = "hanbaove")
    private LocalDate hanBaoVe;

    @Column(name = "ngaybaove")
    private LocalDate ngayBaoVe;

    @Column(name = "xetduyet")
    private int xetduyet;

    @Column(name = "ketqua")
    private String ketQua;

    @Column
    private int trangThai;

    @ManyToMany
    @JoinTable(
            name = "duan_sinhvien",
            joinColumns = @JoinColumn(name = "duan_id"),
            inverseJoinColumns = @JoinColumn(name = "sinhvien_id")
    )
    Set<SinhVien> sinhViens;

    //  giáo viên hướng dẫn
    @ManyToOne
    @JoinColumn(name = "giaovien_id")
    private GiaoVien giaoVien;


    public DuAn() {
    }

    public DuAn(Long id, String tenDuAn, String thongTin, LocalDate ngayDangKi, LocalDate hanBaoVe, LocalDate ngayBaoVe, int xetduyet, String ketQua) {
        this.id = id;
        this.tenDuAn = tenDuAn;
        this.thongTin = thongTin;
        this.ngayDangKi = ngayDangKi;
        this.hanBaoVe = hanBaoVe;
        this.ngayBaoVe = ngayBaoVe;
        this.xetduyet = xetduyet;
        this.ketQua = ketQua;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public LocalDate getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(LocalDate ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public LocalDate getHanBaoVe() {
        return hanBaoVe;
    }

    public void setHanBaoVe(LocalDate hanBaoVe) {
        this.hanBaoVe = hanBaoVe;
    }

    public LocalDate getNgayBaoVe() {
        return ngayBaoVe;
    }

    public void setNgayBaoVe(LocalDate ngayBaoVe) {
        this.ngayBaoVe = ngayBaoVe;
    }

    public int isXetduyet() {
        return xetduyet;
    }

    public void setXetduyet(int xetduyet) {
        this.xetduyet = xetduyet;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public int isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Set<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(Set<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThingTin(String thingTin) {
        this.thongTin = thongTin;
    }




}
