package za.ac.cput.Mob.repository.Impl;

import za.ac.cput.Mob.domain.CContactDetails;
import za.ac.cput.Mob.repository.ContactDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class ContactDetailsRepositoryImp
        implements ContactDetailsRepository {
    private static ContactDetailsRepositoryImp repository = null;
    private Set<CContactDetails> contactDetails;
    private ContactDetailsRepositoryImp() {
        this.contactDetails = new HashSet<>();
        }
    public static ContactDetailsRepositoryImp getRepository(){
        if(repository == null) repository =
                new ContactDetailsRepositoryImp();
        return repository;}
    public CContactDetails create(CContactDetails contactDetails){
        this.contactDetails.add(contactDetails);
        return contactDetails;}

    public CContactDetails read(String contactDetails){
        //find the student in the set and return it if it exist
        return null;}

    public CContactDetails update(CContactDetails contactDetails) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String contactDetailsId) {
        //find the student and delete it if it exists
    }
    public Set<CContactDetails> getAll(){
        return this.contactDetails;
    }

}
