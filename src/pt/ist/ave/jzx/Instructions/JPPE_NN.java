package pt.ist.ave.jzx.Instructions;

public class JPPE_NN extends Instruction {

	public JPPE_NN(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.setM_pc16(_cpu.hl16());
		if (_cpu.getM_parityoverflowF()) {
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
