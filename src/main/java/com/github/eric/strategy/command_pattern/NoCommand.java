package com.github.eric.strategy.command_pattern;

//实现一个不执行任何命令的命令对象，execute方法内什么都不做
public class NoCommand implements Command {

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
