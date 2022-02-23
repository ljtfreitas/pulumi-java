// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolUpgradeSetting {
    private final Integer maxSurge;
    private final Integer maxUnavailable;

    @OutputCustomType.Constructor({"maxSurge","maxUnavailable"})
    private GetClusterNodePoolUpgradeSetting(
        Integer maxSurge,
        Integer maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge);
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
    }

    public Integer getMaxSurge() {
        return this.maxSurge;
    }
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolUpgradeSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxSurge;
        private Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolUpgradeSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder setMaxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }
        public GetClusterNodePoolUpgradeSetting build() {
            return new GetClusterNodePoolUpgradeSetting(maxSurge, maxUnavailable);
        }
    }
}
