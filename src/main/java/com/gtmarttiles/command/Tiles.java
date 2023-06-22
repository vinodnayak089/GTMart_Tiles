package com.gtmarttiles.command;

import org.springframework.web.multipart.MultipartFile;

public class Tiles {
	
	private String designNo;
	private String boxSize;
	private int l;
	private int hl;
	private int d;
	private int f;
	private int prize;
	private MultipartFile multipartImageFile;
	private String base64EncodedImageFile;
	
	public void setBase64EncodedImageFile(String base64EncodedImageFile) {
		this.base64EncodedImageFile = base64EncodedImageFile;
	}
	
	public String getBase64EncodedImageFile() {
		return base64EncodedImageFile;
	}

    public MultipartFile getImageFile() {
        return multipartImageFile;
    }

    public void setImageFile(MultipartFile multipartImageFile) {
        this.multipartImageFile = multipartImageFile;
    }
	
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
				+ f + ", prize=" + prize + ", multipartImageFile=" + multipartImageFile + "]";
	}
}
