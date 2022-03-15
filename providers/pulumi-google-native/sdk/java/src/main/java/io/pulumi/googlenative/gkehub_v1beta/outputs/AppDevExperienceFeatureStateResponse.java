// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gkehub_v1beta.outputs.StatusResponse;
import java.util.Objects;

@CustomType
public final class AppDevExperienceFeatureStateResponse {
    /**
     * Status of subcomponent that detects configured Service Mesh resources.
     * 
     */
    private final StatusResponse networkingInstallSucceeded;

    @CustomType.Constructor
    private AppDevExperienceFeatureStateResponse(@CustomType.Parameter("networkingInstallSucceeded") StatusResponse networkingInstallSucceeded) {
        this.networkingInstallSucceeded = networkingInstallSucceeded;
    }

    /**
     * Status of subcomponent that detects configured Service Mesh resources.
     * 
    */
    public StatusResponse getNetworkingInstallSucceeded() {
        return this.networkingInstallSucceeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppDevExperienceFeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse networkingInstallSucceeded;

        public Builder() {
    	      // Empty
        }

        public Builder(AppDevExperienceFeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkingInstallSucceeded = defaults.networkingInstallSucceeded;
        }

        public Builder networkingInstallSucceeded(StatusResponse networkingInstallSucceeded) {
            this.networkingInstallSucceeded = Objects.requireNonNull(networkingInstallSucceeded);
            return this;
        }
        public AppDevExperienceFeatureStateResponse build() {
            return new AppDevExperienceFeatureStateResponse(networkingInstallSucceeded);
        }
    }
}
