package pt.ist.ave.jzx.Instructions.ld;

import pt.ist.ave.jzx.Instructions.Instruction;

public class LD_SPNN extends Instruction {

	public LD_SPNN(short opCode) {
		super(opCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		_cpu.setM_sp16(_cpu.getM_memory().read16(_cpu.getM_pc16()));
		_cpu.setM_pc16(_cpu.incinc16(_cpu.getM_pc16()));

	}

	@Override
	public int incTstates() {
		// TODO Auto-generated method stub
		return 10;
	}

}
