// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetNetworkConfigurationArgs Empty = new TaskSetNetworkConfigurationArgs();

    /**
     * Whether to assign a public IP address to the ENI (`FARGATE` launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    @Import(name="assignPublicIp")
      private final @Nullable Output<Boolean> assignPublicIp;

    public Output<Boolean> getAssignPublicIp() {
        return this.assignPublicIp == null ? Output.empty() : this.assignPublicIp;
    }

    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. Maximum of 5.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * The subnets associated with the task or service. Maximum of 16.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> getSubnets() {
        return this.subnets;
    }

    public TaskSetNetworkConfigurationArgs(
        @Nullable Output<Boolean> assignPublicIp,
        @Nullable Output<List<String>> securityGroups,
        Output<List<String>> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private TaskSetNetworkConfigurationArgs() {
        this.assignPublicIp = Output.empty();
        this.securityGroups = Output.empty();
        this.subnets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> assignPublicIp;
        private @Nullable Output<List<String>> securityGroups;
        private Output<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable Output<Boolean> assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
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

        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
            return this;
        }
        public TaskSetNetworkConfigurationArgs build() {
            return new TaskSetNetworkConfigurationArgs(assignPublicIp, securityGroups, subnets);
        }
    }
}
