package com.example.demo.Entity;

import com.example.demo.Security.SecurityEntity.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sinhvien")
public class SinhVien extends BasePeople{
    @ManyToOne
    @JoinColumn(name = "lop_id")
    private Lop lop;

    @ManyToMany(mappedBy = "sinhViens")
    Set<DuAn> duAns;

    @OneToOne
    private User user;

}
