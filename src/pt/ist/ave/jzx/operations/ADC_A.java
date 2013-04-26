package pt.ist.ave.jzx.operations;

import pt.ist.ave.jzx.Z80;

public class ADC_A extends Operation {

	private int _my_m_a8;
	private int _work16;

	public void adc_a(int val8) {
		_work16 = _cpu.getM_a8() + val8 + (_cpu.getM_carryF() ? 1 : 0);
		_idx = ((_cpu.getM_a8() & 0x88) >> 1) | ((val8 & 0x88) >> 2)
				| ((_work16 & 0x88) >> 3);
		
		_my_m_a8 = _work16 & 0xff;
		_cpu.setM_a8(_my_m_a8);
		
		_cpu.setM_signF(getM_signF());
		_cpu.setM_zeroF(getM_zeroF());
		_cpu.setM_halfcarryF(getM_halfcarryF());
		_cpu.setM_parityoverflowF(getM_parityoverflowF());
		_cpu.setM_addsubtractF(getM_addsubtractF());
		_cpu.setM_carryF(getM_carryF());
		_cpu.setM_3F(getM_3F());
		_cpu.setM_5F(getM_5F());
	}

	@Override
	public boolean getM_carryF() {
		return (_work16 & 0x100) != 0;
	}

	@Override
	public boolean getM_addsubtractF() {
		return false;
	}

	@Override
	public boolean getM_parityoverflowF() {
		return Z80.m_overflowTable[_idx >> 4];
	}

	@Override
	public boolean getM_halfcarryF() {
		return Z80.m_halfcarryTable[_idx & 0x7];
	}

	@Override
	public boolean getM_zeroF() {
		return _my_m_a8 == 0;
	}

	@Override
	public boolean getM_signF() {
		return (_my_m_a8 & 0x80) != 0;
	}

	@Override
	public boolean getM_5F() {
		return (_my_m_a8 & Z80.FIVE_MASK) != 0;
	}

	@Override
	public boolean getM_3F() {
		return (_my_m_a8 & Z80.THREE_MASK) != 0;
	}

}
