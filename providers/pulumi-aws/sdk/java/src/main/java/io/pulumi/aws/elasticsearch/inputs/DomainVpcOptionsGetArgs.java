// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainVpcOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainVpcOptionsGetArgs Empty = new DomainVpcOptionsGetArgs();

    @InputImport(name="availabilityZones")
    private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
     * 
     */
    @InputImport(name="securityGroupIds")
    private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
     * 
     */
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

    public DomainVpcOptionsGetArgs(
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<String> vpcId) {
        this.availabilityZones = availabilityZones;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    private DomainVpcOptionsGetArgs() {
        this.availabilityZones = Input.empty();
        this.securityGroupIds = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainVpcOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainVpcOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAvailabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
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
        public DomainVpcOptionsGetArgs build() {
            return new DomainVpcOptionsGetArgs(availabilityZones, securityGroupIds, subnetIds, vpcId);
        }
    }
}
