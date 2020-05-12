
/**
 * TODO Put here a description of what this class does.
 *
 * @author alexandre.
 *         Created 24 de abr de 2020.
 */
public class Vertice {
	
	private int id;
	private String type;
	private int x;
	private int y;
	private int channel;
	/**
	 * Returns the value of the field called 'id'.
	 * @return Returns the id.
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * Sets the field called 'id' to the given value.
	 * @param id The id to set.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Returns the value of the field called 'type'.
	 * @return Returns the type.
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * Sets the field called 'type' to the given value.
	 * @param type The type to set.
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Returns the value of the field called 'x'.
	 * @return Returns the x.
	 */
	public int getX() {
		return this.x;
	}
	/**
	 * Sets the field called 'x' to the given value.
	 * @param x The x to set.
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Returns the value of the field called 'y'.
	 * @return Returns the y.
	 */
	public int getY() {
		return this.y;
	}
	/**
	 * Sets the field called 'y' to the given value.
	 * @param y The y to set.
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Returns the value of the field called 'channel'.
	 * @return Returns the channel.
	 */
	public int getChannel() {
		return this.channel;
	}
	/**
	 * Sets the field called 'channel' to the given value.
	 * @param channel The channel to set.
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "vertice [id=" + this.id + ", type=" + this.type + ", x=" + this.x + ", y=" + this.y + ", channel="
				+ this.channel + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.channel;
		result = prime * result + this.id;
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertice other = (Vertice) obj;
		if (this.channel != other.channel)
			return false;
		if (this.id != other.id)
			return false;
		if (this.type == null) {
			if (other.type != null)
				return false;
		} else if (!this.type.equals(other.type))
			return false;
		if (this.x != other.x)
			return false;
		if (this.y != other.y)
			return false;
		return true;
	}
	
	
	

}
