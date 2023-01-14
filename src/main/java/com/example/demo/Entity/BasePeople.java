package com.example.demo.Entity;

import com.example.demo.Security.SecurityEntity.User;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BasePeople {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String ten;

    @Column
    private String gioiTinh;

    @Column
    private String maSo;

    @Column
    private LocalDate ngaySinh;

    @Column
    private String diaChi;

    @Column
    private String soDienThoai;

    @Column
    private String email;

    @Column
    private int trangThai;



    public Long getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getMaSo() {
        return maSo;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }
}
