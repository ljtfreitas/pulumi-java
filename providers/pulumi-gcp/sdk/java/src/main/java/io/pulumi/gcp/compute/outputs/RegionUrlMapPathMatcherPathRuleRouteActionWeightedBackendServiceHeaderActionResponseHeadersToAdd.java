// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd {
    /**
     * The name of the header.
     * 
     */
    private final String headerName;
    /**
     * The value of the header to add.
     * 
     */
    private final String headerValue;
    /**
     * If false, headerValue is appended to any values that already exist for the
     * header. If true, headerValue is set for the header, discarding any values that
     * were set for that header.
     * 
     */
    private final Boolean replace;

    @OutputCustomType.Constructor({"headerName","headerValue","replace"})
    private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd(
        String headerName,
        String headerValue,
        Boolean replace) {
        this.headerName = Objects.requireNonNull(headerName);
        this.headerValue = Objects.requireNonNull(headerValue);
        this.replace = Objects.requireNonNull(replace);
    }

    /**
     * The name of the header.
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
     * If false, headerValue is appended to any values that already exist for the
     * header. If true, headerValue is set for the header, discarding any values that
     * were set for that header.
     * 
     */
    public Boolean getReplace() {
        return this.replace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;
        private Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder setReplace(Boolean replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAdd(headerName, headerValue, replace);
        }
    }
}
