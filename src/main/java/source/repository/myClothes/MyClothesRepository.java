package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.dto.bsDto.BsMyClothesDto;

@Repository
public interface MyClothesRepository extends JpaRepository<BsMyClothesDto, Long> {

}
