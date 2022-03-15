// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HashResponse {
    /**
     * The type of hash that was performed.
     * 
     */
    private final String type;
    /**
     * The hash value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private HashResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of hash that was performed.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The hash value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HashResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HashResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public HashResponse build() {
            return new HashResponse(type, value);
        }
    }
}
