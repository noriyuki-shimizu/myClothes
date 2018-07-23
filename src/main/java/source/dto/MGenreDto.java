package source.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_genre")
public class MGenreDto {
	
	public MGenreDto(Integer genreId) {
		this.genreId = genreId;
	}
	
	/**	ジャンルマスタ　主キー */
	@Id
	@Column(name = "genre_id")
	private Integer genreId;
	
	/**	ジャンルCD */
	@Column(name = "genre_cd", nullable = false, length = 15)
	private String genreCd;
	
	/**	ジャンル名 */
	@Column(name = "genre_name", nullable = false, length = 20)
	private String genreName;
	
	/**	データ追加日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Date insertDate;
	
	/**	データ更新日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;
	
	/**	削除フラグ */
	@Column(name = "delete_flg", nullable = false)
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

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
