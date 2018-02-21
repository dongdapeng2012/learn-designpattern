package springbootmvc.domain;

public abstract class BaseDomainBean {
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}