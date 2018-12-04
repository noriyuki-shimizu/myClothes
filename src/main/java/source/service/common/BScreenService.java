package source.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.dto.common.BScreenDto;
import source.entity.common.BScreenEntity;
import source.mapper.common.BScreenMapper;
import source.repository.common.BScreenRepository;

@Service
@Transactional
public class BScreenService {

	@Autowired
	private BScreenRepository bScreenRepository;
	
	@Autowired
	private BScreenMapper mapper;
	
	/**
	 * <h2>画面マスタの全件検索.</h2>
	 * <pre>
	 * b_screenから全件取得し、Dtoに変換する。
	 * 変換されたDtoリストを返す。
	 * </pre>
	 * @return EntityからDtoに変換されたリスト
	 */
	public List<BScreenDto> findAll() {
		List<BScreenEntity> screenEntityList = bScreenRepository.findAll();
		
		List<BScreenDto> screenDtoList = mapper.mappingToDtoList(screenEntityList);
		
		return screenDtoList;
	}
	
}
