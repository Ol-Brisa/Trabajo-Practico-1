package com.utn.TPJpaBrisaOl.repository;
import com.utn.TPJpaBrisaOl.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
