package com.example.demo.Service.Implement;

import com.example.demo.Entity.Khoa;
import com.example.demo.Entity.Lop;
import com.example.demo.Repository.KhoaRepo;
import com.example.demo.Repository.LopRepo;
import com.example.demo.Service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LopServiceIpl implements LopService {

    @Autowired
    LopRepo lopRepo;
    @Autowired
    KhoaRepo khoaRepo;

    @Override
    public List<Lop> save(Lop lop) {
        lopRepo.save(lop);
        return lopRepo.findAll();
    }

    @Override
    public List<Lop> getall() {
        return lopRepo.findAll();
    }

    @Override
    public List<Lop> delete(Long id) {
        Lop lop=lopRepo.findById(id).get();
        lopRepo.delete(lop);
        return lopRepo.findAll();
    }

    @Override
    public List<Lop> addtokhoa(long khoaID, long lopID) {
        Lop lop=lopRepo.findById(lopID).get();
        Khoa khoa=khoaRepo.findById(khoaID).get();
        lop.setKhoa(khoa);
        lopRepo.save(lop);
        return lopRepo.findAll();
    }


}
