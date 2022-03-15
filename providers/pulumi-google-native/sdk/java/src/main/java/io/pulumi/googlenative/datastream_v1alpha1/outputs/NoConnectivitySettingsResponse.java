// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class NoConnectivitySettingsResponse {
    @CustomType.Constructor
    private NoConnectivitySettingsResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoConnectivitySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(NoConnectivitySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public NoConnectivitySettingsResponse build() {
            return new NoConnectivitySettingsResponse();
        }
    }
}
