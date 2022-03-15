// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TestBaseAccountSKUCapabilityResponse {
    /**
     * An invariant to describe the feature, such as 'SLA'.
     * 
     */
    private final String name;
    /**
     * An invariant if the feature is measured by quantity, such as 99.9%.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private TestBaseAccountSKUCapabilityResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * An invariant to describe the feature, such as 'SLA'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An invariant if the feature is measured by quantity, such as 99.9%.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestBaseAccountSKUCapabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TestBaseAccountSKUCapabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TestBaseAccountSKUCapabilityResponse build() {
            return new TestBaseAccountSKUCapabilityResponse(name, value);
        }
    }
}
