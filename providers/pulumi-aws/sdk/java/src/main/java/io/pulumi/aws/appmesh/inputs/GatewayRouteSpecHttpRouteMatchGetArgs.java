// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteMatchGetArgs Empty = new GatewayRouteSpecHttpRouteMatchGetArgs();

    /**
     * Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
     * 
     */
    @InputImport(name="prefix", required=true)
    private final Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix;
    }

    public GatewayRouteSpecHttpRouteMatchGetArgs(Input<String> prefix) {
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
    }

    private GatewayRouteSpecHttpRouteMatchGetArgs() {
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        public Builder setPrefix(Input<String> prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = Input.of(Objects.requireNonNull(prefix));
            return this;
        }
        public GatewayRouteSpecHttpRouteMatchGetArgs build() {
            return new GatewayRouteSpecHttpRouteMatchGetArgs(prefix);
        }
    }
}
