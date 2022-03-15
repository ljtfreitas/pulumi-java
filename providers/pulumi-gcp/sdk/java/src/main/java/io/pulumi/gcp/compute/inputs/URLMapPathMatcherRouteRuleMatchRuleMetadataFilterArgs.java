// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs Empty = new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    @Import(name="filterLabels", required=true)
      private final Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels;

    public Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> getFilterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * - MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * - MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    @Import(name="filterMatchCriteria", required=true)
      private final Output<String> filterMatchCriteria;

    public Output<String> getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs(
        Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels,
        Output<String> filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels, "expected parameter 'filterLabels' to be non-null");
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
    }

    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs() {
        this.filterLabels = Output.empty();
        this.filterMatchCriteria = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels;
        private Output<String> filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(Output<List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder filterLabels(List<URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs> filterLabels) {
            this.filterLabels = Output.of(Objects.requireNonNull(filterLabels));
            return this;
        }

        public Builder filterMatchCriteria(Output<String> filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }

        public Builder filterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Output.of(Objects.requireNonNull(filterMatchCriteria));
            return this;
        }
        public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs build() {
            return new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs(filterLabels, filterMatchCriteria);
        }
    }
}
