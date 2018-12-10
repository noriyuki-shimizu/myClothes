package source.dto.common;

import source.dto.BaseDto;

public class BScreenDto extends BaseDto {

	private Long screenId;
	
	private String screenCd;
	
	private String screenNm;
	
	private String initUrl;

    private BMenuDto bMenuDto;

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public String getScreenCd() {
		return screenCd;
	}

	public void setScreenCd(String screenCd) {
		this.screenCd = screenCd;
	}

	public String getScreenNm() {
		return screenNm;
	}

	public void setScreenNm(String screenNm) {
		this.screenNm = screenNm;
	}

	public String getInitUrl() {
		return initUrl;
	}

	public void setInitUrl(String initUrl) {
		this.initUrl = initUrl;
	}

	public BMenuDto getbMenuDto() {
		return bMenuDto;
	}

	public void setbMenuDto(BMenuDto bMenuDto) {
		this.bMenuDto = bMenuDto;
	}
	
}
