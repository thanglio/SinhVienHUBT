package com.example.demo.Service;

import com.example.demo.Entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    List<SinhVien> getall();
    List<SinhVien> save(SinhVien sinhVien);
    List<SinhVien> delete(long svId);
    SinhVien changeLop(long lopId,long svId);
}
