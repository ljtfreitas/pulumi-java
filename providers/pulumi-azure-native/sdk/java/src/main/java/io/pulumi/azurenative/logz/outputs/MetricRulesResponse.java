// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.FilteringTagResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricRulesResponse {
    /**
     * List of filtering tags to be used for capturing metrics. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    private final @Nullable List<FilteringTagResponse> filteringTags;
    /**
     * Subscription Id for which filtering tags are applicable
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private MetricRulesResponse(
        @CustomType.Parameter("filteringTags") @Nullable List<FilteringTagResponse> filteringTags,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.filteringTags = filteringTags;
        this.subscriptionId = subscriptionId;
    }

    /**
     * List of filtering tags to be used for capturing metrics. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
    */
    public List<FilteringTagResponse> getFilteringTags() {
        return this.filteringTags == null ? List.of() : this.filteringTags;
    }
    /**
     * Subscription Id for which filtering tags are applicable
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilteringTagResponse> filteringTags;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder filteringTags(@Nullable List<FilteringTagResponse> filteringTags) {
            this.filteringTags = filteringTags;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public MetricRulesResponse build() {
            return new MetricRulesResponse(filteringTags, subscriptionId);
        }
    }
}
