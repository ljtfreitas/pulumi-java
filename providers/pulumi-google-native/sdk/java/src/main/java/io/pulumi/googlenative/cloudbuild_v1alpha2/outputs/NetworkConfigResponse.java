// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    private final String peeredNetwork;

    @OutputCustomType.Constructor({"peeredNetwork"})
    private NetworkConfigResponse(String peeredNetwork) {
        this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
    }

    public String getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder setPeeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }

        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(peeredNetwork);
        }
    }
}