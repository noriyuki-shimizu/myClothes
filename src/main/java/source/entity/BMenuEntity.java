package source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * メニュー関するEntityクラス.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "b_menu")
public class BMenuEntity {
	
	@Id
	@Column(name = "menu_id")
	private Long menuId;
	
	@Column(name = "menu_cd")
	private String menuCd;
	
	@Column(name = "menu_nm")
	private String menuNm;

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
}
