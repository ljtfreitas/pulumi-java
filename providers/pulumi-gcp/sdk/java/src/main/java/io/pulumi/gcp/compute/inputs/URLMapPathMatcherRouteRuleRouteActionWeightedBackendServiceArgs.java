// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs Empty = new URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @InputImport(name="backendService", required=true)
        private final Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService;
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
        private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction;

    public Input<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> getHeaderAction() {
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
    @InputImport(name="weight", required=true)
        private final Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight;
    }

    public URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs(
        Input<String> backendService,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction,
        Input<Integer> weight) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.headerAction = headerAction;
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs() {
        this.backendService = Input.empty();
        this.headerAction = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backendService;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction;
        private Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(Input<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Input.of(Objects.requireNonNull(backendService));
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setWeight(Input<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Input.of(Objects.requireNonNull(weight));
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs(backendService, headerAction, weight);
        }
    }
}
