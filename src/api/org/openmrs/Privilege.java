package org.openmrs;

import org.openmrs.synchronization.ISynchronizable;


/**
 * Privilege 
 * 
 * @author Burke Mamlin
 * @version 1.0
 */
public class Privilege implements java.io.Serializable, ISynchronizable {

	public static final long serialVersionUID = 312L;

	// Fields

	private String privilege;
	private String description;
	private String guid;
	
  public String getGuid() {
      return guid;
  }

  public void setGuid(String guid) {
      this.guid = guid;
  }

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	/** constructor with id */
	public Privilege(String privilege) {
		this.privilege = privilege;
	}
	
	public Privilege(String privilege, String description) {
		this.privilege = privilege;
		this.description = description;
	}
	
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Privilege)) return false;
		return privilege.equals(((Privilege)obj).privilege);
	}
	
	public int hashCode() {
		if (this.getPrivilege() == null) return super.hashCode();
		return this.getPrivilege().hashCode();
	}

	// Property accessors

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns the privilege.
	 */
	public String getPrivilege() {
		return privilege;
	}

	/**
	 * @param privilege The privilege to set.
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.privilege;
	}
}