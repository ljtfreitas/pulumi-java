// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.MetadataFilterFilterMatchCriteria;
import io.pulumi.googlenative.compute_beta.inputs.MetadataFilterLabelMatchArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Opaque filter criteria used by load balancers to restrict routing configuration to a limited set of load balancing proxies. Proxies and sidecars involved in load balancing would typically present metadata to the load balancers that need to match criteria specified here. If a match takes place, the relevant configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. An example for using metadataFilters would be: if load balancing involves Envoys, they receive routing configuration when values in metadataFilters match values supplied in of their XDS requests to loadbalancers.
 * 
 */
public final class MetadataFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataFilterArgs Empty = new MetadataFilterArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list must not be empty and can have at the most 64 entries.
     * 
     */
    @Import(name="filterLabels")
      private final @Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels;

    public Output<List<MetadataFilterLabelMatchArgs>> getFilterLabels() {
        return this.filterLabels == null ? Output.empty() : this.filterLabels;
    }

    /**
     * Specifies how individual filter label matches within the list of filterLabels and contributes toward the overall metadataFilter match. Supported values are: - MATCH_ANY: at least one of the filterLabels must have a matching label in the provided metadata. - MATCH_ALL: all filterLabels must have matching labels in the provided metadata.
     * 
     */
    @Import(name="filterMatchCriteria")
      private final @Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria;

    public Output<MetadataFilterFilterMatchCriteria> getFilterMatchCriteria() {
        return this.filterMatchCriteria == null ? Output.empty() : this.filterMatchCriteria;
    }

    public MetadataFilterArgs(
        @Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels,
        @Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria) {
        this.filterLabels = filterLabels;
        this.filterMatchCriteria = filterMatchCriteria;
    }

    private MetadataFilterArgs() {
        this.filterLabels = Output.empty();
        this.filterMatchCriteria = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels;
        private @Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(@Nullable Output<List<MetadataFilterLabelMatchArgs>> filterLabels) {
            this.filterLabels = filterLabels;
            return this;
        }

        public Builder filterLabels(@Nullable List<MetadataFilterLabelMatchArgs> filterLabels) {
            this.filterLabels = Output.ofNullable(filterLabels);
            return this;
        }

        public Builder filterMatchCriteria(@Nullable Output<MetadataFilterFilterMatchCriteria> filterMatchCriteria) {
            this.filterMatchCriteria = filterMatchCriteria;
            return this;
        }

        public Builder filterMatchCriteria(@Nullable MetadataFilterFilterMatchCriteria filterMatchCriteria) {
            this.filterMatchCriteria = Output.ofNullable(filterMatchCriteria);
            return this;
        }
        public MetadataFilterArgs build() {
            return new MetadataFilterArgs(filterLabels, filterMatchCriteria);
        }
    }
}
