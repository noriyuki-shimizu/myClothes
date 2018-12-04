package source.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.entity.common.BScreenEntity;
import source.repository.common.BScreenRepository;

@Service
@Transactional
public class BScreenService {

	@Autowired
	private BScreenRepository bScreenRepository;
	
	public List<BScreenEntity> findAll() {
		return bScreenRepository.findAll();
	}
	
}
