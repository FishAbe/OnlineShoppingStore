package mum.edu.cs544.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.models.Author;

@Repository
public interface IAuthorDAO extends JpaRepository<Author, Long> {

}
