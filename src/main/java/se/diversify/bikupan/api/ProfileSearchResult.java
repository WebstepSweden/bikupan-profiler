package se.diversify.bikupan.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


@ApiModel(value = "ProfileSearchResult", description = "Contains search item in a search answer")
public class ProfileSearchResult {
    @ApiModelProperty(value = "Name of the co-worker", required = true)
    @JsonProperty("name")
    public final String name;

    @ApiModelProperty(value = "Name of the CV", required = true)
    @JsonProperty("fileName")
    public final String fileName;

    @ApiModelProperty(value = "URI to the CV", required = true)
    @JsonProperty("fileUri")
    public final String fileUri;

    public ProfileSearchResult(String name, String fileName, String fileUri) {
        this.name = name;
        this.fileName = fileName;
        this.fileUri = fileUri;
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
