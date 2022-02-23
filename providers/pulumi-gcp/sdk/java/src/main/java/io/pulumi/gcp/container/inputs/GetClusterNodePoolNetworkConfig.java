// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolNetworkConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNetworkConfig Empty = new GetClusterNodePoolNetworkConfig();

    @InputImport(name="createPodRange", required=true)
        private final Boolean createPodRange;

    public Boolean getCreatePodRange() {
        return this.createPodRange;
    }

    @InputImport(name="podIpv4CidrBlock", required=true)
        private final String podIpv4CidrBlock;

    public String getPodIpv4CidrBlock() {
        return this.podIpv4CidrBlock;
    }

    @InputImport(name="podRange", required=true)
        private final String podRange;

    public String getPodRange() {
        return this.podRange;
    }

    public GetClusterNodePoolNetworkConfig(
        Boolean createPodRange,
        String podIpv4CidrBlock,
        String podRange) {
        this.createPodRange = Objects.requireNonNull(createPodRange, "expected parameter 'createPodRange' to be non-null");
        this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock, "expected parameter 'podIpv4CidrBlock' to be non-null");
        this.podRange = Objects.requireNonNull(podRange, "expected parameter 'podRange' to be non-null");
    }

    private GetClusterNodePoolNetworkConfig() {
        this.createPodRange = null;
        this.podIpv4CidrBlock = null;
        this.podRange = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createPodRange;
        private String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder setCreatePodRange(Boolean createPodRange) {
            this.createPodRange = Objects.requireNonNull(createPodRange);
            return this;
        }

        public Builder setPodIpv4CidrBlock(String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock);
            return this;
        }

        public Builder setPodRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }
        public GetClusterNodePoolNetworkConfig build() {
            return new GetClusterNodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
