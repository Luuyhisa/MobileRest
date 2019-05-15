package za.ac.cput.Mob.repository.Impl;
import za.ac.cput.Mob.domain.EmpPosition;
import za.ac.cput.Mob.repository.EmpPositionRepository;
import java.util.HashSet;
import java.util.Set;
public class EmpPositionRepositoryImp
implements EmpPositionRepository {
    private static EmpPositionRepositoryImp repository = null;
    private Set<EmpPosition> empPosition;
    private EmpPositionRepositoryImp() {
        this.empPosition = new HashSet<>();
    }
    public static EmpPositionRepositoryImp getRepository(){
        if(repository == null) repository =
                new EmpPositionRepositoryImp();
        return repository;}
     ///
    public Set<EmpPosition> getAll() {
        return null;
    }
     public EmpPosition create(EmpPosition empPosition) {
        this.empPosition.add(empPosition);
        return empPosition;
    }
    public EmpPosition update(EmpPosition empPosition) {
        return null;
    }
    public void delete(String s) {
    }
   public EmpPosition read(String s) {
        return null;
    }
}
