package source.entity.common;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * メニュー関するEntityクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "b_menu")
public class BMenuEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "menu_id")
	private Long menuId;
	
	@Column(name = "menu_cd")
	private String menuCd;
	
	@Column(name = "menu_nm")
	private String menuNm;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "bMenuEntity")
	List<BScreenEntity> bScreenList = new ArrayList<>();

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

	public List<BScreenEntity> getbScreenList() {
		return bScreenList;
	}

	public void setbScreenList(List<BScreenEntity> bScreenList) {
		this.bScreenList = bScreenList;
	}
	
}
