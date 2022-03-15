// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs();

    /**
     * The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    @Import(name="backendService", required=true)
      private final Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Output.empty() : this.headerAction;
    }

    /**
     * Specifies the fraction of traffic sent to backendService, computed as weight /
     * (sum of all weightedBackendService weights in routeAction) . The selection of a
     * backend service is determined only for new traffic. Once a user's request has
     * been directed to a backendService, subsequent requests will be sent to the same
     * backendService as determined by the BackendService's session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    @Import(name="weight", required=true)
      private final Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs(
        Output<String> backendService,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction,
        Output<Integer> weight) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.headerAction = headerAction;
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs() {
        this.backendService = Output.empty();
        this.headerAction = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backendService;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction;
        private Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder backendService(Output<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder backendService(String backendService) {
            this.backendService = Output.of(Objects.requireNonNull(backendService));
            return this;
        }

        public Builder headerAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionArgs headerAction) {
            this.headerAction = Output.ofNullable(headerAction);
            return this;
        }

        public Builder weight(Output<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder weight(Integer weight) {
            this.weight = Output.of(Objects.requireNonNull(weight));
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs(backendService, headerAction, weight);
        }
    }
}
