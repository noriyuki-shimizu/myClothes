package source.factory;

import java.util.HashMap;

import source.dto.MyClothesDto;
import source.factory.bsFactory.Factory;

/**
 * MyClothesDto製造クラス.
 * @author Noriyuki-Shimizu
 *
 */
public class MyClothesFactory extends Factory<Long, MyClothesDto>{

	public MyClothesFactory() {
		this.pool = new HashMap<Long, MyClothesDto>();
	}
	
	protected MyClothesDto createObj(Long ownerId) {
		MyClothesDto myClothesDto = this.pool.get(ownerId);
		if(myClothesDto == null) {
			myClothesDto = new MyClothesDto(ownerId);
			this.pool.put(ownerId, myClothesDto);
		}
		return myClothesDto;
	}
	
}
