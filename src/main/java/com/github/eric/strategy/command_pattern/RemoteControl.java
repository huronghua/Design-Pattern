package com.github.eric.strategy.command_pattern;

import java.util.List;

public class RemoteControl {
	//持有一个命令接口的实例
	Command command;

	/**
	 * 这里还可以设置一个用于存储执行过的命令的栈，用于记录和撤销功能
	 */
	List<Command> commandsStack;

	//构造方法接受一个command参数用于设置命令，面向超类编程
	public void setCommand(Command command) {
		this.command = command;
	}

	//调用此方法则执行命令而不用管执行了什么命令和怎么执行
	public void buttonWasPressed(){
		command.execute();
	}

	public void withDraw(){
		command.undo();
	}
}
