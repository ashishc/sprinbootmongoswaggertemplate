package com.comp.unit;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document(collection = "users")
@Data
@ToString
public class UserEntity {

	@Id
	public ObjectId _id;
	
	public String name;
	
	public String hexId;

	public void setHexId(String hexId) {
		if (hexId == null && _id != null)
			this.hexId = _id.toHexString();
		else if (hexId != null && _id == null) {
			this._id = new ObjectId(hexId);
		}
	}
	
	public String getHexId() {
		if(hexId == null && this._id != null) this.hexId = this._id.toHexString();
		
		return this.hexId;
	}

}
