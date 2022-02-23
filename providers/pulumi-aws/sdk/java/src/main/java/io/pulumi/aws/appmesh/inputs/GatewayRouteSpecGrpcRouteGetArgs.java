// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteGetArgs Empty = new GatewayRouteSpecGrpcRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<GatewayRouteSpecGrpcRouteActionGetArgs> action;

    public Input<GatewayRouteSpecGrpcRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining a request match.
     * 
     */
    @InputImport(name="match", required=true)
    private final Input<GatewayRouteSpecGrpcRouteMatchGetArgs> match;

    public Input<GatewayRouteSpecGrpcRouteMatchGetArgs> getMatch() {
        return this.match;
    }

    public GatewayRouteSpecGrpcRouteGetArgs(
        Input<GatewayRouteSpecGrpcRouteActionGetArgs> action,
        Input<GatewayRouteSpecGrpcRouteMatchGetArgs> match) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteGetArgs() {
        this.action = Input.empty();
        this.match = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayRouteSpecGrpcRouteActionGetArgs> action;
        private Input<GatewayRouteSpecGrpcRouteMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        public Builder setAction(Input<GatewayRouteSpecGrpcRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(GatewayRouteSpecGrpcRouteActionGetArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setMatch(Input<GatewayRouteSpecGrpcRouteMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(GatewayRouteSpecGrpcRouteMatchGetArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }
        public GatewayRouteSpecGrpcRouteGetArgs build() {
            return new GatewayRouteSpecGrpcRouteGetArgs(action, match);
        }
    }
}
