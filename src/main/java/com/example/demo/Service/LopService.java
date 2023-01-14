package com.example.demo.Service;

import com.example.demo.Entity.Lop;

import java.util.List;

public interface LopService {
    List<Lop> save(Lop lop);
    List<Lop> getall();
    List<Lop> delete(Long id);
    List<Lop> addtokhoa(long khoaID, long lopID);
}
