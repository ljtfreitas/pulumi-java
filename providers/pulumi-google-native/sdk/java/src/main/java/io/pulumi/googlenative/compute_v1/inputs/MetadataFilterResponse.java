// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.MetadataFilterLabelMatchResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Opaque filter criteria used by load balancers to restrict routing configuration to a limited set of load balancing proxies. Proxies and sidecars involved in load balancing would typically present metadata to the load balancers that need to match criteria specified here. If a match takes place, the relevant configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. An example for using metadataFilters would be: if load balancing involves Envoys, they receive routing configuration when values in metadataFilters match values supplied in of their XDS requests to loadbalancers.
 * 
 */
public final class MetadataFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataFilterResponse Empty = new MetadataFilterResponse();

    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
     */
    @InputImport(name="filterLabels", required=true)
      private final List<MetadataFilterLabelMatchResponse> filterLabels;

    public List<MetadataFilterLabelMatchResponse> getFilterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
     */
    @InputImport(name="filterMatchCriteria", required=true)
      private final String filterMatchCriteria;

    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public MetadataFilterResponse(
        List<MetadataFilterLabelMatchResponse> filterLabels,
        String filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels, "expected parameter 'filterLabels' to be non-null");
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
    }

    private MetadataFilterResponse() {
        this.filterLabels = List.of();
        this.filterMatchCriteria = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetadataFilterLabelMatchResponse> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder setFilterLabels(List<MetadataFilterLabelMatchResponse> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder setFilterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public MetadataFilterResponse build() {
            return new MetadataFilterResponse(filterLabels, filterMatchCriteria);
        }
    }
}
