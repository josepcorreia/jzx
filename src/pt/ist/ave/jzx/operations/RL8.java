package pt.ist.ave.jzx.operations;

public class RL8 extends ShiftTest {
	
	boolean _carry;
	
	public int rl8(int reg8) {
		_carry = ((reg8 & 0x80) != 0);
		int work8 = ((reg8 << 1) | (_carry ? 1 : 0)) & 0xff;
		_cpu.setM_carryF(_carry);
		shiftTest(work8);
		return work8;
	}

	@Override
	public boolean getM_carryF() {
		return _carry;
	}

}
