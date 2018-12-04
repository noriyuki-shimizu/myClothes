package source.repository.myClothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.myClothes.MyClothesEntity;

@Repository
public interface MyClothesRepository extends JpaRepository<MyClothesEntity, Long> {

}
