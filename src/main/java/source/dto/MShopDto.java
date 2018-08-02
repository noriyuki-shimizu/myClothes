package source.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_shop")
public class MShopDto {
	
	public MShopDto(Integer shopId) {
		this.shopId = shopId;
	}
	
	/**	ショップマスタ　主キー */
	@Id
	@Column(name = "shop_id")
	private Integer shopId;
	
	/**	ショップCD */
	@Column(name = "shop_cd")
	private String shopCd;
	
	/**	ショップ名 */
	@Column(name = "shop_name")
	private String shopName;
	
	/**	郵便CD */
	@Column(name = "postal_cd")
	private String postalCd;
	
	/**	住所 */
	@Column(name = "address")
	private String address;
	
	/**	店URL */
	@Column(name = "shop_url")
	private String shopUrl;
	
	/**	データ追加日時 */
	@Column(name = "insert_date")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;
	
	/**	削除フラグ */
	@Column(name = "delete_flg")
	private Boolean deleteFlg;

}
