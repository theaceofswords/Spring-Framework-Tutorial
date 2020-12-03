package com.springexample.petclinic.services.map;

import com.springexample.petclinic.model.VisitDetails;
import com.springexample.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VisitMapService extends AbstractMapService<VisitDetails, Long> implements VisitService {
    @Override
    public Set<VisitDetails> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(VisitDetails object) {
        super.delete(object);
    }

    @Override
    public VisitDetails save(VisitDetails object) {
        return super.save(object);
    }

    @Override
    public VisitDetails findById(Long id) {
        return super.findById(id);
    }
}
