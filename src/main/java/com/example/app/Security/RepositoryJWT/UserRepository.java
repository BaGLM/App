package com.example.app.Security.RepositoryJWT;

import com.example.app.Security.ModelsJWT.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    Page findAll(Pageable pageable);

    Optional<User> findByUsername(String username);
    Page<User> findByUsernameContaining(String username, Pageable paging);
    Page<User> findByNombreContaining(String nombre, Pageable paging);
    Page<User> findByApellidoPContaining(String apellidoP, Pageable paging);
    Page<User> findByApellidoMContaining(String apellidoM, Pageable paging);

    Boolean existsByUsername(String username);
}