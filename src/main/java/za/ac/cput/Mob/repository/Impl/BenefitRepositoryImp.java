package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.Benefits;
import za.ac.cput.Mob.repository.BenefitRepository;
import java.util.Set;
public class BenefitRepositoryImp implements BenefitRepository {
    private static BenefitRepositoryImp repository = null;
    private Set<Benefits> benefits;


    public static BenefitRepositoryImp getRepository(){
        if(repository == null) repository = new BenefitRepositoryImp();
        return repository;}
    public Benefits create(Benefits benefits){
        this.benefits.add(benefits);
        return benefits;}
    public Benefits read(String benefitsId){
        //find the student in the set and return it if it exist
        return null;}
    public Benefits update(Benefits benefits) {
        // find the student, update it and return the updated student
        return null;
    }
    public void delete(String benefitsId) {
        //find the student and delete it if it exists
    }
    public Set<Benefits> getAll(){
        return this.benefits;
    }



}
