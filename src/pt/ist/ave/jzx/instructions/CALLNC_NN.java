package pt.ist.ave.jzx.instructions;

public class CALLNC_NN extends Instruction {

	private int _tstates;
	
	public CALLNC_NN(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		if (!_cpu.getM_carryF()) {
//			_tstates += 17;
			_tstates = 17;
			_cpu.push(_cpu.incinc16(_cpu.getM_pc16()));
			_cpu.setM_pc16(_cpu.getM_memory().read16(_cpu.getM_pc16()));
		} else {
//			_tstates += 10;
			_tstates = 10;
			_cpu.setM_pc16(_cpu.incinc16(_cpu.getM_pc16()));
		}
	}

	@Override
	public int incTstates() {
		return _tstates;
	}

}
