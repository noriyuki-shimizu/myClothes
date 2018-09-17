package source.dto;

import java.sql.Timestamp;

import source.logic.ChangeDelFlg;
import source.logic.bsLogic.ChangeFlg;

public class MBrandDto {

	/**	主キー */
	@SuppressWarnings("unused")
	private Integer brandId;
	
	/**	ブランドCD */
	@SuppressWarnings("unused")
	private String brandCd;
	
	/**	ブランド名称 */
	@SuppressWarnings("unused")
	private String brandName;
	
	/**	生まれの国 */
	@SuppressWarnings("unused")
	private String country;
	
	/**	詳細 */
	@SuppressWarnings("unused")
	private String details;
	
	/**	データ追加日時 */
	@SuppressWarnings("unused")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@SuppressWarnings("unused")
	private Timestamp updateDate;
	
	/**	論理削除フラグ */
	protected Boolean deleteFlg;
	
	/**	削除フラグ（文字列） テーブルのカラム対象外 */
	@SuppressWarnings("unused")
	private String deleteFlgStr;
	
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
	
	/**	削除フラグから、削除済みか未削除を格納する */
	public void setDeleteFlgStr() {
		ChangeFlg changeFlg = ChangeDelFlg.getInstance();
		this.deleteFlgStr = changeFlg.changeFlgOfMBrandDto(this);
	}
	
}
