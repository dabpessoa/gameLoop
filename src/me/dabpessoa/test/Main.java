package me.dabpessoa.test;

import me.dabpessoa.core.GameLoop;
import me.dabpessoa.listeners.FrameCounterListener;
import me.dabpessoa.listeners.GameLoopCounterListener;

public class Main implements FrameCounterListener, GameLoopCounterListener {

	public static void main(String[] args) {
			
		Main main = new Main();
		
		GameLoop loop = new GameLoop(new GameLogics(), 60);
		loop.addFrameCounterListener(main);
		loop.addGameLoopCounterListener(main);
		
		Thread thread = new Thread(loop);
		thread.start();
		
	}

	@Override
	public void frameCountInfo(int count) {
		System.out.println("FPS: "+count);
	}

	@Override
	public void gameLoopCounterInfo(int count) {
		System.out.println("Loop: "+count);
	}	
	
}