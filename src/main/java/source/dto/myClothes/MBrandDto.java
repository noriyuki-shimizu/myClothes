package source.dto.myClothes;

import java.sql.Timestamp;

import source.dto.BaseDto;

public class MBrandDto extends BaseDto {

	/**	主キー */
	private Integer brandId;
	
	/**	ブランドCD */
	private String brandCd;
	
	/**	ブランド名称 */
	private String brandName;
	
	/**	生まれの国 */
	private String country;
	
	/**	詳細 */
	private String details;
	
	/**	データ追加日時 */
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	private Timestamp updateDate;
	
	/**	論理削除フラグ */
	protected Boolean deleteFlg;
	
	/**	削除フラグ（文字列） テーブルのカラム対象外 */
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
	}

	public String getDeleteFlgStr() {
		return deleteFlgStr;
	}

	public void setDeleteFlgStr(String deleteFlgStr) {
		this.deleteFlgStr = deleteFlgStr;
	}
	
}
