package pt.ist.ave.jzx.instructions.ld;

import pt.ist.ave.jzx.instructions.Instruction;

public class LD_CB extends Instruction {

	public LD_CB(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.setM_c8(_cpu.getM_b8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
