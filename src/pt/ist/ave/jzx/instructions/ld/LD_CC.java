package pt.ist.ave.jzx.instructions.ld;

import pt.ist.ave.jzx.instructions.Instruction;

public class LD_CC extends Instruction {

	public LD_CC(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
