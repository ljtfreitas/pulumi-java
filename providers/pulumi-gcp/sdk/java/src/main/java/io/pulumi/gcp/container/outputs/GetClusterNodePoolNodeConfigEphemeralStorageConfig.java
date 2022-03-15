// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolNodeConfigEphemeralStorageConfig {
    private final Integer localSsdCount;

    @CustomType.Constructor
    private GetClusterNodePoolNodeConfigEphemeralStorageConfig(@CustomType.Parameter("localSsdCount") Integer localSsdCount) {
        this.localSsdCount = localSsdCount;
    }

    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public GetClusterNodePoolNodeConfigEphemeralStorageConfig build() {
            return new GetClusterNodePoolNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
