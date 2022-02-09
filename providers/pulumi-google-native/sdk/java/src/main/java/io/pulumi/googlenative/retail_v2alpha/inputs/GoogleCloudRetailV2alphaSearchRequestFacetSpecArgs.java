// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs Empty = new GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs();

    @InputImport(name="enableDynamicPosition")
    private final @Nullable Input<Boolean> enableDynamicPosition;

    public Input<Boolean> getEnableDynamicPosition() {
        return this.enableDynamicPosition == null ? Input.empty() : this.enableDynamicPosition;
    }

    @InputImport(name="excludedFilterKeys")
    private final @Nullable Input<List<String>> excludedFilterKeys;

    public Input<List<String>> getExcludedFilterKeys() {
        return this.excludedFilterKeys == null ? Input.empty() : this.excludedFilterKeys;
    }

    @InputImport(name="facetKey", required=true)
    private final Input<GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs> facetKey;

    public Input<GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs> getFacetKey() {
        return this.facetKey;
    }

    @InputImport(name="limit")
    private final @Nullable Input<Integer> limit;

    public Input<Integer> getLimit() {
        return this.limit == null ? Input.empty() : this.limit;
    }

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs(
        @Nullable Input<Boolean> enableDynamicPosition,
        @Nullable Input<List<String>> excludedFilterKeys,
        Input<GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs> facetKey,
        @Nullable Input<Integer> limit) {
        this.enableDynamicPosition = enableDynamicPosition;
        this.excludedFilterKeys = excludedFilterKeys;
        this.facetKey = Objects.requireNonNull(facetKey, "expected parameter 'facetKey' to be non-null");
        this.limit = limit;
    }

    private GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs() {
        this.enableDynamicPosition = Input.empty();
        this.excludedFilterKeys = Input.empty();
        this.facetKey = Input.empty();
        this.limit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDynamicPosition;
        private @Nullable Input<List<String>> excludedFilterKeys;
        private Input<GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs> facetKey;
        private @Nullable Input<Integer> limit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicPosition = defaults.enableDynamicPosition;
    	      this.excludedFilterKeys = defaults.excludedFilterKeys;
    	      this.facetKey = defaults.facetKey;
    	      this.limit = defaults.limit;
        }

        public Builder setEnableDynamicPosition(@Nullable Input<Boolean> enableDynamicPosition) {
            this.enableDynamicPosition = enableDynamicPosition;
            return this;
        }

        public Builder setEnableDynamicPosition(@Nullable Boolean enableDynamicPosition) {
            this.enableDynamicPosition = Input.ofNullable(enableDynamicPosition);
            return this;
        }

        public Builder setExcludedFilterKeys(@Nullable Input<List<String>> excludedFilterKeys) {
            this.excludedFilterKeys = excludedFilterKeys;
            return this;
        }

        public Builder setExcludedFilterKeys(@Nullable List<String> excludedFilterKeys) {
            this.excludedFilterKeys = Input.ofNullable(excludedFilterKeys);
            return this;
        }

        public Builder setFacetKey(Input<GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs> facetKey) {
            this.facetKey = Objects.requireNonNull(facetKey);
            return this;
        }

        public Builder setFacetKey(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs facetKey) {
            this.facetKey = Input.of(Objects.requireNonNull(facetKey));
            return this;
        }

        public Builder setLimit(@Nullable Input<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder setLimit(@Nullable Integer limit) {
            this.limit = Input.ofNullable(limit);
            return this;
        }

        public GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs(enableDynamicPosition, excludedFilterKeys, facetKey, limit);
        }
    }
}