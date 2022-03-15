// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SettingsParameterDescriptionResponse {
    /**
     * The parameter name of fabric setting.
     * 
     */
    private final String name;
    /**
     * The parameter value of fabric setting.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SettingsParameterDescriptionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The parameter name of fabric setting.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parameter value of fabric setting.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsParameterDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsParameterDescriptionResponse defaults) {
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
        public SettingsParameterDescriptionResponse build() {
            return new SettingsParameterDescriptionResponse(name, value);
        }
    }
}
