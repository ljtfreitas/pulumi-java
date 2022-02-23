// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove {
    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    private final String headerName;

    @OutputCustomType.Constructor({"headerName"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove(String headerName) {
        this.headerName = Objects.requireNonNull(headerName);
    }

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    public String getHeaderName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove(headerName);
        }
    }
}
