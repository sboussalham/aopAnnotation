package com.soufiane.json_to_objetct.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "media_TYPE",
        visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MediaBasic.class, name = "SMS"),
        @JsonSubTypes.Type(value = MediaBasic.class, name = "FAX"),
        @JsonSubTypes.Type(value = MediaBasic.class, name = "MAIL"),
        @JsonSubTypes.Type(value = MediaBasic.class, name = "SOCIAL"),
        @JsonSubTypes.Type(value = MediaBasic.class, name = "PUSH"),
        @JsonSubTypes.Type(value = MediaVocal.class, name = "VOCAL"),
})
public interface IMedia {

    List<String> toStringValues();
}