package source.factory;

import java.util.HashMap;

import source.dto.bsDto.BsMyClothesDto;
import source.factory.bsFactory.Factory;

/**
 * MyClothesDto製造クラス.
 * @author Noriyuki-Shimizu
 *
 */
public class MyClothesFactory extends Factory<Long, BsMyClothesDto>{

	public MyClothesFactory() {
		this.pool = new HashMap<Long, BsMyClothesDto>();
	}
	
	protected BsMyClothesDto createObj(Long ownerId) {
		BsMyClothesDto myClothesDto = this.pool.get(ownerId);
		if(myClothesDto == null) {
			myClothesDto = new BsMyClothesDto(ownerId);
			this.pool.put(ownerId, myClothesDto);
		}
		return myClothesDto;
	}
	
}
