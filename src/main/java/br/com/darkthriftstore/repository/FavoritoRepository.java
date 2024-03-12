package br.com.darkthriftstore.repository;

import br.com.darkthriftstore.entity.FavoritoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<FavoritoEntity,Long> {
}
