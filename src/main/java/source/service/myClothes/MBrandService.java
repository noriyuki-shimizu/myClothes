package source.service.myClothes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.dto.MBrandDto;
import source.entity.myClothes.MBrandEntity;
import source.mapper.MBrandMapper;
import source.repository.myClothes.MBrandRepository;

@Service
@Transactional
public class MBrandService {

	@Autowired
	private MBrandRepository mBrandRepository;
	
	@Autowired
	private MBrandMapper mBrandMapper;
	
	public List<MBrandDto> findAll() {
		List<MBrandEntity> mBrandList = mBrandRepository.findAll();
		
		List<MBrandDto> mBrandDtoList = mBrandMapper.mappingToDtoList(mBrandList);

		return mBrandDtoList;
	}
	
}
