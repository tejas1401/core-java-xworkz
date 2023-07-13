class TvTester{
	public static void main(String[] args) {
		Tv.onOrOff();
		Tv.increaseVolume();
		Tv.decreaseVolume();
		Tv.changeChannel(101);
		Tv.changeChannel(200);
		Tv.channelUp();
		Tv.channelUp();
		Tv.changeChannel(150);
		Tv.channelUp();
		Tv.channelDown();
		Tv.channelDown();
		Tv.increaseVolume();
		Tv.decreaseVolume();
		Tv.changeChannel(10);
	}
}