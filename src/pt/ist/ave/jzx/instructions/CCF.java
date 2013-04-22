package pt.ist.ave.jzx.instructions;

import pt.ist.ave.jzx.Z80;

public class CCF extends Instruction {

	public CCF(short opCode) {
		super(opCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		_cpu.setM_halfcarryF(_cpu.getM_carryF());
		_cpu.setM_addsubtractF(false);
		_cpu.setM_carryF(!_cpu.getM_carryF());
		_cpu.setM_3F((_cpu.getM_a8() & Z80.THREE_MASK) != 0);
		_cpu.setM_5F((_cpu.getM_a8() & Z80.FIVE_MASK) != 0);
	}

	@Override
	public int incTstates() {
		// TODO Auto-generated method stub
		return 4;
	}

}