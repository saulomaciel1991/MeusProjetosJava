package util;

import basicas.CDPlayer;


public class CDPlayerPlayCommand implements Command{
	CDPlayer cdplayer;

	public CDPlayerPlayCommand(CDPlayer cdplayer) {
		super();
		this.cdplayer = cdplayer;
	}
	
	@Override
	public void execute() {
		this.cdplayer.stop();
	}

}
