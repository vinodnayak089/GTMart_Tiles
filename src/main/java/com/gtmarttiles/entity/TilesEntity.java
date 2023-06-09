package com.gtmarttiles.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tiles")
public class TilesEntity {
	
	@Id
	@Column(name = "DESIGN_NO")
	private String designNo;
	
	@Column(name = "BOX_SIZE")
	private String boxSize;
	
	@Column(name = "L")
	private int l;
	
	@Column(name = "HL")
	private int hl;
	
	@Column(name = "D")
	private int d;
	
	@Column(name = "F")
	private int f;
	
	@Column(name = "PRIZE")
	private int prize;
	
	
	public String getDesignNo() {
		return designNo;
	}
	public void setDesignNo(String designNo) {
		this.designNo = designNo;
	}
	public String getBoxSize() {
		return boxSize;
	}
	public void setBoxSize(String boxSize) {
		this.boxSize = boxSize;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getHl() {
		return hl;
	}
	public void setHl(int hl) {
		this.hl = hl;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	@Override
	public String toString() {
		return "Tiles [designNo=" + designNo + ", boxSize=" + boxSize + ", l=" + l + ", hl=" + hl + ", d=" + d + ", f="
				+ f + ", prize=" + prize + "]";
	}

}
