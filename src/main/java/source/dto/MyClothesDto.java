package source.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import source.logic.ChangeDelFlg;
import source.logic.bsLogic.ChangeFlg;

/**
 * 服マスタ(Base)Dto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "my_clothes")
public class MyClothesDto {
	
	public MyClothesDto() {}
	
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
	
	/**	ジャンルID */
	@Column(name = "genre_id")
	private Integer genreId;
	
	/**	店ID */
	@Column(name = "shop_id")
	private Integer shopId;
	
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
	protected Boolean deleteFlg;
	
	/**	削除フラグ（文字列） テーブルのカラム対象外 */
	@Transient
	private String deleteFlgStr;

	/**	ブランドマスタDto */
	@OneToOne
	@JoinTable(
            name="m_brand",
            joinColumns=@JoinColumn(name="brand_id"),
            inverseJoinColumns=@JoinColumn(name="my_clothes_id")
        )
	private MBrandDto mBrandDto;
	
	/**	ジャンルマスタDto */
	@OneToOne
	@JoinTable(
			name="m_genre",
			joinColumns=@JoinColumn(name="genre_id"),
			inverseJoinColumns=@JoinColumn(name="my_clothes_id")
			)
	private MGenreDto mGenreDto;
	
	/**	お店Dto */
	@OneToOne
	@JoinTable(
			name="m_shop",
			joinColumns=@JoinColumn(name="shop_id"),
			inverseJoinColumns=@JoinColumn(name="my_clothes_id")
			)
	private MShopDto mShopDto;
	
	public Long getMyClothesId() {
		return myClothesId;
	}

	public void setMyClothesId(Long myClothesId) {
		this.myClothesId = myClothesId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Timestamp getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Timestamp purchaseDate) {
		this.purchaseDate = purchaseDate;
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
		// フラグから文字列に変換
		this.setDeleteFlgStr();
	}

	public MBrandDto getmBrandDto() {
		return mBrandDto;
	}
	
	public void setmBrandDto(MBrandDto mBrandDto) {
		this.mBrandDto = mBrandDto;
	}
	
	public MGenreDto getmGenreDto() {
		return mGenreDto;
	}
	
	public void setmGenreDto(MGenreDto mGenreDto) {
		this.mGenreDto = mGenreDto;
	}
	
	public MShopDto getmShopDto() {
		return mShopDto;
	}
	
	public void setmShopDto(MShopDto mShopDto) {
		this.mShopDto = mShopDto;
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
		this.deleteFlgStr = changeFlg.changeFlgOfMyClothesDto(this);
	}

}
