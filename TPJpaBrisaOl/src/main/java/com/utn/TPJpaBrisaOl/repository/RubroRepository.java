package com.utn.TPJpaBrisaOl.repository;
import com.utn.TPJpaBrisaOl.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro,Long> {
}
