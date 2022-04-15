// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherGetArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    @Import(name="routeRules", required=true)
      private final Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules;

    public Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules() {
        return this.routeRules;
    }

    public EdgeCacheServiceRoutingPathMatcherGetArgs(
        @Nullable Output<String> description,
        Output<String> name,
        Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules) {
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routeRules = Objects.requireNonNull(routeRules, "expected parameter 'routeRules' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherGetArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.routeRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder routeRules(Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs>> routeRules) {
            this.routeRules = Objects.requireNonNull(routeRules);
            return this;
        }
        public Builder routeRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs> routeRules) {
            this.routeRules = Output.of(Objects.requireNonNull(routeRules));
            return this;
        }
        public Builder routeRules(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }        public EdgeCacheServiceRoutingPathMatcherGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherGetArgs(description, name, routeRules);
        }
    }
}
