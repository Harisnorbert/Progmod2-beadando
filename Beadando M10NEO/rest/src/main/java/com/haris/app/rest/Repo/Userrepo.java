package com.haris.app.rest.Repo;
import com.haris.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User , Long>{
}
