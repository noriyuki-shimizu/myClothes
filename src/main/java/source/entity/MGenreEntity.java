package source.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ジャンルマスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "m_genre")
public class MGenreEntity {
	
	public MGenreEntity() {}
	
	public MGenreEntity(Integer genreId) {
		this.genreId = genreId;
	}
	
	/**	ジャンルマスタ　主キー */
	@Id
	@Column(name = "genre_id")
	private Integer genreId;
	
	/**	ジャンルCD */
	@Column(name = "genre_cd")
	private String genreCd;
	
	/**	ジャンル名 */
	@Column(name = "genre_name")
	private String genreName;
	
	/**	データ追加日時 */
	@Column(name = "insert_date")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;
	
	/**	削除フラグ */
	@Column(name = "delete_flg")
	private Boolean deleteFlg;

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public String getGenreCd() {
		return genreCd;
	}

	public void setGenreCd(String genreCd) {
		this.genreCd = genreCd;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
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

}
