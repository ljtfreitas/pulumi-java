// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetInstanceConfidentialInstanceConfig {
    private final Boolean enableConfidentialCompute;

    @CustomType.Constructor
    private GetInstanceConfidentialInstanceConfig(@CustomType.Parameter("enableConfidentialCompute") Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }        public GetInstanceConfidentialInstanceConfig build() {
            return new GetInstanceConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
