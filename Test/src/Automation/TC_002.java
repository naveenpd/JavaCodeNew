package Automation;

public class TC_002 extends BasePage{

	public static void main(String[] args) throws Exception {

		launch(loadData("chromebrowser"), loadData("facebookurl"));

	}

}
