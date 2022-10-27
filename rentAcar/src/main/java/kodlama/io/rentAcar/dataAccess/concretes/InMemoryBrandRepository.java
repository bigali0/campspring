package kodlama.io.rentAcar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands =new ArrayList<Brand>(); // bununla elimizde bos bir array var 
		//gibi olur marka listesi
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
		
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
