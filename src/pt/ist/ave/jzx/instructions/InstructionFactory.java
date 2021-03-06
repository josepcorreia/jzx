package pt.ist.ave.jzx.instructions;

import pt.ist.ave.jzx.instructions.alu.*;
import pt.ist.ave.jzx.instructions.ld.*;

public class InstructionFactory {

	public static Instruction getInstruction(short opCode) {
		switch(opCode) {
		case 0x00:
			return new NOP(opCode);
		case 0x01:
			return new LD_BCNN(opCode);
		case 0x02:
			return new LD_MBCA(opCode);
		case 0x03:
			return new INC_BC(opCode);
		case 0x04:
			return new INC_B(opCode);
		case 0x05:
			return new DEC_B(opCode);
		case 0x06:
			return new LD_BN(opCode);
		case 0x07:
			return new RLCA(opCode);
		case 0x08:
			return new EX_AFAF(opCode);
		case 0x09:
			return new ADD_HLBC(opCode);
		case 0x0a:
			return new LD_AMBC(opCode);
		case 0x0b:
			return new DEC_BC(opCode);
		case 0x0c:
			return new INC_C(opCode);
		case 0x0d:
			return new DEC_C(opCode);
		case 0x0e:
			return new LD_CN(opCode);
		case 0x0f:
			return new RRCA(opCode);
		case 0x10:
			return new DJNZ_D(opCode);
		case 0x11:
			return new LD_DENN(opCode);
		case 0x12:
			return new LD_MDEA(opCode);
		case 0x13:
			return new INC_DE(opCode);
		case 0x14:
			return new INC_D(opCode);
		case 0x15:
			return new DEC_D(opCode);
		case 0x16:
			return new LD_DN(opCode);
		case 0x17:
			return new RLA(opCode);
		case 0x18:
			return new JR_D(opCode);
		case 0x19:
			return new ADD_HLDE(opCode);
		case 0x1a:
			return new LD_AMDE(opCode);
		case 0x1b:
			return new DEC_DE(opCode);
		case 0x1c:
			return new INC_E(opCode);
		case 0x1d:
			return new DEC_E(opCode);
		case 0x1e:
			return new LD_EN(opCode);
		case 0x1f:
			return new RRA(opCode);
		case 0x20:
			return new JRNZ_D(opCode);
		case 0x21:
			return new LD_HLNN(opCode);
		case 0x22:
			return new LD_MNNHL(opCode);
		case 0x23:
			return new INC_HL(opCode);
		case 0x24:
			return new INC_H(opCode);
		case 0x25:
			return new DEC_H(opCode);
		case 0x26:
			return new LD_HN(opCode);
		case 0x27:
			return new DAA(opCode);
		case 0x28:
			return new JRZ_D(opCode);
		case 0x29:
			return new ADD_HLHL(opCode);
		case 0x2a:
			return new LD_HLMNN(opCode);
		case 0x2b:
			return new DEC_HL(opCode);
		case 0x2c:
			return new INC_L(opCode);
		case 0x2d:
			return new DEC_L(opCode);
		case 0x2e:
			return new LD_LN(opCode);
		case 0x2f:
			return new CPL(opCode);
		case 0x30:
			return new JRNC_D(opCode);
		case 0x31:
			return new LD_SPNN(opCode);
		case 0x32:
			return new LD_MNNA(opCode);
		case 0x33:
			return new INC_SP(opCode);
		case 0x34:
			return new INC_MHL(opCode);
		case 0x35:
			return new DEC_MHL(opCode);
		case 0x36:
			return new LD_MHLN(opCode);
		case 0x37:
			return new SCF(opCode);
		case 0x38:
			return new JRC_D(opCode);
		case 0x39:
			return new ADD_HLSP(opCode);
		case 0x3a:
			return new LD_AMNN(opCode);
		case 0x3b:
			return new DEC_SP(opCode);
		case 0x3c:
			return new INC_A(opCode);
		case 0x3d:
			return new DEC_A(opCode);
		case 0x3e:
			return new LD_AN(opCode);
		case 0x3f:
			return new CCF(opCode);
		case 0x40:
			return new LD_BB(opCode);
		case 0x41:
			return new LD_BC(opCode);
		case 0x42:
			return new LD_BD(opCode);
		case 0x43:
			return new LD_BE(opCode);
		case 0x44:
			return new LD_BH(opCode);
		case 0x45:
			return new LD_BL(opCode);
		case 0x46:
			return new LD_BMHL(opCode);
		case 0x47:
			return new LD_BA(opCode);
		case 0x48:
			return new LD_CB(opCode);
		case 0x49:
			return new LD_CC(opCode);
		case 0x4a:
			return new LD_CD(opCode);
		case 0x4b:
			return new LD_CE(opCode);
		case 0x4c:
			return new LD_CH(opCode);
		case 0x4d:
			return new LD_CL(opCode);
		case 0x4e:
			return new LD_CMHL(opCode);
		case 0x4f:
			return new LD_CA(opCode);
		case 0x50:
			return new LD_DB(opCode);
		case 0x51:
			return new LD_DC(opCode);
		case 0x52:
			return new LD_DD(opCode);
		case 0x53:
			return new LD_DE(opCode);
		case 0x54:
			return new LD_DH(opCode);
		case 0x55:
			return new LD_DL(opCode);
		case 0x56:
			return new LD_DMHL(opCode);
		case 0x57:
			return new LD_DA(opCode);
		case 0x58:
			return new LD_EB(opCode);
		case 0x59:
			return new LD_EC(opCode);
		case 0x5a:
			return new LD_ED(opCode);
		case 0x5b:
			return new LD_EE(opCode);
		case 0x5c:
			return new LD_EH(opCode);
		case 0x5d:
			return new LD_EL(opCode);
		case 0x5e:
			return new LD_EMHL(opCode);
		case 0x5f:
			return new LD_EA(opCode);
		case 0x60:
			return new LD_HB(opCode);
		case 0x61:
			return new LD_HC(opCode);
		case 0x62:
			return new LD_HD(opCode);
		case 0x63:
			return new LD_HE(opCode);
		case 0x64:
			return new LD_HH(opCode);
		case 0x65:
			return new LD_HL(opCode);
		case 0x66:
			return new LD_HMHL(opCode);
		case 0x67:
			return new LD_HA(opCode);
		case 0x68:
			return new LD_LB(opCode);
		case 0x69:
			return new LD_LC(opCode);
		case 0x6a:
			return new LD_LD(opCode);
		case 0x6b:
			return new LD_LE(opCode);
		case 0x6c:
			return new LD_LH(opCode);
		case 0x6d:
			return new LD_LL(opCode);
		case 0x6e:
			return new LD_LMHL(opCode);
		case 0x6f:
			return new LD_LA(opCode);
		case 0x70:
			return new LD_MHLB(opCode);
		case 0x71:
			return new LD_MHLC(opCode);
		case 0x72:
			return new LD_MHLD(opCode);
		case 0x73:
			return new LD_MHLE(opCode);
		case 0x74:
			return new LD_MHLH(opCode);
		case 0x75:
			return new LD_MHLL(opCode);
		case 0x76:
			return new HALT(opCode);
		case 0x77:
			return new LD_MHLA(opCode);
		case 0x78:
			return new LD_AB(opCode);
		case 0x79:
			return new LD_AC(opCode);			
		case 0x7a:
			return new LD_AD(opCode);
		case 0x7b:
			return new LD_AE(opCode);
		case 0x7c:
			return new LD_AH(opCode);
		case 0x7d:
			return new LD_AL(opCode);
		case 0x7e:
			return new LD_AMHL(opCode);
		case 0x7f:
			return new LD_AA(opCode);
		case 0x80:
			return new ADD_AB(opCode);
		case 0x81:
			return new ADD_AC(opCode);
		case 0x82:
			return new ADD_AD(opCode);
		case 0x83:
			return new ADD_AE(opCode);
		case 0x84:
			return new ADD_AH(opCode);
		case 0x85:
			return new ADD_AL(opCode);
		case 0x86:
			return new ADD_AMHL(opCode);
		case 0x87:
			return new ADD_AA(opCode);
		case 0x88:
			return new ADDC_AB(opCode);
		case 0x89:
			return new ADDC_AC(opCode);
		case 0x8a:
			return new ADDC_AD(opCode);
		case 0x8b:
			return new ADDC_AE(opCode);
		case 0x8c:
			return new ADDC_AH(opCode);
		case 0x8d:
			return new ADDC_AL(opCode);
		case 0x8e:
			return new ADDC_AMHL(opCode);
		case 0x8f:
			return new ADDC_AA(opCode);
		case 0x90:
			return new SUB_AB(opCode);
		case 0x91:
			return new SUB_AC(opCode);
		case 0x92:
			return new SUB_AD(opCode);
		case 0x93:
			return new SUB_AE(opCode);
		case 0x94:
			return new SUB_AH(opCode);
		case 0x95:
			return new SUB_AL(opCode);
		case 0x96:
			return new SUB_AMHL(opCode);
		case 0x97:
			return new SUB_AA(opCode);
		case 0x98:
			return new SUBC_AB(opCode);
		case 0x99:
			return new SUBC_AC(opCode);
		case 0x9a:
			return new SUBC_AD(opCode);
		case 0x9b:
			return new SUBC_AE(opCode);
		case 0x9c:
			return new SUBC_AH(opCode);
		case 0x9d:
			return new SUBC_AL(opCode);
		case 0x9e:
			return new SUBC_AMHL(opCode);
		case 0x9f:
			return new SUBC_AA(opCode);
		case 0xa0:
			return new AND_B(opCode);
		case 0xa1:
			return new AND_C(opCode);
		case 0xa2:
			return new AND_D(opCode);
		case 0xa3:
			return new AND_E(opCode);
		case 0xa4:
			return new AND_H(opCode);
		case 0xa5:
			return new AND_L(opCode);
		case 0xa6:
			return new AND_MHL(opCode);
		case 0xa7:
			return new AND_A(opCode);
		case 0xa8:
			return new XOR_B(opCode);
		case 0xa9:
			return new XOR_C(opCode);
		case 0xaa:
			return new XOR_D(opCode);
		case 0xab:
			return new XOR_E(opCode);
		case 0xac:
			return new XOR_H(opCode);
		case 0xad:
			return new XOR_L(opCode);
		case 0xae:
			return new XOR_MHL(opCode);
		case 0xaf:
			return new XOR_A(opCode);
		case 0xb0:
			return new OR_B(opCode);
		case 0xb1:
			return new OR_C(opCode);
		case 0xb2:
			return new OR_D(opCode);
		case 0xb3:
			return new OR_E(opCode);
		case 0xb4:
			return new OR_H(opCode);
		case 0xb5:
			return new OR_L(opCode);
		case 0xb6:
			return new OR_MHL(opCode);
		case 0xb7:
			return new OR_A(opCode);
		case 0xb8:
			return new CP_B(opCode);
		case 0xb9:
			return new CP_C(opCode);
		case 0xba:
			return new CP_D(opCode);
		case 0xbb:
			return new CP_E(opCode);
		case 0xbc:
			return new CP_H(opCode);
		case 0xbd:
			return new CP_L(opCode);
		case 0xbe:
			return new CP_MHL(opCode);
		case 0xbf:
			return new CP_A(opCode);
		case 0xc0:
			return new RETNZ(opCode);
		case 0xc1:
			return new POP_BC(opCode);
		case 0xc2:
			return new JPNZ_NN(opCode);
		case 0xc3:
			return new JP_NN(opCode);
		case 0xc4:
			return new CALLNZ_NN(opCode);
		case 0xc5:
			return new PUSH_BC(opCode);
		case 0xc6:
			return new ADD_AN(opCode);
		case 0xc7:
			return new RST_0(opCode);
		case 0xc8:
			return new RETZ(opCode);
		case 0xc9:
			return new RET(opCode);
		case 0xca:
			return new JPZ_NN(opCode);
		case 0xcb:
			return new DECODECB(opCode);
		case 0xcc:
			return new CALLZ_NN(opCode);
		case 0xcd:
			return new CALL_NN(opCode);
		case 0xce:
			return new ADDC_AN(opCode);
		case 0xcf:
			return new RST_8(opCode);
		case 0xd0:
			return new RETNC(opCode);
		case 0xd1:
			return new POP_DE(opCode);
		case 0xd2:
			return new JPNC_NN(opCode);
		case 0xd3:
			return new OUT_MNA(opCode);
		case 0xd4:
			return new CALLNC_NN(opCode);
		case 0xd5:
			return new PUSH_DE(opCode);
		case 0xd6:
			return new SUB_AN(opCode);
		case 0xd7:
			return new RST_10(opCode);
		case 0xd8:
			return new RETC(opCode);
		case 0xd9:
			return new EXX(opCode);
		case 0xda:
			return new JPC_NN(opCode);
		case 0xdb:
			return new IN_AN(opCode);
		case 0xdc:
			return new CALLC_NN(opCode);
		case 0xdd:
			return new DECODEXX(opCode);
		case 0xde:
			return new SUBC_AN(opCode);
		case 0xdf:
			return new RST_18(opCode);
		case 0xe0:
			return new RETPO(opCode);
		case 0xe1:
			return new POP_HL(opCode);
		case 0xe2:
			return new JPPO_NN(opCode);
		case 0xe3:
			return new EX_MSPHL(opCode);
		case 0xe4:
			return new CALLPO_NN(opCode);
		case 0xe5:
			return new PUSH_HL(opCode);
		case 0xe6:
			return new AND_N(opCode);
		case 0xe7:
			return new RST_20(opCode);
		case 0xe8:
			return new RETPE(opCode);
		case 0xe9:
			return new JP_HL(opCode);
		case 0xea:
			return new JPPE_NN(opCode);
		case 0xeb:
			return new EX_DE_HLL(opCode);
		case 0xec:
			return new CALLPE_NN(opCode);
		case 0xed:
			return new DECODEED(opCode);
		case 0xee:
			return new XOR_N(opCode);
		case 0xef:
			return new RST_28(opCode);
		case 0xf0:
			return new RETP(opCode);
		case 0xf1:
			return new POP_AF(opCode);
		case 0xf2:
			return new JPP_NN(opCode);
		case 0xf3:
			return new DI(opCode);
		case 0xf4:
			return new CALLP_NN(opCode);
		case 0xf5:
			return new PUSH_AF(opCode);
		case 0xf6:
			return new OR_N(opCode);
		case 0xf7:
			return new RST_30(opCode);
		case 0xf8:
			return new RETM(opCode);
		case 0xf9:
			return new LD_SPHL(opCode);
		case 0xfa:
			return new JPM_NN(opCode);
		case 0xfb:
			return new EI(opCode);
		case 0xfc:
			return new CALL_MNN(opCode);
		case 0xfd:
			return new DECODEXX(opCode);
		case 0xfe:
			return new CP_N(opCode);
		case 0xff:
			return new RST_38(opCode);
		}
		return null;
	}
}
