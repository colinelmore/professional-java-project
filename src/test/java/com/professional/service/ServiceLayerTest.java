package com.professional.service;

import com.professional.business.BusinessLogic;
import com.professional.models.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLayerTest {
    private ServiceLayer serviceLayer;
    private BusinessLogic businessLogic;

    @BeforeEach
    void setUp() {
        businessLogic = new BusinessLogic();
        serviceLayer = new ServiceLayer(businessLogic);
    }

    @Test
    void testAddEntity() {
        Entity entity = new Entity(1, "Test Entity", "This is a test entity.");
        serviceLayer.addEntity(entity);
        assertEquals(entity, businessLogic.readEntity(1));
    }

    @Test
    void testGetEntity() {
        Entity entity = new Entity(2, "Another Entity", "This is another test entity.");
        businessLogic.createEntity(entity);
        Entity retrievedEntity = serviceLayer.getEntity(2);
        assertEquals(entity, retrievedEntity);
    }

    @Test
    void testModifyEntity() {
        Entity entity = new Entity(3, "Entity to Modify", "This entity will be modified.");
        businessLogic.createEntity(entity);
        entity.setDescription("Modified description.");
        serviceLayer.modifyEntity(entity);
        assertEquals("Modified description.", businessLogic.readEntity(3).getDescription());
    }

    @Test
    void testRemoveEntity() {
        Entity entity = new Entity(4, "Entity to Remove", "This entity will be removed.");
        businessLogic.createEntity(entity);
        serviceLayer.removeEntity(4);
        assertNull(businessLogic.readEntity(4));
    }
}