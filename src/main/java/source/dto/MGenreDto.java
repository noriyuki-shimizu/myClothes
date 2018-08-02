package source.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
