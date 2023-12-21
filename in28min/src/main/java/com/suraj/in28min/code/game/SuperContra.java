package com.suraj.in28min.code.game;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.suraj.in28min.code.interfaceLoosecoupling.GameConsole;

@Component
@Lazy // this is used to not initalize this Bean/component at Startup , whenever
		// Someone actually calls this then only it will invoke
public class SuperContra implements GameConsole {
	public void up() {
		System.out.println("Up -contra");
	}

	public void down() {
		System.out.println("Sit down -contra");
	}

	public void left() {
		System.out.println("Go back -contra");
	}

	public void right() {
		System.out.println("shoot -contra");
	}
}
