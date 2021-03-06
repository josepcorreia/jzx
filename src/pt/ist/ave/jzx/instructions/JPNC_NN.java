package pt.ist.ave.jzx.instructions;

public class JPNC_NN extends Instruction {

	public JPNC_NN(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		if (!_cpu.getM_carryF()) {
			_cpu.setM_pc16(_cpu.getM_memory().read16(_cpu.getM_pc16()));
		} else {
			_cpu.setM_pc16(_cpu.incinc16(_cpu.getM_pc16()));
		}
	}

	@Override
	public int incTstates() {
		return 10;
	}

}
