package source.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 服マスタ(Base)Dto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "my_clothes")
public class MyClothesEntity {
	
	public MyClothesEntity() {}
	
	public MyClothesEntity(Long myClothesId) {
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

	/**	ブランドマスタDto */
	@OneToOne
	@JoinTable(
            name="m_brand",
            joinColumns=@JoinColumn(name="brand_id"),
            inverseJoinColumns=@JoinColumn(name="my_clothes_id")
        )
	private MBrandEntity mBrandDto;
	
	/**	ジャンルマスタDto */
	@OneToOne
	@JoinTable(
			name="m_genre",
			joinColumns=@JoinColumn(name="genre_id"),
			inverseJoinColumns=@JoinColumn(name="my_clothes_id")
			)
	private MGenreEntity mGenreDto;
	
	/**	お店Dto */
	@OneToOne
	@JoinTable(
			name="m_shop",
			joinColumns=@JoinColumn(name="shop_id"),
			inverseJoinColumns=@JoinColumn(name="my_clothes_id")
			)
	private MShopEntity mShopDto;
	
	public Long getMyClothesId() {
		return myClothesId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public Integer getGenreId() {
		return genreId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Timestamp getPurchaseDate() {
		return purchaseDate;
	}

	public String getDetails() {
		return details;
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

	public MBrandEntity getmBrandDto() {
		return mBrandDto;
	}
	
	public MGenreEntity getmGenreDto() {
		return mGenreDto;
	}
	
	public MShopEntity getmShopDto() {
		return mShopDto;
	}
	
}
