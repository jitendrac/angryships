package com.gemserk.games.angryships.components;

import com.artemis.Entity;

public class GameComponents {

	public static final Class<ControllerComponent> controllerComponentClass = ControllerComponent.class;
	public static final Class<PixmapCollidableComponent> pixmapCollidableComponentClass = PixmapCollidableComponent.class;

	public static ControllerComponent getControllerComponent(Entity e) {
		return e.getComponent(controllerComponentClass);
	}
	
	public static PixmapCollidableComponent getPixmapCollidableComponent(Entity e) {
		return e.getComponent(pixmapCollidableComponentClass);
	}

	
}
