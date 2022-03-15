// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs Empty = new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService", required=true)
      private final Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService;
    }

    public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs(Output<String> backendService) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
    }

    private URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs() {
        this.backendService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(Output<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder backendService(String backendService) {
            this.backendService = Output.of(Objects.requireNonNull(backendService));
            return this;
        }
        public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs build() {
            return new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicyArgs(backendService);
        }
    }
}
