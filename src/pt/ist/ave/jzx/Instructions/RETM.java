package pt.ist.ave.jzx.Instructions;

public class RETM extends Instruction {

	private int _tstates;
	
	public RETM(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_tstates = 5;
		if (_cpu.getM_signF()) {
			_tstates += 6;
			_cpu.setM_pc16(_cpu.pop16());
		}
	}

	@Override
	public int incTstates() {
		return _tstates;
	}

}
