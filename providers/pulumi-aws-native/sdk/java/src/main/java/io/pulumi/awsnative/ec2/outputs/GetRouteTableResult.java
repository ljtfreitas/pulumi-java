// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.RouteTableTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteTableResult {
    /**
     * The route table ID.
     * 
     */
    private final @Nullable String routeTableId;
    /**
     * Any tags assigned to the route table.
     * 
     */
    private final @Nullable List<RouteTableTag> tags;

    @OutputCustomType.Constructor({"routeTableId","tags"})
    private GetRouteTableResult(
        @Nullable String routeTableId,
        @Nullable List<RouteTableTag> tags) {
        this.routeTableId = routeTableId;
        this.tags = tags;
    }

    /**
     * The route table ID.
     * 
     */
    public Optional<String> getRouteTableId() {
        return Optional.ofNullable(this.routeTableId);
    }
    /**
     * Any tags assigned to the route table.
     * 
     */
    public List<RouteTableTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String routeTableId;
        private @Nullable List<RouteTableTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTableId = defaults.routeTableId;
    	      this.tags = defaults.tags;
        }

        public Builder setRouteTableId(@Nullable String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }

        public Builder setTags(@Nullable List<RouteTableTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetRouteTableResult build() {
            return new GetRouteTableResult(routeTableId, tags);
        }
    }
}
