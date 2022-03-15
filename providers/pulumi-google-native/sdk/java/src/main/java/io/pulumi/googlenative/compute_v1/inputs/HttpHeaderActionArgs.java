// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderOptionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The request and response header transformations that take effect before the request is passed along to the selected backendService.
 * 
 */
public final class HttpHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHeaderActionArgs Empty = new HttpHeaderActionArgs();

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToAdd")
      private final @Nullable Output<List<HttpHeaderOptionArgs>> requestHeadersToAdd;

    public Output<List<HttpHeaderOptionArgs>> getRequestHeadersToAdd() {
        return this.requestHeadersToAdd == null ? Output.empty() : this.requestHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToRemove")
      private final @Nullable Output<List<String>> requestHeadersToRemove;

    public Output<List<String>> getRequestHeadersToRemove() {
        return this.requestHeadersToRemove == null ? Output.empty() : this.requestHeadersToRemove;
    }

    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    @Import(name="responseHeadersToAdd")
      private final @Nullable Output<List<HttpHeaderOptionArgs>> responseHeadersToAdd;

    public Output<List<HttpHeaderOptionArgs>> getResponseHeadersToAdd() {
        return this.responseHeadersToAdd == null ? Output.empty() : this.responseHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    @Import(name="responseHeadersToRemove")
      private final @Nullable Output<List<String>> responseHeadersToRemove;

    public Output<List<String>> getResponseHeadersToRemove() {
        return this.responseHeadersToRemove == null ? Output.empty() : this.responseHeadersToRemove;
    }

    public HttpHeaderActionArgs(
        @Nullable Output<List<HttpHeaderOptionArgs>> requestHeadersToAdd,
        @Nullable Output<List<String>> requestHeadersToRemove,
        @Nullable Output<List<HttpHeaderOptionArgs>> responseHeadersToAdd,
        @Nullable Output<List<String>> responseHeadersToRemove) {
        this.requestHeadersToAdd = requestHeadersToAdd;
        this.requestHeadersToRemove = requestHeadersToRemove;
        this.responseHeadersToAdd = responseHeadersToAdd;
        this.responseHeadersToRemove = responseHeadersToRemove;
    }

    private HttpHeaderActionArgs() {
        this.requestHeadersToAdd = Output.empty();
        this.requestHeadersToRemove = Output.empty();
        this.responseHeadersToAdd = Output.empty();
        this.responseHeadersToRemove = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HttpHeaderOptionArgs>> requestHeadersToAdd;
        private @Nullable Output<List<String>> requestHeadersToRemove;
        private @Nullable Output<List<HttpHeaderOptionArgs>> responseHeadersToAdd;
        private @Nullable Output<List<String>> responseHeadersToRemove;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        public Builder requestHeadersToAdd(@Nullable Output<List<HttpHeaderOptionArgs>> requestHeadersToAdd) {
            this.requestHeadersToAdd = requestHeadersToAdd;
            return this;
        }

        public Builder requestHeadersToAdd(@Nullable List<HttpHeaderOptionArgs> requestHeadersToAdd) {
            this.requestHeadersToAdd = Output.ofNullable(requestHeadersToAdd);
            return this;
        }

        public Builder requestHeadersToRemove(@Nullable Output<List<String>> requestHeadersToRemove) {
            this.requestHeadersToRemove = requestHeadersToRemove;
            return this;
        }

        public Builder requestHeadersToRemove(@Nullable List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Output.ofNullable(requestHeadersToRemove);
            return this;
        }

        public Builder responseHeadersToAdd(@Nullable Output<List<HttpHeaderOptionArgs>> responseHeadersToAdd) {
            this.responseHeadersToAdd = responseHeadersToAdd;
            return this;
        }

        public Builder responseHeadersToAdd(@Nullable List<HttpHeaderOptionArgs> responseHeadersToAdd) {
            this.responseHeadersToAdd = Output.ofNullable(responseHeadersToAdd);
            return this;
        }

        public Builder responseHeadersToRemove(@Nullable Output<List<String>> responseHeadersToRemove) {
            this.responseHeadersToRemove = responseHeadersToRemove;
            return this;
        }

        public Builder responseHeadersToRemove(@Nullable List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Output.ofNullable(responseHeadersToRemove);
            return this;
        }
        public HttpHeaderActionArgs build() {
            return new HttpHeaderActionArgs(requestHeadersToAdd, requestHeadersToRemove, responseHeadersToAdd, responseHeadersToRemove);
        }
    }
}
