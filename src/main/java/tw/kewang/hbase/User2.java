package tw.kewang.hbase;

import tw.kewang.hbase.annotations.Component;
import tw.kewang.hbase.annotations.Rowkey;
import tw.kewang.hbase.domain.AbstractDomain;

@Rowkey("{ui}_{at}")
public class User2 extends AbstractDomain {
	@Component(name = "ui")
	private String userId;

	@Component(name = "at")
	private String accessToken;

	@Component(name = "ct")
	private long createdTime;

	public String getUserId() {
		return userId;
	}

	public User2 setUserId(String userId) {
		this.userId = userId;

		return this;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public User2 setAccessToken(String accessToken) {
		this.accessToken = accessToken;

		return this;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public User2 setCreatedTime(long createdTime) {
		this.createdTime = createdTime;

		return this;
	}
}