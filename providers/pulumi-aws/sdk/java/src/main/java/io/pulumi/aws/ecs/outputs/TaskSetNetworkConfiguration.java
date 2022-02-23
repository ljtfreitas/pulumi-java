// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskSetNetworkConfiguration {
    /**
     * Whether to assign a public IP address to the ENI (`FARGATE` launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    private final @Nullable Boolean assignPublicIp;
    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. Maximum of 5.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * The subnets associated with the task or service. Maximum of 16.
     * 
     */
    private final List<String> subnets;

    @OutputCustomType.Constructor({"assignPublicIp","securityGroups","subnets"})
    private TaskSetNetworkConfiguration(
        @Nullable Boolean assignPublicIp,
        @Nullable List<String> securityGroups,
        List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = Objects.requireNonNull(subnets);
    }

    /**
     * Whether to assign a public IP address to the ENI (`FARGATE` launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    public Optional<Boolean> getAssignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. Maximum of 5.
     * 
     */
    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * The subnets associated with the task or service. Maximum of 16.
     * 
     */
    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder setAssignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public TaskSetNetworkConfiguration build() {
            return new TaskSetNetworkConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
