// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The request and response header transformations that take effect before the request is passed along to the selected backendService.
 * 
 */
public final class HttpHeaderActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpHeaderActionResponse Empty = new HttpHeaderActionResponse();

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToAdd", required=true)
      private final List<HttpHeaderOptionResponse> requestHeadersToAdd;

    public List<HttpHeaderOptionResponse> getRequestHeadersToAdd() {
        return this.requestHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToRemove", required=true)
      private final List<String> requestHeadersToRemove;

    public List<String> getRequestHeadersToRemove() {
        return this.requestHeadersToRemove;
    }

    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToAdd", required=true)
      private final List<HttpHeaderOptionResponse> responseHeadersToAdd;

    public List<HttpHeaderOptionResponse> getResponseHeadersToAdd() {
        return this.responseHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToRemove", required=true)
      private final List<String> responseHeadersToRemove;

    public List<String> getResponseHeadersToRemove() {
        return this.responseHeadersToRemove;
    }

    public HttpHeaderActionResponse(
        List<HttpHeaderOptionResponse> requestHeadersToAdd,
        List<String> requestHeadersToRemove,
        List<HttpHeaderOptionResponse> responseHeadersToAdd,
        List<String> responseHeadersToRemove) {
        this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd, "expected parameter 'requestHeadersToAdd' to be non-null");
        this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove, "expected parameter 'requestHeadersToRemove' to be non-null");
        this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd, "expected parameter 'responseHeadersToAdd' to be non-null");
        this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove, "expected parameter 'responseHeadersToRemove' to be non-null");
    }

    private HttpHeaderActionResponse() {
        this.requestHeadersToAdd = List.of();
        this.requestHeadersToRemove = List.of();
        this.responseHeadersToAdd = List.of();
        this.responseHeadersToRemove = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHeaderOptionResponse> requestHeadersToAdd;
        private List<String> requestHeadersToRemove;
        private List<HttpHeaderOptionResponse> responseHeadersToAdd;
        private List<String> responseHeadersToRemove;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        public Builder setRequestHeadersToAdd(List<HttpHeaderOptionResponse> requestHeadersToAdd) {
            this.requestHeadersToAdd = Objects.requireNonNull(requestHeadersToAdd);
            return this;
        }

        public Builder setRequestHeadersToRemove(List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Objects.requireNonNull(requestHeadersToRemove);
            return this;
        }

        public Builder setResponseHeadersToAdd(List<HttpHeaderOptionResponse> responseHeadersToAdd) {
            this.responseHeadersToAdd = Objects.requireNonNull(responseHeadersToAdd);
            return this;
        }

        public Builder setResponseHeadersToRemove(List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Objects.requireNonNull(responseHeadersToRemove);
            return this;
        }
        public HttpHeaderActionResponse build() {
            return new HttpHeaderActionResponse(requestHeadersToAdd, requestHeadersToRemove, responseHeadersToAdd, responseHeadersToRemove);
        }
    }
}
