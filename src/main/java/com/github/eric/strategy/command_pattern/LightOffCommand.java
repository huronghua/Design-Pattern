package com.github.eric.strategy.command_pattern;

public class LightOffCommand implements Command {
	//持有一个接受者对象，用于执行相关的命令操作
	Light light;

	//构造函数注入一个Light变量，用于完成关灯的动作
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		//具体的关灯逻辑这里是写在Light类里面，也可以直接写在这里
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
