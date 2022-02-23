// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketCorsItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsItemArgs Empty = new BucketCorsItemArgs();

    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses.
     * 
     */
    @InputImport(name="maxAgeSeconds")
      private final @Nullable Input<Integer> maxAgeSeconds;

    public Input<Integer> getMaxAgeSeconds() {
        return this.maxAgeSeconds == null ? Input.empty() : this.maxAgeSeconds;
    }

    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<List<String>> method;

    public Input<List<String>> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
     */
    @InputImport(name="origin")
      private final @Nullable Input<List<String>> origin;

    public Input<List<String>> getOrigin() {
        return this.origin == null ? Input.empty() : this.origin;
    }

    /**
     * The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains.
     * 
     */
    @InputImport(name="responseHeader")
      private final @Nullable Input<List<String>> responseHeader;

    public Input<List<String>> getResponseHeader() {
        return this.responseHeader == null ? Input.empty() : this.responseHeader;
    }

    public BucketCorsItemArgs(
        @Nullable Input<Integer> maxAgeSeconds,
        @Nullable Input<List<String>> method,
        @Nullable Input<List<String>> origin,
        @Nullable Input<List<String>> responseHeader) {
        this.maxAgeSeconds = maxAgeSeconds;
        this.method = method;
        this.origin = origin;
        this.responseHeader = responseHeader;
    }

    private BucketCorsItemArgs() {
        this.maxAgeSeconds = Input.empty();
        this.method = Input.empty();
        this.origin = Input.empty();
        this.responseHeader = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxAgeSeconds;
        private @Nullable Input<List<String>> method;
        private @Nullable Input<List<String>> origin;
        private @Nullable Input<List<String>> responseHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.method = defaults.method;
    	      this.origin = defaults.origin;
    	      this.responseHeader = defaults.responseHeader;
        }

        public Builder setMaxAgeSeconds(@Nullable Input<Integer> maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public Builder setMaxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = Input.ofNullable(maxAgeSeconds);
            return this;
        }

        public Builder setMethod(@Nullable Input<List<String>> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable List<String> method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setOrigin(@Nullable Input<List<String>> origin) {
            this.origin = origin;
            return this;
        }

        public Builder setOrigin(@Nullable List<String> origin) {
            this.origin = Input.ofNullable(origin);
            return this;
        }

        public Builder setResponseHeader(@Nullable Input<List<String>> responseHeader) {
            this.responseHeader = responseHeader;
            return this;
        }

        public Builder setResponseHeader(@Nullable List<String> responseHeader) {
            this.responseHeader = Input.ofNullable(responseHeader);
            return this;
        }
        public BucketCorsItemArgs build() {
            return new BucketCorsItemArgs(maxAgeSeconds, method, origin, responseHeader);
        }
    }
}
