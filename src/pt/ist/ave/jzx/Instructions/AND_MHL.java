package pt.ist.ave.jzx.Instructions;

public class AND_MHL extends Instruction {

	public AND_MHL(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		int work8 = _cpu.getM_memory().read8(_cpu.hl16());
		_cpu.and_a(work8);
	}

	@Override
	public int incTstates() {
		return 7;
	}

}