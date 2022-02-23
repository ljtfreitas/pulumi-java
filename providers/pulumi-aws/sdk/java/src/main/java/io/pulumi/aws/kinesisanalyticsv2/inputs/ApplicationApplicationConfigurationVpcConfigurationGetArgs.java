// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationVpcConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationVpcConfigurationGetArgs Empty = new ApplicationApplicationConfigurationVpcConfigurationGetArgs();

    /**
     * The Security Group IDs used by the VPC configuration.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
    private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The Subnet IDs used by the VPC configuration.
     * 
     */
    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    @InputImport(name="vpcConfigurationId")
    private final @Nullable Input<String> vpcConfigurationId;

    public Input<String> getVpcConfigurationId() {
        return this.vpcConfigurationId == null ? Input.empty() : this.vpcConfigurationId;
    }

    @InputImport(name="vpcId")
    private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public ApplicationApplicationConfigurationVpcConfigurationGetArgs(
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnetIds,
        @Nullable Input<String> vpcConfigurationId,
        @Nullable Input<String> vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcConfigurationId = vpcConfigurationId;
        this.vpcId = vpcId;
    }

    private ApplicationApplicationConfigurationVpcConfigurationGetArgs() {
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcConfigurationId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationVpcConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnetIds;
        private @Nullable Input<String> vpcConfigurationId;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationVpcConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcConfigurationId = defaults.vpcConfigurationId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setSecurityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder setVpcConfigurationId(@Nullable Input<String> vpcConfigurationId) {
            this.vpcConfigurationId = vpcConfigurationId;
            return this;
        }

        public Builder setVpcConfigurationId(@Nullable String vpcConfigurationId) {
            this.vpcConfigurationId = Input.ofNullable(vpcConfigurationId);
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
        public ApplicationApplicationConfigurationVpcConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationVpcConfigurationGetArgs(securityGroupIds, subnetIds, vpcConfigurationId, vpcId);
        }
    }
}
