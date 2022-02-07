package stydy.ocp.day9;

import java.util.Objects;

public class Ball {
	private String color;
	private Integer price;
	
	public Ball() {
	}

	public Ball(String color, Integer price) {
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		//color.equals(obj);
		return Objects.equals(color, other.color) && Objects.equals(price, other.price);
	}
	
	
}
