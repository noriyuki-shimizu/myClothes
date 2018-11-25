package source.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import source.domain.factory.flg.ChangeDelFlgFactory;
import source.domain.factory.flg.bs.ChangeFlgFactory;
import source.domain.flg.bsFlg.ChangeFlg;
import source.dto.MBrandDto;
import source.entity.MBrandEntity;
import source.mapper.bsMapper.BaseMapper;

@Component
public class MBrandMapper extends BaseMapper<MBrandEntity, MBrandDto> {

	@Override
	public MBrandEntity mappingToEntity(MBrandDto d) {
		this.e = new MBrandEntity();
		
		dtoToEntity(d);
		
		return this.e;
	}

	@Override
	public MBrandDto mappingToDto(MBrandEntity e) {
		this.d = new MBrandDto();
		
		EntityToDto(e);
		
		return this.d;
	}

	@Override
	public List<MBrandEntity> mappingToEntityList(List<MBrandDto> ds) {
		this.es = new ArrayList<MBrandEntity>();
		
		ds.stream().forEach(d -> {
			this.es.add(dtoToEntity(d));
		});
		
		return this.es;
	}

	@Override
	public List<MBrandDto> mappingToDtoList(List<MBrandEntity> es) {
		this.ds = new ArrayList<MBrandDto>();
		
		es.stream().forEach(e -> {
			this.ds.add(EntityToDto(e));
		});
		
		return this.ds;
	}
	
	private MBrandEntity dtoToEntity(MBrandDto d) {
		this.e = new MBrandEntity();
		
		this.e.setBrandId(d.getBrandId());
		this.e.setBrandCd(d.getBrandCd());
		this.e.setBrandName(d.getBrandName());
		this.e.setCountry(d.getCountry());
		this.e.setDetails(d.getDetails());
		this.e.setDeleteFlg(d.getDeleteFlg());
		this.e.setInsertDate(d.getInsertDate());
		this.e.setUpdateDate(d.getUpdateDate());
		
		return this.e;
	}
	
	private MBrandDto EntityToDto(MBrandEntity e) {
		this.d = new MBrandDto();
		
		this.d.setBrandId(e.getBrandId());
		this.d.setBrandCd(e.getBrandCd());
		this.d.setBrandName(e.getBrandName());
		this.d.setCountry(e.getCountry());
		this.d.setDetails(e.getDetails());
		this.d.setDeleteFlg(e.getDeleteFlg());
		this.d.setInsertDate(e.getInsertDate());
		this.d.setUpdateDate(e.getUpdateDate());
		
		ChangeFlgFactory<String> factory = new ChangeDelFlgFactory();
		ChangeFlg<String> changeFlg = factory.create(e.getDeleteFlg());
		this.d.setDeleteFlgStr(changeFlg.changeFlg());
		
		return this.d;
	}

}
