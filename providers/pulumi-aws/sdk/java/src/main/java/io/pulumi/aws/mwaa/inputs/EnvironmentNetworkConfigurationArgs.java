// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EnvironmentNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentNetworkConfigurationArgs Empty = new EnvironmentNetworkConfigurationArgs();

    /**
     * Security groups IDs for the environment. At least one of the security group needs to allow MWAA resources to talk to each other, otherwise MWAA cannot be provisioned.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The private subnet IDs in which the environment should be created. MWAA requires two subnets.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    public EnvironmentNetworkConfigurationArgs(
        Output<List<String>> securityGroupIds,
        Output<List<String>> subnetIds) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
    }

    private EnvironmentNetworkConfigurationArgs() {
        this.securityGroupIds = Output.empty();
        this.subnetIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIds;
        private Output<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public EnvironmentNetworkConfigurationArgs build() {
            return new EnvironmentNetworkConfigurationArgs(securityGroupIds, subnetIds);
        }
    }
}
