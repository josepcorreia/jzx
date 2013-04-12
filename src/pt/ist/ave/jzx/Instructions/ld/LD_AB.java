package pt.ist.ave.jzx.Instructions.ld;

import pt.ist.ave.jzx.Instructions.Instruction;

public class LD_AB extends Instruction {

	public LD_AB(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
//		Z80.m_a8 = Z80.m_b8;
		_cpu.setM_a8(_cpu.getM_b8());
	}

	@Override
	public int incTstates() {
		return 4;
	}

}
