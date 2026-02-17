package com.professional.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.professional.models.Entity;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    private BusinessLogic businessLogic;

    @BeforeEach
    void setUp() {
        businessLogic = new BusinessLogic();
    }

    @Test
    void testCreateEntity() {
        Entity entity = new Entity(1, "Test Entity", "This is a test entity.");
        assertTrue(businessLogic.createEntity(entity));
    }

    @Test
    void testReadEntity() {
        Entity entity = new Entity(1, "Test Entity", "This is a test entity.");
        businessLogic.createEntity(entity);
        Entity retrievedEntity = businessLogic.readEntity(1);
        assertEquals(entity.getName(), retrievedEntity.getName());
    }

    @Test
    void testUpdateEntity() {
        Entity entity = new Entity(1, "Test Entity", "This is a test entity.");
        businessLogic.createEntity(entity);
        entity.setName("Updated Entity");
        assertTrue(businessLogic.updateEntity(entity.getId(),entity));
        Entity updatedEntity = businessLogic.readEntity(1);
        assertEquals("Updated Entity", updatedEntity.getName());
    }

    @Test
    void testDeleteEntity() {
        Entity entity = new Entity(1, "Test Entity", "This is a test entity.");
        businessLogic.createEntity(entity);
        assertTrue(businessLogic.deleteEntity(1));
        assertNull(businessLogic.readEntity(1));
    }
}