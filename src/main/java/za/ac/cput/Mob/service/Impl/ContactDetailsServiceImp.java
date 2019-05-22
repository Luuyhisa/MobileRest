package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.CContactDetails;
import za.ac.cput.Mob.repository.ContactDetailsRepository;
import za.ac.cput.Mob.repository.Impl.ContactDetailsRepositoryImp;
import za.ac.cput.Mob.service.ContactDetailsService;

import java.util.HashSet;
import java.util.Set;
@Service("ContactDetailsServiceImp")
public class ContactDetailsServiceImp
        implements ContactDetailsService {
    @Autowired
    @Qualifier("InMemory")
    private static ContactDetailsServiceImp service = null;

    private ContactDetailsRepository repository;

    private ContactDetailsServiceImp(){
        this.repository = ContactDetailsRepositoryImp.getRepository();

    }

    public static ContactDetailsServiceImp getService(){
        if (service==null) service = new ContactDetailsServiceImp();
        return service;
    }

    @Override
    public Set<CContactDetails> getAll() {
        return repository.getAll();
    }

    @Override
    public CContactDetails create(CContactDetails cContactDetails) {
        return repository.create(cContactDetails);
    }

    @Override
    public CContactDetails update(CContactDetails cContactDetails) {
        return repository.update(cContactDetails);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public CContactDetails read(String s) {
        return repository.read(s);
    }
}
