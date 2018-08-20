package source.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import source.logic.ChangeDelFlg;
import source.logic.bsLogic.ChangeFlg;

/**
 * ブランドマスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "m_brand")
public class MBrandDto {
	
	public MBrandDto() {}
	
	public MBrandDto(Integer brandId) {
		this.brandId = brandId;
	}
	
	/**	主キー */
	@Id
	@Column(name = "brand_id")
	private Integer brandId;
	
	/**	ブランドCD */
	@Column(name = "brand_cd")
	private String brandCd;
	
	/**	ブランド名称 */
	@Column(name = "brand_name")
	private String brandName;
	
	/**	生まれの国 */
	@Column(name = "country")
	private String country;
	
	/**	詳細 */
	@Column(name = "details")
	private String details;
	
	/**	データ追加日時 */
	@Column(name = "insert_date")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;
	
	/**	論理削除フラグ */
	@Column(name = "delete_flg")
	protected Boolean deleteFlg;
	
	/**	削除フラグ（文字列） テーブルのカラム対象外 */
	@Transient
	private String deleteFlgStr;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandCd() {
		return brandCd;
	}

	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Timestamp getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
		// フラグから文字列に変換
		this.setDeleteFlgStr();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	/**
	 * @return 削除フラグ（文字列）
	 */
	public String getDeleteFlgStr() {
		return deleteFlgStr;
	}

	/**	削除フラグから、削除済みか未削除を格納する */
	public void setDeleteFlgStr() {
		ChangeFlg changeFlg = ChangeDelFlg.getInstance();
		this.deleteFlgStr = changeFlg.changeFlgOfMBrandDto(this);
	}

}
