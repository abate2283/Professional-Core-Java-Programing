package com.Arrey.Hashset;

public class Leaves {
	
	String name, color, tree;
	int leaveLength;
	

	public Leaves(String name, String color, String tree, int leaveLength) {
		super();
		this.name = name;
		this.color = color;
		this.tree = tree;
		this.leaveLength = leaveLength;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTree() {
		return tree;
	}
	public void setTree(String tree) {
		this.tree = tree;
	}
	public int getLeaveLength() {
		return leaveLength;
	}
	public void setLeaveLength(int leaveLength) {
		this.leaveLength = leaveLength;
	}
	@Override
	public String toString() {
		return "Leaves [name=" + name + ", color=" + color + ", tree=" + tree + ", leaveLength=" + leaveLength + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + leaveLength;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tree == null) ? 0 : tree.hashCode());
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
		Leaves other = (Leaves) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (leaveLength != other.leaveLength)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tree == null) {
			if (other.tree != null)
				return false;
		} else if (!tree.equals(other.tree))
			return false;
		return true;
	}

}
