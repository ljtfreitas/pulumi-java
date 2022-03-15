// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    @Import(name="exactMatch")
      private final @Nullable Output<String> exactMatch;

    public Output<String> getExactMatch() {
        return this.exactMatch == null ? Output.empty() : this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    @Import(name="presentMatch")
      private final @Nullable Output<Boolean> presentMatch;

    public Output<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Output.empty() : this.presentMatch;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(
        @Nullable Output<String> exactMatch,
        Output<String> name,
        @Nullable Output<Boolean> presentMatch) {
        this.exactMatch = exactMatch;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.presentMatch = presentMatch;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs() {
        this.exactMatch = Output.empty();
        this.name = Output.empty();
        this.presentMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exactMatch;
        private Output<String> name;
        private @Nullable Output<Boolean> presentMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
        }

        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = Output.ofNullable(exactMatch);
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

        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Output.ofNullable(presentMatch);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs(exactMatch, name, presentMatch);
        }
    }
}
