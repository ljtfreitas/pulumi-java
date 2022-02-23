// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionWeightedBackendServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionWeightedBackendServiceGetArgs Empty = new URLMapDefaultRouteActionWeightedBackendServiceGetArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @InputImport(name="backendService")
        private final @Nullable Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService == null ? Input.empty() : this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerAction")
        private final @Nullable Input<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;

    public Input<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user's request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    @InputImport(name="weight")
        private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public URLMapDefaultRouteActionWeightedBackendServiceGetArgs(
        @Nullable Input<String> backendService,
        @Nullable Input<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction,
        @Nullable Input<Integer> weight) {
        this.backendService = backendService;
        this.headerAction = headerAction;
        this.weight = weight;
    }

    private URLMapDefaultRouteActionWeightedBackendServiceGetArgs() {
        this.backendService = Input.empty();
        this.headerAction = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendService;
        private @Nullable Input<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
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

        public Builder setHeaderAction(@Nullable Input<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs headerAction) {
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
        public URLMapDefaultRouteActionWeightedBackendServiceGetArgs build() {
            return new URLMapDefaultRouteActionWeightedBackendServiceGetArgs(backendService, headerAction, weight);
        }
    }
}
