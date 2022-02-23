// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1PropertyResponse {
    /**
     * The property key
     * 
     */
    private final String name;
    /**
     * The property value
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private GoogleCloudApigeeV1PropertyResponse(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The property key
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The property value
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1PropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1PropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudApigeeV1PropertyResponse build() {
            return new GoogleCloudApigeeV1PropertyResponse(name, value);
        }
    }
}
