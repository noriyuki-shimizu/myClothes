package source.mapper.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import source.domain.common.CU;
import source.dto.common.BMenuDto;
import source.dto.common.BScreenDto;
import source.entity.common.BMenuEntity;
import source.entity.common.BScreenEntity;
import source.mapper.BaseMapper;

@Component
public class BMenuMapper extends BaseMapper<BMenuEntity, BMenuDto>{

	@Autowired
	private BScreenMapper bScreenMapper;
	
	@Override
	public BMenuEntity mappingToEntity(BMenuDto d) {
		return this.dtoToEntity(d);
	}

	@Override
	public BMenuDto mappingToDto(BMenuEntity e) {
		return this.EntityToDto(e);
	}

	@Override
	public List<BMenuEntity> mappingToEntityList(List<BMenuDto> ds) {
		List<BMenuEntity> es = new ArrayList<>();
		
		ds.stream().forEach(d -> {
			es.add(this.dtoToEntity(d));
		});
		
		return es;
	}

	@Override
	public List<BMenuDto> mappingToDtoList(List<BMenuEntity> es) {
		List<BMenuDto> ds = new ArrayList<>();
		
		es.stream().forEach(e -> {
			ds.add(this.EntityToDto(e));
		});
		
		return ds;
	}
	
	private BMenuEntity dtoToEntity(BMenuDto d) {
		BMenuEntity e = new BMenuEntity();
		
		e.setMenuCd(d.getMenuCd());
		e.setMenuId(d.getMenuId());
		e.setMenuNm(d.getMenuNm());

		List<BScreenEntity> bScreenEntityList = new ArrayList<>();
		
		if(!CU.isListSizeToZero(d.getbScreenDtoList())) {
			d.getbScreenDtoList().stream().forEach(bScreenDto -> {
				bScreenDto.setbMenuDto(null);
			});
			
			bScreenEntityList = bScreenMapper.mappingToEntityList(d.getbScreenDtoList());
		}
		
		e.setbScreenList(bScreenEntityList);
		
		return e;
	}
	
	private BMenuDto EntityToDto(BMenuEntity e) {
		BMenuDto d = new BMenuDto();

		d.setMenuCd(e.getMenuCd());
		d.setMenuId(e.getMenuId());
		d.setMenuNm(e.getMenuNm());
		
		List<BScreenDto> bScreenDtoList = new ArrayList<>();
		
		if(!CU.isListSizeToZero(e.getbScreenList())) {
			e.getbScreenList().stream().forEach(bScreen -> {
				bScreen.setbMenuEntity(null);
			});
			
			bScreenDtoList = bScreenMapper.mappingToDtoList(e.getbScreenList());
		}
		
		d.setbScreenDtoList(bScreenDtoList);
		
		return d;
	}
	
}
