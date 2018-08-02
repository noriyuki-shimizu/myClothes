package source.dto;

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
public class MBrandDto {
	
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
	
	/**	データ追加日時 */
	@Column(name = "insert_date")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;
	
	/**	論理削除フラグ */
	@Column(name = "delete_flg")
	private Boolean deleteFlg;

}
