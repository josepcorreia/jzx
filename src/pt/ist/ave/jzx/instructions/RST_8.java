package pt.ist.ave.jzx.instructions;


public class RST_8 extends Instruction {

	public RST_8(short opCode) {
		super(opCode);
	}

	@Override
	public void execute() {
		_cpu.push(_cpu.getM_pc16());
		_cpu.setM_pc16(0x08);
	}

	@Override
	public int incTstates() {
		return 11;
	}

}
