package com.structural.adapter;

import com.structural.adapter.ada.PilotPen;

public class PenAdapter implements Pen {

	PilotPen pp = new PilotPen();
	@Override
	public void write(String str) {
		pp.mark(str);

	}

}
