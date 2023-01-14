package com.example.demo.Repository;

import com.example.demo.Entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LopRepo extends JpaRepository<Lop,Long > {
    Lop findByLopname(String lopname);
}
