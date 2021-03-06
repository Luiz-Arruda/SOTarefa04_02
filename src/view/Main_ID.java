package view;

import controller.GetThreadID;

public class Main_ID {

	public static void main(String[] args) {

		for (int id =0; id < 5; id ++) {
			GetThreadID getThreadID = new GetThreadID(id);
			getThreadID.start();
		}
	}
}
