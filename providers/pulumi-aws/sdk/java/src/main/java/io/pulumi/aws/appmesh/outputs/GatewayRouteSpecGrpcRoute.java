// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteAction;
import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteMatch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteSpecGrpcRoute {
    /**
     * The action to take if a match is determined.
     * 
     */
    private final GatewayRouteSpecGrpcRouteAction action;
    /**
     * The criteria for determining a request match.
     * 
     */
    private final GatewayRouteSpecGrpcRouteMatch match;

    @OutputCustomType.Constructor({"action","match"})
    private GatewayRouteSpecGrpcRoute(
        GatewayRouteSpecGrpcRouteAction action,
        GatewayRouteSpecGrpcRouteMatch match) {
        this.action = Objects.requireNonNull(action);
        this.match = Objects.requireNonNull(match);
    }

    /**
     * The action to take if a match is determined.
     * 
     */
    public GatewayRouteSpecGrpcRouteAction getAction() {
        return this.action;
    }
    /**
     * The criteria for determining a request match.
     * 
     */
    public GatewayRouteSpecGrpcRouteMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteAction action;
        private GatewayRouteSpecGrpcRouteMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        public Builder setAction(GatewayRouteSpecGrpcRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setMatch(GatewayRouteSpecGrpcRouteMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public GatewayRouteSpecGrpcRoute build() {
            return new GatewayRouteSpecGrpcRoute(action, match);
        }
    }
}
