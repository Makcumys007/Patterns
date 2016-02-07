package ru.devcribs.patterns.Command.undo;



public interface Command {
	public void execute();
	public void undo();
}
