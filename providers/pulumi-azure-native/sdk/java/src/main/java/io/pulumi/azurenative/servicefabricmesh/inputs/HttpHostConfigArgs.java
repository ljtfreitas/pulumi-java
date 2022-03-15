// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the hostname properties for http routing.
 * 
 */
public final class HttpHostConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHostConfigArgs Empty = new HttpHostConfigArgs();

    /**
     * http hostname config name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     * 
     */
    @Import(name="routes", required=true)
      private final Output<List<HttpRouteConfigArgs>> routes;

    public Output<List<HttpRouteConfigArgs>> getRoutes() {
        return this.routes;
    }

    public HttpHostConfigArgs(
        Output<String> name,
        Output<List<HttpRouteConfigArgs>> routes) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routes = Objects.requireNonNull(routes, "expected parameter 'routes' to be non-null");
    }

    private HttpHostConfigArgs() {
        this.name = Output.empty();
        this.routes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHostConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<List<HttpRouteConfigArgs>> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHostConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder routes(Output<List<HttpRouteConfigArgs>> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }

        public Builder routes(List<HttpRouteConfigArgs> routes) {
            this.routes = Output.of(Objects.requireNonNull(routes));
            return this;
        }
        public HttpHostConfigArgs build() {
            return new HttpHostConfigArgs(name, routes);
        }
    }
}
