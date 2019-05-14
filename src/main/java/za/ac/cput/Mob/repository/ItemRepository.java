package za.ac.cput.Mob.repository;
import za.ac.cput.Mob.domain.Item;
import java.util.Set;
public interface ItemRepository extends IRepository<Item,String> {

    Set<Item> getAll();
}
