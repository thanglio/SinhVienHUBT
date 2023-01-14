package com.example.demo.Controller;

import com.example.demo.Entity.Khoa;
import com.example.demo.Entity.Lop;
import com.example.demo.Service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/khoa")
public class KhoaController {
    @Autowired
    KhoaService khoaService;

    @GetMapping()
    public Collection<Khoa> getkhoas(){
        return khoaService.getkhoas();
    }

    @PostMapping("/save")
    public String savekhoa(@RequestBody Khoa khoa){
        return khoaService.save(khoa);
    }

    @GetMapping("/getlop")
    public Collection<Lop> getLop(@RequestParam String khoaName){
        Khoa khoa=khoaService.getkhoa(khoaName);
        return khoa.getLops();
    }
}
