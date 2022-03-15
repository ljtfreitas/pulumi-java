// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.GetGlobalForwardingRuleMetadataFilterFilterLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetGlobalForwardingRuleMetadataFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalForwardingRuleMetadataFilter Empty = new GetGlobalForwardingRuleMetadataFilter();

    @Import(name="filterLabels", required=true)
      private final List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;

    public List<GetGlobalForwardingRuleMetadataFilterFilterLabel> getFilterLabels() {
        return this.filterLabels;
    }

    @Import(name="filterMatchCriteria", required=true)
      private final String filterMatchCriteria;

    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public GetGlobalForwardingRuleMetadataFilter(
        List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels,
        String filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels, "expected parameter 'filterLabels' to be non-null");
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
    }

    private GetGlobalForwardingRuleMetadataFilter() {
        this.filterLabels = List.of();
        this.filterMatchCriteria = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleMetadataFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleMetadataFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder filterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public GetGlobalForwardingRuleMetadataFilter build() {
            return new GetGlobalForwardingRuleMetadataFilter(filterLabels, filterMatchCriteria);
        }
    }
}
