// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.SubnetTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSubnetResult {
    private final @Nullable Boolean assignIpv6AddressOnCreation;
    private final @Nullable String ipv6CidrBlock;
    private final @Nullable List<String> ipv6CidrBlocks;
    private final @Nullable Boolean mapPublicIpOnLaunch;
    private final @Nullable String networkAclAssociationId;
    private final @Nullable String subnetId;
    private final @Nullable List<SubnetTag> tags;

    @CustomType.Constructor
    private GetSubnetResult(
        @CustomType.Parameter("assignIpv6AddressOnCreation") @Nullable Boolean assignIpv6AddressOnCreation,
        @CustomType.Parameter("ipv6CidrBlock") @Nullable String ipv6CidrBlock,
        @CustomType.Parameter("ipv6CidrBlocks") @Nullable List<String> ipv6CidrBlocks,
        @CustomType.Parameter("mapPublicIpOnLaunch") @Nullable Boolean mapPublicIpOnLaunch,
        @CustomType.Parameter("networkAclAssociationId") @Nullable String networkAclAssociationId,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("tags") @Nullable List<SubnetTag> tags) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.networkAclAssociationId = networkAclAssociationId;
        this.subnetId = subnetId;
        this.tags = tags;
    }

    public Optional<Boolean> getAssignIpv6AddressOnCreation() {
        return Optional.ofNullable(this.assignIpv6AddressOnCreation);
    }
    public Optional<String> getIpv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }
    public List<String> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks == null ? List.of() : this.ipv6CidrBlocks;
    }
    public Optional<Boolean> getMapPublicIpOnLaunch() {
        return Optional.ofNullable(this.mapPublicIpOnLaunch);
    }
    public Optional<String> getNetworkAclAssociationId() {
        return Optional.ofNullable(this.networkAclAssociationId);
    }
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    public List<SubnetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignIpv6AddressOnCreation;
        private @Nullable String ipv6CidrBlock;
        private @Nullable List<String> ipv6CidrBlocks;
        private @Nullable Boolean mapPublicIpOnLaunch;
        private @Nullable String networkAclAssociationId;
        private @Nullable String subnetId;
        private @Nullable List<SubnetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.networkAclAssociationId = defaults.networkAclAssociationId;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder assignIpv6AddressOnCreation(@Nullable Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder ipv6CidrBlocks(@Nullable List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        public Builder mapPublicIpOnLaunch(@Nullable Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }

        public Builder networkAclAssociationId(@Nullable String networkAclAssociationId) {
            this.networkAclAssociationId = networkAclAssociationId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder tags(@Nullable List<SubnetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetSubnetResult build() {
            return new GetSubnetResult(assignIpv6AddressOnCreation, ipv6CidrBlock, ipv6CidrBlocks, mapPublicIpOnLaunch, networkAclAssociationId, subnetId, tags);
        }
    }
}
