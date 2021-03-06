package pt.ist.ave.jzx.instructions.ld;

import pt.ist.ave.jzx.instructions.Instruction;

public class LD_BA extends Instruction {

	public LD_BA(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.setM_b8(_cpu.getM_a8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
