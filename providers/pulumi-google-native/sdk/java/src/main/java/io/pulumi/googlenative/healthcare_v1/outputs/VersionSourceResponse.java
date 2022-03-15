// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VersionSourceResponse {
    /**
     * The field to extract from the MSH segment. For example, "3.1" or "18[1].1".
     * 
     */
    private final String mshField;
    /**
     * The value to match with the field. For example, "My Application Name" or "2.3".
     * 
     */
    private final String value;

    @CustomType.Constructor
    private VersionSourceResponse(
        @CustomType.Parameter("mshField") String mshField,
        @CustomType.Parameter("value") String value) {
        this.mshField = mshField;
        this.value = value;
    }

    /**
     * The field to extract from the MSH segment. For example, "3.1" or "18[1].1".
     * 
    */
    public String getMshField() {
        return this.mshField;
    }
    /**
     * The value to match with the field. For example, "My Application Name" or "2.3".
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mshField;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mshField = defaults.mshField;
    	      this.value = defaults.value;
        }

        public Builder mshField(String mshField) {
            this.mshField = Objects.requireNonNull(mshField);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VersionSourceResponse build() {
            return new VersionSourceResponse(mshField, value);
        }
    }
}
