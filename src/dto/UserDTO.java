package dto;

// ユーザ情報を保持するクラス
public class UserDTO {
	 private String loginId;		// ログインID
	 private String pass;	// パスワード

	 public UserDTO() {

	 }

	 public UserDTO(String loginId, String pass) {

		 this.loginId = loginId;
		 this.pass = pass;

	 }

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}