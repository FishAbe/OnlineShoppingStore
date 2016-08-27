package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.cs544.models.Admin;

public interface IAdminDAO extends JpaRepository<Admin, Long> {

}
