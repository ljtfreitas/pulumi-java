// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RouteSpecGrpcRouteMatchMetadataMatchRange {
    /**
     * The end of the range.
     * 
     */
    private final Integer end;
    /**
     * The start of the range.
     * 
     */
    private final Integer start;

    @CustomType.Constructor
    private RouteSpecGrpcRouteMatchMetadataMatchRange(
        @CustomType.Parameter("end") Integer end,
        @CustomType.Parameter("start") Integer start) {
        this.end = end;
        this.start = start;
    }

    /**
     * The end of the range.
     * 
    */
    public Integer getEnd() {
        return this.end;
    }
    /**
     * The start of the range.
     * 
    */
    public Integer getStart() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadataMatchRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer end;
        private Integer start;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataMatchRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(Integer end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder start(Integer start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public RouteSpecGrpcRouteMatchMetadataMatchRange build() {
            return new RouteSpecGrpcRouteMatchMetadataMatchRange(end, start);
        }
    }
}
