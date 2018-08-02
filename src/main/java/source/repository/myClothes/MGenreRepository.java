package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.dto.MGenreDto;

@Repository
public interface MGenreRepository extends JpaRepository<MGenreDto, Integer>{

}
