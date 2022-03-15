// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServiceAwsVpcConfigurationAssignPublicIp;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAwsVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAwsVpcConfigurationArgs Empty = new ServiceAwsVpcConfigurationArgs();

    @Import(name="assignPublicIp")
      private final @Nullable Output<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp;

    public Output<ServiceAwsVpcConfigurationAssignPublicIp> getAssignPublicIp() {
        return this.assignPublicIp == null ? Output.empty() : this.assignPublicIp;
    }

    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    @Import(name="subnets")
      private final @Nullable Output<List<String>> subnets;

    public Output<List<String>> getSubnets() {
        return this.subnets == null ? Output.empty() : this.subnets;
    }

    public ServiceAwsVpcConfigurationArgs(
        @Nullable Output<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<List<String>> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    private ServiceAwsVpcConfigurationArgs() {
        this.assignPublicIp = Output.empty();
        this.securityGroups = Output.empty();
        this.subnets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAwsVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAwsVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable Output<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder assignPublicIp(@Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            this.assignPublicIp = Output.ofNullable(assignPublicIp);
            return this;
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
            return this;
        }

        public Builder subnets(@Nullable Output<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = Output.ofNullable(subnets);
            return this;
        }
        public ServiceAwsVpcConfigurationArgs build() {
            return new ServiceAwsVpcConfigurationArgs(assignPublicIp, securityGroups, subnets);
        }
    }
}
