// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayRouteTablesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayRouteTablesArgs Empty = new GetLocalGatewayRouteTablesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetLocalGatewayRouteTablesFilter> filters;

    public List<GetLocalGatewayRouteTablesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetLocalGatewayRouteTablesArgs(
        @Nullable List<GetLocalGatewayRouteTablesFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetLocalGatewayRouteTablesArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayRouteTablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayRouteTablesFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayRouteTablesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetLocalGatewayRouteTablesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetLocalGatewayRouteTablesArgs build() {
            return new GetLocalGatewayRouteTablesArgs(filters, tags);
        }
    }
}
