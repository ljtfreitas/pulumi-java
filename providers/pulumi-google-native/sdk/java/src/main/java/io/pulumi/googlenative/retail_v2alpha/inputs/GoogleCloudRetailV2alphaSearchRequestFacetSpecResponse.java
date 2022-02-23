// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A facet specification to perform faceted search.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse Empty = new GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse();

    /**
     * Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it's not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * "rating", enable_dynamic_position = true * "price", enable_dynamic_position = false * "brands", enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet 'gender'. Then the final order of the facets in the response can be ("price", "brands", "rating", "gender") or ("price", "brands", "gender", "rating") depends on how Google Retail Search orders "gender" and "rating" facets. However, notice that "price" and "brands" will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
     */
    @InputImport(name="enableDynamicPosition", required=true)
      private final Boolean enableDynamicPosition;

    public Boolean getEnableDynamicPosition() {
        return this.enableDynamicPosition;
    }

    /**
     * List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. For example, suppose there are 100 products with color facet "Red" and 200 products with color facet "Blue". A query containing the filter "colorFamilies:ANY("Red")" and have "colorFamilies" as FacetKey.key will by default return the "Red" with count 100. If this field contains "colorFamilies", then the query returns both the "Red" with count 100 and "Blue" with count 200, because the "colorFamilies" key is now excluded from the filter. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="excludedFilterKeys", required=true)
      private final List<String> excludedFilterKeys;

    public List<String> getExcludedFilterKeys() {
        return this.excludedFilterKeys;
    }

    /**
     * The facet key specification.
     * 
     */
    @InputImport(name="facetKey", required=true)
      private final GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse facetKey;

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse getFacetKey() {
        return this.facetKey;
    }

    /**
     * Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
     */
    @InputImport(name="limit", required=true)
      private final Integer limit;

    public Integer getLimit() {
        return this.limit;
    }

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse(
        Boolean enableDynamicPosition,
        List<String> excludedFilterKeys,
        GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse facetKey,
        Integer limit) {
        this.enableDynamicPosition = Objects.requireNonNull(enableDynamicPosition, "expected parameter 'enableDynamicPosition' to be non-null");
        this.excludedFilterKeys = Objects.requireNonNull(excludedFilterKeys, "expected parameter 'excludedFilterKeys' to be non-null");
        this.facetKey = Objects.requireNonNull(facetKey, "expected parameter 'facetKey' to be non-null");
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
    }

    private GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse() {
        this.enableDynamicPosition = null;
        this.excludedFilterKeys = List.of();
        this.facetKey = null;
        this.limit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableDynamicPosition;
        private List<String> excludedFilterKeys;
        private GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse facetKey;
        private Integer limit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicPosition = defaults.enableDynamicPosition;
    	      this.excludedFilterKeys = defaults.excludedFilterKeys;
    	      this.facetKey = defaults.facetKey;
    	      this.limit = defaults.limit;
        }

        public Builder setEnableDynamicPosition(Boolean enableDynamicPosition) {
            this.enableDynamicPosition = Objects.requireNonNull(enableDynamicPosition);
            return this;
        }

        public Builder setExcludedFilterKeys(List<String> excludedFilterKeys) {
            this.excludedFilterKeys = Objects.requireNonNull(excludedFilterKeys);
            return this;
        }

        public Builder setFacetKey(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyResponse facetKey) {
            this.facetKey = Objects.requireNonNull(facetKey);
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse(enableDynamicPosition, excludedFilterKeys, facetKey, limit);
        }
    }
}
