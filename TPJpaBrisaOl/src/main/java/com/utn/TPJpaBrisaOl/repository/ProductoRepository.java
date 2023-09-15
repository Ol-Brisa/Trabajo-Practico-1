package com.utn.TPJpaBrisaOl.repository;
import com.utn.TPJpaBrisaOl.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
