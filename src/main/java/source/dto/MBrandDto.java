package source.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ブランドマスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Table(name = "m_brand")
public class MBrandDto {
	
	public MBrandDto(Integer brandId) {
		this.brandId = brandId;
	}
	
	/**	主キー */
	@Id
	@Column(name = "brand_id")
	private Integer brandId;
	
	/**	ブランドCD */
	@Column(name = "brand_cd", nullable = false, length = 50)
	private String brandCd;
	
	/**	ブランド名称 */
	@Column(name = "brand_name", nullable = false, length = 50)
	private String brandName;
	
	/**	データ追加日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Calendar insertDate;
	
	/**	データ更新日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Calendar updateDate;
	
	/**	論理削除フラグ */
	@Column(name = "delete_flg")
	private Boolean deleteFlg;

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

	public Calendar getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Calendar insertDate) {
		this.insertDate = insertDate;
	}

	public Calendar getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
