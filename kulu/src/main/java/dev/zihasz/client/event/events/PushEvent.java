package dev.hydraontopp.client.event.events;


import dev.hydraontopp.client.event.Event;

public abstract class PushEvent extends Event {

	public PushEvent() {}

	public static class Entity extends PushEvent {
		public Entity() {}
	}
	public static class Liquid extends PushEvent {
		public Liquid() {}
	}
	public static class Block extends PushEvent {
		public Block() {}
	}

}
