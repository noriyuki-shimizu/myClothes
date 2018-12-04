package source.service.myClothes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.dto.myClothes.MBrandDto;
import source.entity.myClothes.MBrandEntity;
import source.mapper.myClothes.MBrandMapper;
import source.repository.myClothes.MBrandRepository;

@Service
@Transactional
public class MBrandService {

	@Autowired
	private MBrandRepository mBrandRepository;
	
	@Autowired
	private MBrandMapper mBrandMapper;
	
	/**
	 * <h2>ブランドマスタの全検索.</h2>
	 * <pre>
	 * m_brandから全件取得し、Dtoに変換する。
	 * 変換されたDtoリストを返す。
	 * </pre>
	 * @return 変換されたDtoリスト
	 */
	public List<MBrandDto> findAll() {
		List<MBrandEntity> mBrandList = mBrandRepository.findAll();
		
		List<MBrandDto> mBrandDtoList = mBrandMapper.mappingToDtoList(mBrandList);

		return mBrandDtoList;
	}
	
}
