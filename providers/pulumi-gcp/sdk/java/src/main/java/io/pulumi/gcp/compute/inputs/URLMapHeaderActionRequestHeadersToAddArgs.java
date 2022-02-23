// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class URLMapHeaderActionRequestHeadersToAddArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapHeaderActionRequestHeadersToAddArgs Empty = new URLMapHeaderActionRequestHeadersToAddArgs();

    /**
     * The name of the header to add.
     * 
     */
    @InputImport(name="headerName", required=true)
        private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @InputImport(name="headerValue", required=true)
        private final Input<String> headerValue;

    public Input<String> getHeaderValue() {
        return this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    @InputImport(name="replace", required=true)
        private final Input<Boolean> replace;

    public Input<Boolean> getReplace() {
        return this.replace;
    }

    public URLMapHeaderActionRequestHeadersToAddArgs(
        Input<String> headerName,
        Input<String> headerValue,
        Input<Boolean> replace) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.replace = Objects.requireNonNull(replace, "expected parameter 'replace' to be non-null");
    }

    private URLMapHeaderActionRequestHeadersToAddArgs() {
        this.headerName = Input.empty();
        this.headerValue = Input.empty();
        this.replace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapHeaderActionRequestHeadersToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;
        private Input<String> headerValue;
        private Input<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapHeaderActionRequestHeadersToAddArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setHeaderValue(Input<String> headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder setHeaderValue(String headerValue) {
            this.headerValue = Input.of(Objects.requireNonNull(headerValue));
            return this;
        }

        public Builder setReplace(Input<Boolean> replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }

        public Builder setReplace(Boolean replace) {
            this.replace = Input.of(Objects.requireNonNull(replace));
            return this;
        }
        public URLMapHeaderActionRequestHeadersToAddArgs build() {
            return new URLMapHeaderActionRequestHeadersToAddArgs(headerName, headerValue, replace);
        }
    }
}
