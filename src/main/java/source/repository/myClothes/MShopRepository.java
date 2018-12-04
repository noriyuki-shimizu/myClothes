package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.myClothes.MShopEntity;

@Repository
public interface MShopRepository extends JpaRepository<MShopEntity, Integer>{

}
