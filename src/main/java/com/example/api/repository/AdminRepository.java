package com.example.api.repository;

import com.example.api.model.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// 表明该类是一个Repository类
public interface AdminRepository extends JpaRepository<Admin, String> {

    Admin findAdminByEmailAndPassword(String email, String password);

    Admin findAdminByEmail(String email);

    boolean existsAdminByRoles(String roles);

}
