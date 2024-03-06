package br.com.darkthriftstore.repository;

import br.com.darkthriftstore.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity,Long> {
}
