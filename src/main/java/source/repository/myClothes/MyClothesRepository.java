package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.dto.MyClothesDto;

@Repository
public interface MyClothesRepository extends JpaRepository<MyClothesDto, Long> {

}
