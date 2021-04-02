package web_basic.chap04_login;

public class Member {
	private String name;
    private String userId;
    private String nickName;
    private String pwd;
    private String email;
    private String phone;

    
    public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String userId, String nickName, String pwd, String email, String phone) {
		this.name = name;
		this.userId = userId;
		this.nickName = nickName;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Member [name=%s, userId=%s, nickName=%s, pwd=%s, email=%s, phone=%s]", name, userId,
                nickName, pwd, email, phone);
    }
}
