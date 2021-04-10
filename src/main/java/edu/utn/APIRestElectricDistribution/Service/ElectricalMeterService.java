package edu.utn.APIRestElectricDistribution.Service;

import edu.utn.APIRestElectricDistribution.Domain.ElectricalMeter;
import edu.utn.APIRestElectricDistribution.Repository.ElectricalMeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElectricalMeterService {

    private final ElectricalMeterRepository electricalMeterRepository;

    @Autowired
    public ElectricalMeterService(ElectricalMeterRepository electricalMeterRepository) {
        this.electricalMeterRepository = electricalMeterRepository;
    }

    //region GET
    public List<ElectricalMeter> GetAll() {
        return electricalMeterRepository.findAll();
    }

    /*public List<Measurer> GetByModel(String model) {
        return this.measurerRepository.findByModel(model);
    }*/

    public ElectricalMeter GetById(Integer serial) throws Throwable {
        return this.electricalMeterRepository.findById(serial).orElseThrow(Throwable::new);
    }

}