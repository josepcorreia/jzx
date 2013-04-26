package pt.ist.ave.jzx.operations;

public class BIT_Operation extends Operation {

	private int _bit3;
	private int _reg8;
	private boolean _m_zeroF;

	public void bit(int bit3, int reg8) {
		_bit3 = bit3;
		_reg8 = reg8;
		_m_zeroF = _cpu.getM_zeroF();
		
		_cpu.setM_zeroF(getM_zeroF());
		_cpu.setM_halfcarryF(getM_halfcarryF());
		_cpu.setM_parityoverflowF(getM_parityoverflowF());
		_cpu.setM_addsubtractF(getM_addsubtractF());
		_cpu.setM_signF(getM_signF());
		_cpu.setM_3F(getM_3F());
		_cpu.setM_5F(getM_5F());
	}

	@Override
	public boolean getM_carryF() {
		notImplementedError("getM_carryF");
		return false;
	}

	@Override
	public boolean getM_addsubtractF() {
		return false;
	}

	@Override
	public boolean getM_parityoverflowF() {
		return _m_zeroF;
	}

	@Override
	public boolean getM_halfcarryF() {
		return true;
	}

	@Override
	public boolean getM_zeroF() {
		return (_reg8 & (0x01 << _bit3)) == 0;
	}

	@Override
	public boolean getM_signF() {
		return (_reg8 & (0x01 << _bit3)) == 0x80;
	}

	@Override
	public boolean getM_5F() {
		return _bit3 == 5 && !_m_zeroF;
	}

	@Override
	public boolean getM_3F() {
		return _bit3 == 3 && !_m_zeroF;
	}

}