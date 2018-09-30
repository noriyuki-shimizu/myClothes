package source.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ブランドマスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "m_brand")
public class MBrandEntity {
	
	public MBrandEntity() {}
	
	public MBrandEntity(Integer brandId) {
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
	
	public Integer getBrandId() {
		return brandId;
	}

	public String getBrandCd() {
		return brandCd;
	}

	public String getBrandName() {
		return brandName;
	}

	public Timestamp getInsertDate() {
		return insertDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public String getCountry() {
		return country;
	}

	public String getDetails() {
		return details;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
