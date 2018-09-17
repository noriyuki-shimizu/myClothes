package source.factory;

import java.util.HashMap;

import source.entity.MGenreEntity;
import source.factory.bsFactory.Factory;

public class MGenreFactory extends Factory<Integer, MGenreEntity> {

	public MGenreFactory() {
		this.pool = new HashMap<Integer, MGenreEntity>();
	}
	
	protected MGenreEntity createObj(Integer ownerId) {
		MGenreEntity mGenreDto = this.pool.get(ownerId);
		if(mGenreDto == null) {
			mGenreDto = new MGenreEntity(ownerId);
			this.pool.put(ownerId, mGenreDto);
		}
		return mGenreDto;
	}
	
}
