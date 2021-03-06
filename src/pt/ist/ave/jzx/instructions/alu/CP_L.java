package pt.ist.ave.jzx.instructions.alu;

import pt.ist.ave.jzx.instructions.Instruction;

public class CP_L extends Instruction {

	public CP_L(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.cmp_a(_cpu.getM_l8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
