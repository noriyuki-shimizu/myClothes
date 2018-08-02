package source.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_clothes")
public class MyClothesDto {
	
	public MyClothesDto(Long myClothesId) {
		this.myClothesId = myClothesId;
	}

	/**	服情報　主キー */
	@Id
	@Column(name = "my_clothes_id")
	private Long myClothesId;
	
	/**	ブランドID */
	@Column(name = "brand_id")
	private Integer brandId;
	
//	/**	ブランドマスタ */
//	private MBrandDto mBrandDto;
	
	/**	ジャンルID */
	@Column(name = "genre_id")
	private Integer genreId;
	
//	/**	ジャンルマスタ */
//	private MGenreDto mGenreDto;
	
	/**	店ID */
	@Column(name = "shop_id")
	private Integer shopId;
	
//	/**	店マスタ */
//	private MShopDto mShopDto;
	
	/**	画像パス */
	@Column(name = "image_path")
	private String imagePath;
	
	/**	金額 */
	@Column(name = "price")
	private BigDecimal price;
	
	/**	購入日 */
	@Column(name = "purchase_date")
	private Timestamp purchaseDate;
	
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
	private Boolean deleteFlg;

//	public MBrandDto getmBrandDto() {
//		return mBrandDto;
//	}
//	
//	public void setmBrandDto(MBrandDto mBrandDto) {
//		this.mBrandDto = mBrandDto;
//	}
//	
//	public MGenreDto getmGenreDto() {
//		return mGenreDto;
//	}
//	
//	public void setmGenreDto(MGenreDto mGenreDto) {
//		this.mGenreDto = mGenreDto;
//	}
//	
//	public MShopDto getmShopDto() {
//		return mShopDto;
//	}
//	
//	public void setmShopDto(MShopDto mShopDto) {
//		this.mShopDto = mShopDto;
//	}
	
}
