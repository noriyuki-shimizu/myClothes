package source.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.common.BMenuEntity;

@Repository
public interface BMenuRepository extends JpaRepository<BMenuEntity, Integer> {

}
