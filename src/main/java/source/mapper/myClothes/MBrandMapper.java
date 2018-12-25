package source.mapper.myClothes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import source.domain.flg.bsFlg.ChangeFlg;
import source.dto.myClothes.MBrandDto;
import source.dtomapper.BaseMapper;
import source.entity.myClothes.MBrandEntity;
import source.factory.domain.ChangeFlgFactory;
import source.factory.domain.flg.ChangeDelFlgFactory;

@Component
public class MBrandMapper extends BaseMapper<MBrandEntity, MBrandDto> {

	@Override
	public MBrandEntity mappingToEntity(MBrandDto d) {
		return this.dtoToEntity(d);
	}

	@Override
	public MBrandDto mappingToDto(MBrandEntity e) {
		return this.EntityToDto(e);
	}

	@Override
	public List<MBrandEntity> mappingToEntityList(List<MBrandDto> ds) {
		List<MBrandEntity> es = new ArrayList<>();
		
		ds.stream().forEach(d -> {
			es.add(this.dtoToEntity(d));
		});
		
		return es;
	}

	@Override
	public List<MBrandDto> mappingToDtoList(List<MBrandEntity> es) {
		List<MBrandDto> ds = new ArrayList<MBrandDto>();
		
		es.stream().forEach(e -> {
			ds.add(this.EntityToDto(e));
		});
		
		return ds;
	}
	
	private MBrandEntity dtoToEntity(MBrandDto d) {
		MBrandEntity e = new MBrandEntity();
		
		e.setBrandId(d.getBrandId());
		e.setBrandCd(d.getBrandCd());
		e.setBrandName(d.getBrandName());
		e.setCountry(d.getCountry());
		e.setDetails(d.getDetails());
		e.setDeleteFlg(d.getDeleteFlg());
		e.setInsertDate(d.getInsertDate());
		e.setUpdateDate(d.getUpdateDate());
		
		return e;
	}
	
	private MBrandDto EntityToDto(MBrandEntity e) {
		MBrandDto d = new MBrandDto();
		
		d.setBrandId(e.getBrandId());
		d.setBrandCd(e.getBrandCd());
		d.setBrandName(e.getBrandName());
		d.setCountry(e.getCountry());
		d.setDetails(e.getDetails());
		d.setDeleteFlg(e.getDeleteFlg());
		d.setInsertDate(e.getInsertDate());
		d.setUpdateDate(e.getUpdateDate());
		
		ChangeFlgFactory<String> factory = new ChangeDelFlgFactory();
		ChangeFlg<String> changeFlg = factory.create(e.getDeleteFlg());
		d.setDeleteFlgStr(changeFlg.changeFlg());
		
		return d;
	}

}
