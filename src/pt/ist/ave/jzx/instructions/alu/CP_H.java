package pt.ist.ave.jzx.instructions.alu;

import pt.ist.ave.jzx.instructions.Instruction;

public class CP_H extends Instruction {

	public CP_H(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.cmp_a(_cpu.getM_h8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
