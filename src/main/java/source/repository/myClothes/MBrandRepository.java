package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.dto.MBrandDto;

@Repository
public interface MBrandRepository extends JpaRepository<MBrandDto, Integer>{
	
}
