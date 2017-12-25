package com.github.eric.strategy.command_pattern;

//命令对象接口，每一个方法都必须被子类所实现
public interface Command {

	public void execute();


	//实现一个撤销操作
	public void undo();
}
