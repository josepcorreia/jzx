package pt.ist.ave.jzx.instructions.alu;

import pt.ist.ave.jzx.instructions.Instruction;

public class OR_D extends Instruction {

	public OR_D(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.or_a(_cpu.getM_d8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
