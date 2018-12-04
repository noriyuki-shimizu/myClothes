package source.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import source.entity.common.BScreenEntity;

@Repository
public interface BScreenRepository extends JpaRepository<BScreenEntity, Integer> {

}
