package source.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.dto.common.BMenuDto;
import source.entity.common.BMenuEntity;
import source.mapper.common.BMenuMapper;
import source.repository.common.BMenuRepository;

@Service
@Transactional
public class BMenuService {

	@Autowired
	private BMenuRepository bMenuRepository;
	
	/**
	 * <h2>メニューマスタの全件検索.</h2>
	 * <pre>
	 * b_menuから全件取得し、Dtoに変換する。
	 * 変換されたDtoリストを返す。
	 * </pre>
	 * @return EntityからDtoに変換されたリスト
	 */
	public List<BMenuDto> findAll() {
		List<BMenuEntity> menuEntityList = bMenuRepository.findAll();
		
		BMenuMapper mapper = new BMenuMapper();
		mapper.mappingOfRelatedTables(true);
		
		List<BMenuDto> menuDtoList = mapper.mappingToDtoList(menuEntityList);
		
		return menuDtoList;
	}
	
}
