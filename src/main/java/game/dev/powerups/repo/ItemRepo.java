package game.dev.powerups.repo;

import game.dev.powerups.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<Item, Long> {
}
