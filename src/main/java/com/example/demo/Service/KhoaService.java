package com.example.demo.Service;

import com.example.demo.Entity.Khoa;
import com.example.demo.Entity.Lop;

import java.util.Collection;
import java.util.List;

public interface KhoaService {
    String save(Khoa khoa);
    List<Khoa> getkhoas();
    Collection<Lop> getlops(String khoaName);
    Khoa getkhoa(String khoaName);
}
