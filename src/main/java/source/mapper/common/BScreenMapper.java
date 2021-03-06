package source.mapper.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import source.domain.common.CU;
import source.dto.common.BMenuDto;
import source.dto.common.BScreenDto;
import source.dtomapper.BaseMapper;
import source.entity.common.BMenuEntity;
import source.entity.common.BScreenEntity;

@Component
public class BScreenMapper extends BaseMapper<BScreenEntity, BScreenDto> {
	
	@Override
	public BScreenEntity mappingToEntity(BScreenDto d) {
		return this.dtoToEntity(d);
	}

	@Override
	public BScreenDto mappingToDto(BScreenEntity e) {
		return this.EntityToDto(e);
	}

	@Override
	public List<BScreenEntity> mappingToEntityList(List<BScreenDto> ds) {
		List<BScreenEntity> es = new ArrayList<>();
		
		ds.stream().forEach(d -> {
			es.add(this.dtoToEntity(d));
		});
		
		return es;
	}

	@Override
	public List<BScreenDto> mappingToDtoList(List<BScreenEntity> es) {
		List<BScreenDto> ds = new ArrayList<>();
		
		es.stream().forEach(e -> {
			ds.add(this.EntityToDto(e));
		});
		
		return ds;
	}
	
	private BScreenEntity dtoToEntity(BScreenDto d) {
		BScreenEntity e = new BScreenEntity();
		
		if(_mappingOfRelatedFlg && !CU.isObjectToNull(d.getbMenuDto())) {
			d.getbMenuDto().setbScreenDtoList(null);

			BMenuMapper bMenuMapper = new BMenuMapper();
			BMenuEntity bMenuEntity = bMenuMapper.mappingToEntity(d.getbMenuDto());
			
			e.setbMenuEntity(bMenuEntity);
		}
		
		e.setInitUrl(d.getInitUrl());
		e.setScreenId(d.getScreenId());
		e.setScreenCd(d.getScreenCd());
		e.setScreenNm(d.getScreenNm());
		
		return e;
	}
	
	private BScreenDto EntityToDto(BScreenEntity e) {
		BScreenDto d = new BScreenDto();

		if(_mappingOfRelatedFlg && !CU.isObjectToNull(e.getbMenuEntity())) {
			e.getbMenuEntity().setbScreenList(null);
			
			BMenuMapper bMenuMapper = new BMenuMapper();
			BMenuDto mMenuDto = bMenuMapper.mappingToDto(e.getbMenuEntity());
			
			d.setbMenuDto(mMenuDto);
		}
		
		d.setInitUrl(d.getInitUrl());
		d.setScreenId(e.getScreenId());
		d.setScreenCd(e.getScreenCd());
		d.setScreenNm(e.getScreenNm());
		
		return d;
	}

}
