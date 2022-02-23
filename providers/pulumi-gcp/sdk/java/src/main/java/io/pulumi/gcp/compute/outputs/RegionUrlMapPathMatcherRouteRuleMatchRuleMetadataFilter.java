// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter {
    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    private final List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel> filterLabels;
    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * * MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * * MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    private final String filterMatchCriteria;

    @OutputCustomType.Constructor({"filterLabels","filterMatchCriteria"})
    private RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter(
        List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel> filterLabels,
        String filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels);
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
    }

    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    public List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel> getFilterLabels() {
        return this.filterLabels;
    }
    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * * MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * * MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder setFilterLabels(List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder setFilterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilter(filterLabels, filterMatchCriteria);
        }
    }
}
