package game.dev.powerups.controller;

import game.dev.powerups.entity.Item;
import game.dev.powerups.entity.PowerUp;
import game.dev.powerups.repo.ItemRepo;
import game.dev.powerups.repo.PowerUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/powerUp")
public class PowerUpController {

    @Autowired
    PowerUpRepo powerUpRepo;
    @Autowired
    ItemRepo itemRepo;

    @GetMapping("getById")
    public PowerUp findById(Long powerUpId){
        return powerUpRepo.findById(powerUpId).get();
    }

    @GetMapping("getAll")
    public List<PowerUp> findAll()
    {
        return (List<PowerUp>) powerUpRepo.findAll();
    }
    @PostMapping("/add")
    public void addPowerUp(PowerUp powerUp)
    {
        powerUpRepo.save(powerUp);
    }
    @PostMapping("/update/{id}")
    public void updatePowerUp(PowerUp powerUp)
    {
        powerUpRepo.save(powerUp);
    }

    //***********item  controller
    @GetMapping("/item/getAll")
    public List<Item> getAllItems()
    {
        return (List<Item>) itemRepo.findAll();
    }
    @PostMapping("/item/add")
    public void addItem(Item item)
    {
        itemRepo.save(item);
    }
    @GetMapping("/findById")
    public Item getById(Long itemId)
    {
        return itemRepo.findById(itemId).get();
    }
}
