package com.professional.business;

import com.professional.models.Entity;
import java.util.ArrayList;
import java.util.List;

public class BusinessLogic {
    private List<Entity> entities;

    public BusinessLogic() {
        this.entities = new ArrayList<>();
    }

    public void createEntity(Entity entity) {
        entities.add(entity);
    }

    public Entity readEntity(int id) {
        return entities.stream()
                .filter(entity -> entity.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateEntity(int id, Entity updatedEntity) {
        for (int i = 0; i < entities.size(); i++) {
            if (entities.get(i).getId() == id) {
                entities.set(i, updatedEntity);
                return;
            }
        }
    }

    public void deleteEntity(int id) {
        entities.removeIf(entity -> entity.getId() == id);
    }
}