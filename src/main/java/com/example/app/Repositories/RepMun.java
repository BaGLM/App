package com.example.app.Repositories;

import com.example.app.Models.Municipio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface RepMun extends JpaRepository<Municipio,Long>, PagingAndSortingRepository<Municipio,Long> {

    Optional<Municipio> findById(Long id);
    Page findAll(Pageable pageable);
}
