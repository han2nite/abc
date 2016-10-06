package dto;

public class TestDto {

	String testName;
	boolean isOk;

	//ｇｇｇ
	//ｔｔｔｔ

	/**
	 * testNameを取得します。
	 * @return testName
	 */
	public String getTestName() {
	    return testName;
	}


	/**
	 * testNameを設定します。
	 * @param testName testName
	 */
	public void setTestName(String testName) {
	    this.testName = testName;
	}

	public void setIsOk(boolean isOk){
		this.isOk = isOk;
	}

	public boolean getIsOk(){
		return isOk;
	}

}
