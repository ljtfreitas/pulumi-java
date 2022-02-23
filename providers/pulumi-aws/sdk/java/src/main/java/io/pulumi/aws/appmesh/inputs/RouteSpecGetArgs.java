// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGetArgs Empty = new RouteSpecGetArgs();

    /**
     * The gRPC routing information for the route.
     * 
     */
    @InputImport(name="grpcRoute")
    private final @Nullable Input<RouteSpecGrpcRouteGetArgs> grpcRoute;

    public Input<RouteSpecGrpcRouteGetArgs> getGrpcRoute() {
        return this.grpcRoute == null ? Input.empty() : this.grpcRoute;
    }

    /**
     * The HTTP/2 routing information for the route.
     * 
     */
    @InputImport(name="http2Route")
    private final @Nullable Input<RouteSpecHttp2RouteGetArgs> http2Route;

    public Input<RouteSpecHttp2RouteGetArgs> getHttp2Route() {
        return this.http2Route == null ? Input.empty() : this.http2Route;
    }

    /**
     * The HTTP routing information for the route.
     * 
     */
    @InputImport(name="httpRoute")
    private final @Nullable Input<RouteSpecHttpRouteGetArgs> httpRoute;

    public Input<RouteSpecHttpRouteGetArgs> getHttpRoute() {
        return this.httpRoute == null ? Input.empty() : this.httpRoute;
    }

    /**
     * The priority for the route, between `0` and `1000`.
     * Routes are matched based on the specified value, where `0` is the highest priority.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The TCP routing information for the route.
     * 
     */
    @InputImport(name="tcpRoute")
    private final @Nullable Input<RouteSpecTcpRouteGetArgs> tcpRoute;

    public Input<RouteSpecTcpRouteGetArgs> getTcpRoute() {
        return this.tcpRoute == null ? Input.empty() : this.tcpRoute;
    }

    public RouteSpecGetArgs(
        @Nullable Input<RouteSpecGrpcRouteGetArgs> grpcRoute,
        @Nullable Input<RouteSpecHttp2RouteGetArgs> http2Route,
        @Nullable Input<RouteSpecHttpRouteGetArgs> httpRoute,
        @Nullable Input<Integer> priority,
        @Nullable Input<RouteSpecTcpRouteGetArgs> tcpRoute) {
        this.grpcRoute = grpcRoute;
        this.http2Route = http2Route;
        this.httpRoute = httpRoute;
        this.priority = priority;
        this.tcpRoute = tcpRoute;
    }

    private RouteSpecGetArgs() {
        this.grpcRoute = Input.empty();
        this.http2Route = Input.empty();
        this.httpRoute = Input.empty();
        this.priority = Input.empty();
        this.tcpRoute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouteSpecGrpcRouteGetArgs> grpcRoute;
        private @Nullable Input<RouteSpecHttp2RouteGetArgs> http2Route;
        private @Nullable Input<RouteSpecHttpRouteGetArgs> httpRoute;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<RouteSpecTcpRouteGetArgs> tcpRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcRoute = defaults.grpcRoute;
    	      this.http2Route = defaults.http2Route;
    	      this.httpRoute = defaults.httpRoute;
    	      this.priority = defaults.priority;
    	      this.tcpRoute = defaults.tcpRoute;
        }

        public Builder setGrpcRoute(@Nullable Input<RouteSpecGrpcRouteGetArgs> grpcRoute) {
            this.grpcRoute = grpcRoute;
            return this;
        }

        public Builder setGrpcRoute(@Nullable RouteSpecGrpcRouteGetArgs grpcRoute) {
            this.grpcRoute = Input.ofNullable(grpcRoute);
            return this;
        }

        public Builder setHttp2Route(@Nullable Input<RouteSpecHttp2RouteGetArgs> http2Route) {
            this.http2Route = http2Route;
            return this;
        }

        public Builder setHttp2Route(@Nullable RouteSpecHttp2RouteGetArgs http2Route) {
            this.http2Route = Input.ofNullable(http2Route);
            return this;
        }

        public Builder setHttpRoute(@Nullable Input<RouteSpecHttpRouteGetArgs> httpRoute) {
            this.httpRoute = httpRoute;
            return this;
        }

        public Builder setHttpRoute(@Nullable RouteSpecHttpRouteGetArgs httpRoute) {
            this.httpRoute = Input.ofNullable(httpRoute);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setTcpRoute(@Nullable Input<RouteSpecTcpRouteGetArgs> tcpRoute) {
            this.tcpRoute = tcpRoute;
            return this;
        }

        public Builder setTcpRoute(@Nullable RouteSpecTcpRouteGetArgs tcpRoute) {
            this.tcpRoute = Input.ofNullable(tcpRoute);
            return this;
        }
        public RouteSpecGetArgs build() {
            return new RouteSpecGetArgs(grpcRoute, http2Route, httpRoute, priority, tcpRoute);
        }
    }
}
