// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetVpcPeeringConnectionsFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPeeringConnectionsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcPeeringConnectionsArgs Empty = new GetVpcPeeringConnectionsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetVpcPeeringConnectionsFilter> filters;

    public List<GetVpcPeeringConnectionsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired VPC Peering Connection.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetVpcPeeringConnectionsArgs(
        @Nullable List<GetVpcPeeringConnectionsFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetVpcPeeringConnectionsArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVpcPeeringConnectionsFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetVpcPeeringConnectionsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetVpcPeeringConnectionsArgs build() {
            return new GetVpcPeeringConnectionsArgs(filters, tags);
        }
    }
}
