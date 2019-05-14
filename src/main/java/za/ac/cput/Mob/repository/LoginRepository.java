package za.ac.cput.Mob.repository;
import za.ac.cput.Mob.domain.Login;
import java.util.Set;

public interface LoginRepository extends IRepository<Login, String> {
    Set<Login> getAll();
}
