package source.dto.common;

import java.util.List;

import source.dto.BaseDto;

public class BMenuDto extends BaseDto {

	private Long menuId;
	
	private String menuCd;
	
	private String menuNm;
	
	private List<BScreenDto> bScreenDtoList; 
	
	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getMenuCd() {
		return menuCd;
	}

	public void setMenuCd(String menuCd) {
		this.menuCd = menuCd;
	}

	public String getMenuNm() {
		return menuNm;
	}

	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}

	public List<BScreenDto> getbScreenDtoList() {
		return bScreenDtoList;
	}

	public void setbScreenDtoList(List<BScreenDto> bScreenDtoList) {
		this.bScreenDtoList = bScreenDtoList;
	}

}
