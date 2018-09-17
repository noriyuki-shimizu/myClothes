package source.service.myClothes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import source.entity.MBrandEntity;
import source.repository.myClothes.MBrandRepository;

@Service
@Transactional
public class MBrandService {

	@Autowired
	private MBrandRepository mBrandRepository;
	
	public List<MBrandEntity> findAll() {
		List<MBrandEntity> mBrandList = mBrandRepository.findAll();
		mBrandList.stream().forEach(mBrand -> {
			mBrand.setDeleteFlgStr();
		});
		return mBrandList;
	}
	
}
