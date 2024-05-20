package DAOImplement;
import java.util.List;
import model.*;

public interface dataZooImplement {
    public void insert(zoo z);
    public void update(zoo z);
    public void delete(int id);
    public List<zoo> getAll();
    public List<zoo> search(String cari);
}
