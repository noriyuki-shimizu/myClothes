package source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 画面マスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "b_screen")
public class BScreenEntity {

	@Id
	@Column(name = "screen_id")
	private Long screenId;
	
	@Column(name = "screen_cd")
	private String screenCd;
	
	@Column(name = "screen_nm")
	private String screenNm;
	
	@Column(name = "init_url")
	private String initUrl;

	@ManyToOne
	@JoinColumn(name = "menu_id")
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
