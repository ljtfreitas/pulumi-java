// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDestinationVpcDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationVpcDestinationPropertiesArgs Empty = new TopicRuleDestinationVpcDestinationPropertiesArgs();

    @InputImport(name="roleArn")
        private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    @InputImport(name="securityGroups")
        private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    @InputImport(name="subnetIds")
        private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    @InputImport(name="vpcId")
        private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public TopicRuleDestinationVpcDestinationPropertiesArgs(
        @Nullable Input<String> roleArn,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<String> vpcId) {
        this.roleArn = roleArn;
        this.securityGroups = securityGroups;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    private TopicRuleDestinationVpcDestinationPropertiesArgs() {
        this.roleArn = Input.empty();
        this.securityGroups = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationVpcDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> roleArn;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationVpcDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public TopicRuleDestinationVpcDestinationPropertiesArgs build() {
            return new TopicRuleDestinationVpcDestinationPropertiesArgs(roleArn, securityGroups, subnetIds, vpcId);
        }
    }
}
