// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetCoipPoolFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoipPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCoipPoolArgs Empty = new GetCoipPoolArgs();

    @InputImport(name="filters")
    private final @Nullable List<GetCoipPoolFilter> filters;

    public List<GetCoipPoolFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Local Gateway Route Table Id assigned to desired COIP Pool
     * 
     */
    @InputImport(name="localGatewayRouteTableId")
    private final @Nullable String localGatewayRouteTableId;

    public Optional<String> getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId == null ? Optional.empty() : Optional.ofNullable(this.localGatewayRouteTableId);
    }

    /**
     * The id of the specific COIP Pool to retrieve.
     * 
     */
    @InputImport(name="poolId")
    private final @Nullable String poolId;

    public Optional<String> getPoolId() {
        return this.poolId == null ? Optional.empty() : Optional.ofNullable(this.poolId);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired COIP Pool.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetCoipPoolArgs(
        @Nullable List<GetCoipPoolFilter> filters,
        @Nullable String localGatewayRouteTableId,
        @Nullable String poolId,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        this.poolId = poolId;
        this.tags = tags;
    }

    private GetCoipPoolArgs() {
        this.filters = List.of();
        this.localGatewayRouteTableId = null;
        this.poolId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCoipPoolFilter> filters;
        private @Nullable String localGatewayRouteTableId;
        private @Nullable String poolId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoipPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.localGatewayRouteTableId = defaults.localGatewayRouteTableId;
    	      this.poolId = defaults.poolId;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetCoipPoolFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setLocalGatewayRouteTableId(@Nullable String localGatewayRouteTableId) {
            this.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        public Builder setPoolId(@Nullable String poolId) {
            this.poolId = poolId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetCoipPoolArgs build() {
            return new GetCoipPoolArgs(filters, localGatewayRouteTableId, poolId, tags);
        }
    }
}
