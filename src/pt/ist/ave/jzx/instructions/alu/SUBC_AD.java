package pt.ist.ave.jzx.instructions.alu;

import pt.ist.ave.jzx.instructions.Instruction;

public class SUBC_AD extends Instruction {

	public SUBC_AD(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.sbc_a(_cpu.getM_d8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
