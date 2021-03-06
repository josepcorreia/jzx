package pt.ist.ave.jzx.operations;

import pt.ist.ave.jzx.Z80;

public class INC8 extends Operation {
	
	private int _work8;

	{
		_updatedFlags = new int[] {
				Z80.FLAG_ADD_SUBTRACT,
				Z80.FLAG_PARITY_OVERFLOW,
				Z80.FLAG_HALF_CARRY,
				Z80.FLAG_ZERO,
				Z80.FLAG_SIGN,
				Z80.FLAG_5,
				Z80.FLAG_3
		};
	}
	
	public int inc8(int reg8) {
		_work8 = (reg8 + 1) & 0xff;
//		_cpu.setM_signF(getM_signF());
//		_cpu.setM_zeroF(getM_zeroF());
//		_cpu.setM_halfcarryF(getM_halfcarryF());
//		_cpu.setM_parityoverflowF(getM_parityoverflowF());
//		_cpu.setM_addsubtractF(getM_addsubtractF());
//		_cpu.setM_3F(getM_3F());
//		_cpu.setM_5F(getM_5F());
		
		updateFlags();
		
		return _work8;
	}

	@Override
	public boolean getM_signF() {
		return ((_work8 & 0x80) != 0);
	}

	@Override
	public boolean getM_zeroF() {
		return (_work8 == 0);
	}
	
	@Override
	public boolean getM_halfcarryF() {
		return ((_work8 & 0x0f) == 0);
	}
	
	@Override
	public boolean getM_parityoverflowF() {
		return (_work8 == 0x80);
	}

	@Override
	public boolean getM_addsubtractF() {
		return false;
	}
	
	@Override
	public boolean getM_5F() {
		return ((_work8 & Z80.FIVE_MASK) != 0);
	}

	@Override
	public boolean getM_3F() {
		return ((_work8 & Z80.THREE_MASK) != 0);
	}
	
	@Override
	public boolean getM_carryF() {
		notImplementedError("getM_carryF");
		return false;
	}











}
