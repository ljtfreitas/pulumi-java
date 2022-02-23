// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A policy that specifies how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer doesn't wait for responses from the shadow service. Before sending traffic to the shadow service, the host or authority header is suffixed with -shadow.
 * 
 */
public final class RequestMirrorPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RequestMirrorPolicyResponse Empty = new RequestMirrorPolicyResponse();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @InputImport(name="backendService", required=true)
      private final String backendService;

    public String getBackendService() {
        return this.backendService;
    }

    public RequestMirrorPolicyResponse(String backendService) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
    }

    private RequestMirrorPolicyResponse() {
        this.backendService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public RequestMirrorPolicyResponse build() {
            return new RequestMirrorPolicyResponse(backendService);
        }
    }
}
