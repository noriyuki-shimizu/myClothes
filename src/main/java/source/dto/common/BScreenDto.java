package source.dto.common;

import source.dto.BaseDto;
import source.entity.common.BMenuEntity;

public class BScreenDto extends BaseDto {

	private Long screenId;
	
	private String screenCd;
	
	private String screenNm;
	
	private String initUrl;

    private BMenuEntity bMenuEntity;

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

	public BMenuEntity getbMenuEntity() {
		return bMenuEntity;
	}

	public void setbMenuEntity(BMenuEntity bMenuEntity) {
		this.bMenuEntity = bMenuEntity;
	}
	
}
