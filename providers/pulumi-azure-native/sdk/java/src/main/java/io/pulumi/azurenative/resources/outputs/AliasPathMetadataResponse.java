// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AliasPathMetadataResponse {
    /**
     * The attributes of the token that the alias path is referring to.
     * 
     */
    private final String attributes;
    /**
     * The type of the token that the alias path is referring to.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AliasPathMetadataResponse(
        @CustomType.Parameter("attributes") String attributes,
        @CustomType.Parameter("type") String type) {
        this.attributes = attributes;
        this.type = type;
    }

    /**
     * The attributes of the token that the alias path is referring to.
     * 
    */
    public String getAttributes() {
        return this.attributes;
    }
    /**
     * The type of the token that the alias path is referring to.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPathMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPathMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.type = defaults.type;
        }

        public Builder attributes(String attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AliasPathMetadataResponse build() {
            return new AliasPathMetadataResponse(attributes, type);
        }
    }
}
