// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class EnvironmentResponse {
    private final Map<String,String> customValues;

    @CustomType.Constructor
    private EnvironmentResponse(@CustomType.Parameter("customValues") Map<String,String> customValues) {
        this.customValues = customValues;
    }

    public Map<String,String> customValues() {
        return this.customValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customValues;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customValues = defaults.customValues;
        }

        public Builder customValues(Map<String,String> customValues) {
            this.customValues = Objects.requireNonNull(customValues);
            return this;
        }        public EnvironmentResponse build() {
            return new EnvironmentResponse(customValues);
        }
    }
}
