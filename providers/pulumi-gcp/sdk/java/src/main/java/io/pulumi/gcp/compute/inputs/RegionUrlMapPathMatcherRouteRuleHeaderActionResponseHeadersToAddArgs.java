// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs Empty = new RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs();

    /**
     * The name of the header.
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue", required=true)
      private final Output<String> headerValue;

    public Output<String> getHeaderValue() {
        return this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the
     * header. If true, headerValue is set for the header, discarding any values that
     * were set for that header.
     * 
     */
    @Import(name="replace", required=true)
      private final Output<Boolean> replace;

    public Output<Boolean> getReplace() {
        return this.replace;
    }

    public RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs(
        Output<String> headerName,
        Output<String> headerValue,
        Output<Boolean> replace) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.replace = Objects.requireNonNull(replace, "expected parameter 'replace' to be non-null");
    }

    private RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs() {
        this.headerName = Output.empty();
        this.headerValue = Output.empty();
        this.replace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> headerName;
        private Output<String> headerValue;
        private Output<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder headerValue(Output<String> headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder headerValue(String headerValue) {
            this.headerValue = Output.of(Objects.requireNonNull(headerValue));
            return this;
        }

        public Builder replace(Output<Boolean> replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }

        public Builder replace(Boolean replace) {
            this.replace = Output.of(Objects.requireNonNull(replace));
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleHeaderActionResponseHeadersToAddArgs(headerName, headerValue, replace);
        }
    }
}
