// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.HttpHeaderActionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * In contrast to a single BackendService in HttpRouteAction to which all matching traffic is directed to, WeightedBackendService allows traffic to be split across multiple backend services. The volume of traffic for each backend service is proportional to the weight specified in each WeightedBackendService
 * 
 */
public final class WeightedBackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeightedBackendServiceArgs Empty = new WeightedBackendServiceArgs();

    /**
     * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
     * 
     */
    @InputImport(name="backendService")
      private final @Nullable Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService == null ? Input.empty() : this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Input<HttpHeaderActionArgs> headerAction;

    public Input<HttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy. The value must be from 0 to 1000.
     * 
     */
    @InputImport(name="weight")
      private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public WeightedBackendServiceArgs(
        @Nullable Input<String> backendService,
        @Nullable Input<HttpHeaderActionArgs> headerAction,
        @Nullable Input<Integer> weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    private WeightedBackendServiceArgs() {
        this.backendService = Input.empty();
        this.headerAction = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeightedBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendService;
        private @Nullable Input<HttpHeaderActionArgs> headerAction;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(WeightedBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(@Nullable Input<String> backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder setBackendService(@Nullable String backendService) {
            this.backendService = Input.ofNullable(backendService);
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }
        public WeightedBackendServiceArgs build() {
            return new WeightedBackendServiceArgs(backendService, headerAction, weight);
        }
    }
}
