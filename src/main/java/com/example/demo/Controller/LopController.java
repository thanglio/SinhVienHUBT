package com.example.demo.Controller;

import com.example.demo.Entity.Lop;
import com.example.demo.Repository.LopRepo;
import com.example.demo.Service.Implement.LopServiceIpl;
import com.example.demo.Service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lop")
public class LopController {
    @Autowired
    LopService lopService;

    @GetMapping
    public List<Lop> getall(){
        return lopService.getall();
    }

    @PostMapping("/save")
    public  List<Lop> save(@RequestBody Lop lop){
        lopService.save(lop);
        return lopService.getall();
    }

    @PutMapping("/addtokhoa")
    public List<Lop> adtokhoa(@RequestParam long lopID, @RequestParam long khoaID){
        return lopService.addtokhoa(khoaID,lopID);

    }
}
