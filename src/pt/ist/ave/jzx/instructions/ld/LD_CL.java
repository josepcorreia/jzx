package pt.ist.ave.jzx.instructions.ld;

import pt.ist.ave.jzx.instructions.Instruction;

public class LD_CL extends Instruction {

	public LD_CL(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.setM_c8(_cpu.getM_l8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
