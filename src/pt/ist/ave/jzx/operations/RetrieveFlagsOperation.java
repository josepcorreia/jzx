package pt.ist.ave.jzx.operations;

import pt.ist.ave.jzx.Z80;

public class RetrieveFlagsOperation extends Operation {

	private int _m_f8;
	{	
		_updatedFlags = new int[]{
				Z80.FLAG_ZERO,
				Z80.FLAG_SIGN,
				Z80.FLAG_HALF_CARRY,
				Z80.FLAG_PARITY_OVERFLOW,
				Z80.FLAG_ADD_SUBTRACT,
				Z80.FLAG_CARRY,
				Z80.FLAG_3,
				Z80.FLAG_5
		};
	}
	
	public void retrieveFlags() {
		_m_f8 = _cpu.getM_f8();

//		_cpu.setM_signF(getM_signF());
//		_cpu.setM_zeroF(getM_zeroF());
//		_cpu.setM_halfcarryF(getM_halfcarryF());
//		_cpu.setM_parityoverflowF(getM_parityoverflowF());
//		_cpu.setM_addsubtractF(getM_addsubtractF());
//		_cpu.setM_carryF(getM_carryF());
//		_cpu.setM_3F(getM_3F());
//		_cpu.setM_5F(getM_5F());
		updateFlags();
	}

	@Override
	public boolean getM_carryF() {
		return (_m_f8 & Z80.CARRY_MASK) != 0;
	}

	@Override
	public boolean getM_addsubtractF() {
		return (_m_f8 & Z80.ADDSUBTRACT_MASK) != 0;
	}

	@Override
	public boolean getM_parityoverflowF() {
		return (_m_f8 & Z80.OVERFLOW_MASK) != 0;
	}

	@Override
	public boolean getM_halfcarryF() {
		return (_m_f8 & Z80.HALFCARRY_MASK) != 0;
	}

	@Override
	public boolean getM_zeroF() {
		return (_m_f8 & Z80.ZERO_MASK) != 0;
	}

	@Override
	public boolean getM_signF() {
		return (_m_f8 & Z80.SIGN_MASK) != 0;
	}

	@Override
	public boolean getM_5F() {
		return (_m_f8 & Z80.FIVE_MASK) != 0;
	}

	@Override
	public boolean getM_3F() {
		return (_m_f8 & Z80.THREE_MASK) != 0;
	}

}
