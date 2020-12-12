package game.dev.powerups.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

}

