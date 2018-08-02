package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.dto.MShopDto;

@Repository
public interface MShopRepository extends JpaRepository<MShopDto, Integer>{

}
