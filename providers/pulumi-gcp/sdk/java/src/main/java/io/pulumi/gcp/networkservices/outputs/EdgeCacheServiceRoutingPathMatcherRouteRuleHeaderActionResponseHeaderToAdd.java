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
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd {
    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    private final String headerName;
    /**
     * The value of the header to add.
     * 
     */
    private final String headerValue;
    /**
     * Whether to replace all existing headers with the same name.
     * 
     */
    private final @Nullable Boolean replace;

    @CustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd(
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("headerValue") String headerValue,
        @CustomType.Parameter("replace") @Nullable Boolean replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
    */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * The value of the header to add.
     * 
    */
    public String getHeaderValue() {
        return this.headerValue;
    }
    /**
     * Whether to replace all existing headers with the same name.
     * 
    */
    public Optional<Boolean> getReplace() {
        return Optional.ofNullable(this.replace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;
        private @Nullable Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder replace(@Nullable Boolean replace) {
            this.replace = replace;
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd(headerName, headerValue, replace);
        }
    }
}
