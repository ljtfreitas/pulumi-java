// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetNatGatewayFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNatGatewayArgs Empty = new GetNatGatewayArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetNatGatewayFilter> filters;

    public List<GetNatGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The id of the specific Nat Gateway to retrieve.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
     * 
     */
    @InputImport(name="state")
    private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * The id of subnet that the Nat Gateway resides in.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired Nat Gateway.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The id of the VPC that the Nat Gateway resides in.
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable String vpcId;

    public Optional<String> getVpcId() {
        return this.vpcId == null ? Optional.empty() : Optional.ofNullable(this.vpcId);
    }

    public GetNatGatewayArgs(
        @Nullable List<GetNatGatewayFilter> filters,
        @Nullable String id,
        @Nullable String state,
        @Nullable String subnetId,
        @Nullable Map<String,String> tags,
        @Nullable String vpcId) {
        this.filters = filters;
        this.id = id;
        this.state = state;
        this.subnetId = subnetId;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private GetNatGatewayArgs() {
        this.filters = List.of();
        this.id = null;
        this.state = null;
        this.subnetId = null;
        this.tags = Map.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetNatGatewayFilter> filters;
        private @Nullable String id;
        private @Nullable String state;
        private @Nullable String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setFilters(@Nullable List<GetNatGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetNatGatewayArgs build() {
            return new GetNatGatewayArgs(filters, id, state, subnetId, tags, vpcId);
        }
    }
}
