package com.ques2;

import java.util.Objects;

public class Cities {
	private String cityName;

	public Cities(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Cities [cityName=" + cityName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cities other = (Cities) obj;
		return Objects.equals(cityName, other.cityName);
	}

}
