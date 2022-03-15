// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutPerRequestGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteTimeoutGetArgs Empty = new RouteSpecHttp2RouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle;

    public Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> getIdle() {
        return this.idle == null ? Output.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
      private final @Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest;

    public Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> getPerRequest() {
        return this.perRequest == null ? Output.empty() : this.perRequest;
    }

    public RouteSpecHttp2RouteTimeoutGetArgs(
        @Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle,
        @Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private RouteSpecHttp2RouteTimeoutGetArgs() {
        this.idle = Output.empty();
        this.perRequest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle;
        private @Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Output<RouteSpecHttp2RouteTimeoutIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder idle(@Nullable RouteSpecHttp2RouteTimeoutIdleGetArgs idle) {
            this.idle = Output.ofNullable(idle);
            return this;
        }

        public Builder perRequest(@Nullable Output<RouteSpecHttp2RouteTimeoutPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder perRequest(@Nullable RouteSpecHttp2RouteTimeoutPerRequestGetArgs perRequest) {
            this.perRequest = Output.ofNullable(perRequest);
            return this;
        }
        public RouteSpecHttp2RouteTimeoutGetArgs build() {
            return new RouteSpecHttp2RouteTimeoutGetArgs(idle, perRequest);
        }
    }
}
