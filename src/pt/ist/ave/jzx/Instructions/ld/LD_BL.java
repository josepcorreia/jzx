package pt.ist.ave.jzx.Instructions.ld;

import pt.ist.ave.jzx.Instructions.Instruction;

public class LD_BL extends Instruction {

	public LD_BL(short opCode) {
		super(opCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		_cpu.setM_b8(_cpu.getM_l8());
	}

	@Override
	public int incTstates() {
		// TODO Auto-generated method stub
		return 4;
	}

}
