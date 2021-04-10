package edu.utn.APIRestElectricDistribution.Service;

import edu.utn.APIRestElectricDistribution.Domain.Address;
import edu.utn.APIRestElectricDistribution.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    //Region
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    //Get region
    public List<Address>GetAll(){return addressRepository.findAll();}

    public Address GetById(Integer id) throws Throwable{
        return this.addressRepository.findById(id).orElseThrow(Throwable::new);
    }

//    public Address GetByZipCode(String zipCode){
//        return this.addressRepository.findByZipCode(zipCode);
//    }

    //Update region
    public void Update(Address address){
        this.addressRepository.save(address);
    }

    public void PostAddress(Address address){this.addressRepository.save(address);}

    public void Delete(Address address){this.addressRepository.delete(address);}

}
