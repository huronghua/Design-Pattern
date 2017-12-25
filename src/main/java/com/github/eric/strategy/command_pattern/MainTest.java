package com.github.eric.strategy.command_pattern;

public class MainTest {

	/*命令模式的好处在于解耦了调用者和接收执行者，他们之间通过命令对象连接，
	调用者不用管需要执行哪些操作，只需要调用命令对象的执行方法，相应的接受者就会执行相关的操作。*/
	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light();

		LightOnCommand lightOnCommand = new LightOnCommand(light);

		LightOffCommand lightOffCommand = new LightOffCommand(light);

		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
		remoteControl.withDraw();


		remoteControl.setCommand(lightOffCommand);
		remoteControl.buttonWasPressed();
		remoteControl.withDraw();


	}
}
