package boot.spring.po;

public class User_role {
	int urid;
	User sys_user;
	Role role;
	
	public int getUrid() {
		return urid;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public User getUser() {
		return sys_user;
	}
	public void setUser(User user) {
		this.sys_user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
