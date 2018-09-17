package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.MGenreEntity;

@Repository
public interface MGenreRepository extends JpaRepository<MGenreEntity, Integer>{

}
