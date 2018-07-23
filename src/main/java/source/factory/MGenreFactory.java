package source.factory;

import java.util.HashMap;

import source.dto.MGenreDto;
import source.factory.bsFactory.Factory;

public class MGenreFactory extends Factory<Integer, MGenreDto> {

	public MGenreFactory() {
		this.pool = new HashMap<Integer, MGenreDto>();
	}
	
	protected MGenreDto createObj(Integer ownerId) {
		MGenreDto mGenreDto = this.pool.get(ownerId);
		if(mGenreDto == null) {
			mGenreDto = new MGenreDto(ownerId);
			this.pool.put(ownerId, mGenreDto);
		}
		return mGenreDto;
	}
	
}
