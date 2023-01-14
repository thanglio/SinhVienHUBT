package com.example.demo.Entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "tintuc")
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String tieuDe;

    @Column
    private String noiDung;

    @Column
    private Date ngayDang;

    @Column
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "giaovien_id")
    private GiaoVien giaoVien;
}
