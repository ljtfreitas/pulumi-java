// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs Empty = new URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs();

    /**
     * The name of the header to add.
     * 
     */
    @InputImport(name="headerName")
        private final @Nullable Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName == null ? Input.empty() : this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @InputImport(name="headerValue")
        private final @Nullable Input<String> headerValue;

    public Input<String> getHeaderValue() {
        return this.headerValue == null ? Input.empty() : this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    @InputImport(name="replace")
        private final @Nullable Input<Boolean> replace;

    public Input<Boolean> getReplace() {
        return this.replace == null ? Input.empty() : this.replace;
    }

    public URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs(
        @Nullable Input<String> headerName,
        @Nullable Input<String> headerValue,
        @Nullable Input<Boolean> replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    private URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs() {
        this.headerName = Input.empty();
        this.headerValue = Input.empty();
        this.replace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> headerName;
        private @Nullable Input<String> headerValue;
        private @Nullable Input<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder setHeaderName(@Nullable Input<String> headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder setHeaderName(@Nullable String headerName) {
            this.headerName = Input.ofNullable(headerName);
            return this;
        }

        public Builder setHeaderValue(@Nullable Input<String> headerValue) {
            this.headerValue = headerValue;
            return this;
        }

        public Builder setHeaderValue(@Nullable String headerValue) {
            this.headerValue = Input.ofNullable(headerValue);
            return this;
        }

        public Builder setReplace(@Nullable Input<Boolean> replace) {
            this.replace = replace;
            return this;
        }

        public Builder setReplace(@Nullable Boolean replace) {
            this.replace = Input.ofNullable(replace);
            return this;
        }
        public URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs build() {
            return new URLMapDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs(headerName, headerValue, replace);
        }
    }
}
