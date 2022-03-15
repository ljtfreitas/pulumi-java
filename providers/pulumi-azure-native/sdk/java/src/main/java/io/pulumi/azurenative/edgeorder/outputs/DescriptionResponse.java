// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.LinkResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DescriptionResponse {
    /**
     * Attributes for the product system.
     * 
     */
    private final List<String> attributes;
    /**
     * Type of description.
     * 
     */
    private final String descriptionType;
    /**
     * Keywords for the product system.
     * 
     */
    private final List<String> keywords;
    /**
     * Links for the product system.
     * 
     */
    private final List<LinkResponse> links;
    /**
     * Long description of the product system.
     * 
     */
    private final String longDescription;
    /**
     * Short description of the product system.
     * 
     */
    private final String shortDescription;

    @CustomType.Constructor
    private DescriptionResponse(
        @CustomType.Parameter("attributes") List<String> attributes,
        @CustomType.Parameter("descriptionType") String descriptionType,
        @CustomType.Parameter("keywords") List<String> keywords,
        @CustomType.Parameter("links") List<LinkResponse> links,
        @CustomType.Parameter("longDescription") String longDescription,
        @CustomType.Parameter("shortDescription") String shortDescription) {
        this.attributes = attributes;
        this.descriptionType = descriptionType;
        this.keywords = keywords;
        this.links = links;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
    }

    /**
     * Attributes for the product system.
     * 
    */
    public List<String> getAttributes() {
        return this.attributes;
    }
    /**
     * Type of description.
     * 
    */
    public String getDescriptionType() {
        return this.descriptionType;
    }
    /**
     * Keywords for the product system.
     * 
    */
    public List<String> getKeywords() {
        return this.keywords;
    }
    /**
     * Links for the product system.
     * 
    */
    public List<LinkResponse> getLinks() {
        return this.links;
    }
    /**
     * Long description of the product system.
     * 
    */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Short description of the product system.
     * 
    */
    public String getShortDescription() {
        return this.shortDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String descriptionType;
        private List<String> keywords;
        private List<LinkResponse> links;
        private String longDescription;
        private String shortDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(DescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.descriptionType = defaults.descriptionType;
    	      this.keywords = defaults.keywords;
    	      this.links = defaults.links;
    	      this.longDescription = defaults.longDescription;
    	      this.shortDescription = defaults.shortDescription;
        }

        public Builder attributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder descriptionType(String descriptionType) {
            this.descriptionType = Objects.requireNonNull(descriptionType);
            return this;
        }

        public Builder keywords(List<String> keywords) {
            this.keywords = Objects.requireNonNull(keywords);
            return this;
        }

        public Builder links(List<LinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder longDescription(String longDescription) {
            this.longDescription = Objects.requireNonNull(longDescription);
            return this;
        }

        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        public DescriptionResponse build() {
            return new DescriptionResponse(attributes, descriptionType, keywords, links, longDescription, shortDescription);
        }
    }
}
