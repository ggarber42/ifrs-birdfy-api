package br.edu.ifrs.birdfly.birdfly.service;

import br.edu.ifrs.birdfly.birdfly.entity.Ave;
import br.edu.ifrs.birdfly.birdfly.repository.AveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AveService {

    @Autowired
    private AveRepository aveRepo;

    public List<Ave> getAllAves(){
        return aveRepo.findAll();
    }

    public Ave getAveByID(Long id){
        try{
            return aveRepo.getById(id);
        } catch (Exception e){
            throw e;
        }
    }

    @Transactional
    public String createAve(Ave ave){
        try {
            aveRepo.save(ave);
            return "Student record created successfully.";
        }catch (Exception e){
            throw e;
        }
    }

    @Transactional
    public String deleteAve(Long id){
        try {
            aveRepo.deleteById(id);
            return "Student record deleted successfully.";
        }catch (Exception e){
            throw e;
        }
    }
}
