package com.example.demo.Repository;

import com.example.demo.Entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepo  extends JpaRepository<Khoa,Long> {
    Khoa findBykhoaName(String khoaName);
}
