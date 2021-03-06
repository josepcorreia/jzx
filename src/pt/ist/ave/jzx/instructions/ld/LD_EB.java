package pt.ist.ave.jzx.instructions.ld;

import pt.ist.ave.jzx.instructions.Instruction;

public class LD_EB extends Instruction {

	public LD_EB(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.setM_e8(_cpu.getM_b8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
