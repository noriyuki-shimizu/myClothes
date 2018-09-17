package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.MBrandEntity;

@Repository
public interface MBrandRepository extends JpaRepository<MBrandEntity, Integer>{
	
}
