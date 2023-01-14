package com.example.demo.Service.Implement;

import com.example.demo.Entity.Khoa;
import com.example.demo.Entity.Lop;
import com.example.demo.Repository.KhoaRepo;
import com.example.demo.Service.KhoaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Service
public class KhoaServiceIpl implements KhoaService {
    @Autowired
    KhoaRepo khoaRepo;
    @Override
    public String save(Khoa khoa) {
        try {
            khoaRepo.save(khoa);
            return "Success";
        }catch ( Exception ex){
            return "Fail!!!"+ex.toString();
        }

    }

    @Override
    public List<Khoa> getkhoas() {
        return khoaRepo.findAll();
    }

    @Override
    public Collection<Lop> getlops(String khoaName) {
        return khoaRepo.findBykhoaName(khoaName).getLops();
    }

    @Override
    public Khoa getkhoa(String khoaName) {
        return khoaRepo.findBykhoaName(khoaName);
    }
}
