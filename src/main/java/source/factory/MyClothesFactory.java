package source.factory;

import java.util.HashMap;

import source.entity.MyClothesEntity;
import source.factory.bsFactory.Factory;

/**
 * MyClothesDto製造クラス.
 * @author Noriyuki-Shimizu
 *
 */
public class MyClothesFactory extends Factory<Long, MyClothesEntity>{

	public MyClothesFactory() {
		this.pool = new HashMap<Long, MyClothesEntity>();
	}
	
	protected MyClothesEntity createObj(Long ownerId) {
		MyClothesEntity myClothesDto = this.pool.get(ownerId);
		if(myClothesDto == null) {
			myClothesDto = new MyClothesEntity(ownerId);
			this.pool.put(ownerId, myClothesDto);
		}
		return myClothesDto;
	}
	
}
