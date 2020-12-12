package game.dev.powerups.repo;

import game.dev.powerups.entity.PowerUp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerUpRepo extends CrudRepository<PowerUp, Long> {

}
