package br.edu.ifrs.birdfy.service;

import br.edu.ifrs.birdfy.model.Ave;
import br.edu.ifrs.birdfy.repository.AveRepository;

import br.edu.ifrs.birdfy.utils.EntityNotFoundException;
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

    public Ave getAveByID(int aveId){
        Ave ave = aveRepo.findById(aveId).orElseThrow(
                () -> new EntityNotFoundException("Ave not found" + aveId));
        return ave;
    }

    @Transactional
    public Ave createAve(Ave ave){ return aveRepo.save(ave);}

    @Transactional
    public Ave updateAve(int aveId, Ave ave){

        Ave aveUpdated = aveRepo.findById(aveId).orElseThrow( () -> new EntityNotFoundException("Ave not found" + aveId));
        aveUpdated.setNome(ave.getNome());
        aveRepo.save(aveUpdated);
        return aveUpdated;


    }

    @Transactional
    public void deleteAve(int aveId){
        Ave aveUpdated = aveRepo.findById(aveId)
                .orElseThrow(() -> new EntityNotFoundException("Ave not found for this id :: " + aveId));
        aveRepo.deleteById(aveId);
    }
}
