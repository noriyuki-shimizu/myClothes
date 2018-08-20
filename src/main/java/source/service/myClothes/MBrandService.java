package source.service.myClothes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.dto.MBrandDto;
import source.repository.myClothes.MBrandRepository;

@Service
@Transactional
public class MBrandService {

	@Autowired
	private MBrandRepository mBrandRepository;
	
	public List<MBrandDto> findAll() {
		List<MBrandDto> mBrandList = mBrandRepository.findAll();
		mBrandList.stream().forEach(mBrand -> {
			mBrand.setDeleteFlgStr();
		});
		return mBrandList;
	}
	
}
