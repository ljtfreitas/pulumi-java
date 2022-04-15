// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch {
    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    private final @Nullable String exactMatch;
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    private final @Nullable Boolean presentMatch;

    @CustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch(
        @CustomType.Parameter("exactMatch") @Nullable String exactMatch,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("presentMatch") @Nullable Boolean presentMatch) {
        this.exactMatch = exactMatch;
        this.name = name;
        this.presentMatch = presentMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
    */
    public Optional<String> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
    */
    public Optional<Boolean> presentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactMatch;
        private String name;
        private @Nullable Boolean presentMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatch(exactMatch, name, presentMatch);
        }
    }
}
