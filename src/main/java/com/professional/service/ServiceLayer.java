package com.professional.service;

import com.professional.business.BusinessLogic;
import com.professional.models.Entity;

public class ServiceLayer {
    private BusinessLogic businessLogic;

    public ServiceLayer() {
        this.businessLogic = new BusinessLogic();
    }

    public void addEntity(Entity entity) {
        businessLogic.createEntity(entity);
    }

    public Entity getEntity(int id) {
        return businessLogic.readEntity(id);
    }

    public void modifyEntity(Entity entity) {
        businessLogic.updateEntity(entity.getId(),entity);
    }

    public void removeEntity(int id) {
        businessLogic.deleteEntity(id);
    }
}