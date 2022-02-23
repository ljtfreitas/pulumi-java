// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaIntervalResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse {
    /**
     * Only get facet values that contains the given strings. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual fields. Maximum is 10.
     * 
     */
    private final List<String> contains;
    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    private final List<GoogleCloudRetailV2betaIntervalResponse> intervals;
    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions" * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" * "inventory(place_id,original_price)" * "inventory(place_id,attributes.key)"
     * 
     */
    private final String key;
    /**
     * The order in which Facet.values are returned. Allowed values are: * "count desc", which means order by Facet.FacetValue.count descending. * "value desc", which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    private final String orderBy;
    /**
     * Only get facet values that start with the given string prefix. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women > Dress". Only supported on textual fields. Maximum is 10.
     * 
     */
    private final List<String> prefixes;
    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always "1" and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for "shipToStore", where FacetKey.key is "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and ship to store "123".
     * 
     */
    private final String query;
    /**
     * Only get facet for the given restricted values. For example, when using "pickupInStore" as key and set restricted values to ["store123", "store456"], only facets for "store123" and "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    private final List<String> restrictedValues;

    @OutputCustomType.Constructor({"contains","intervals","key","orderBy","prefixes","query","restrictedValues"})
    private GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse(
        List<String> contains,
        List<GoogleCloudRetailV2betaIntervalResponse> intervals,
        String key,
        String orderBy,
        List<String> prefixes,
        String query,
        List<String> restrictedValues) {
        this.contains = Objects.requireNonNull(contains);
        this.intervals = Objects.requireNonNull(intervals);
        this.key = Objects.requireNonNull(key);
        this.orderBy = Objects.requireNonNull(orderBy);
        this.prefixes = Objects.requireNonNull(prefixes);
        this.query = Objects.requireNonNull(query);
        this.restrictedValues = Objects.requireNonNull(restrictedValues);
    }

    /**
     * Only get facet values that contains the given strings. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual fields. Maximum is 10.
     * 
     */
    public List<String> getContains() {
        return this.contains;
    }
    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    public List<GoogleCloudRetailV2betaIntervalResponse> getIntervals() {
        return this.intervals;
    }
    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions" * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" * "inventory(place_id,original_price)" * "inventory(place_id,attributes.key)"
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The order in which Facet.values are returned. Allowed values are: * "count desc", which means order by Facet.FacetValue.count descending. * "value desc", which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    public String getOrderBy() {
        return this.orderBy;
    }
    /**
     * Only get facet values that start with the given string prefix. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women > Dress". Only supported on textual fields. Maximum is 10.
     * 
     */
    public List<String> getPrefixes() {
        return this.prefixes;
    }
    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always "1" and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for "shipToStore", where FacetKey.key is "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and ship to store "123".
     * 
     */
    public String getQuery() {
        return this.query;
    }
    /**
     * Only get facet for the given restricted values. For example, when using "pickupInStore" as key and set restricted values to ["store123", "store456"], only facets for "store123" and "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    public List<String> getRestrictedValues() {
        return this.restrictedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> contains;
        private List<GoogleCloudRetailV2betaIntervalResponse> intervals;
        private String key;
        private String orderBy;
        private List<String> prefixes;
        private String query;
        private List<String> restrictedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.intervals = defaults.intervals;
    	      this.key = defaults.key;
    	      this.orderBy = defaults.orderBy;
    	      this.prefixes = defaults.prefixes;
    	      this.query = defaults.query;
    	      this.restrictedValues = defaults.restrictedValues;
        }

        public Builder setContains(List<String> contains) {
            this.contains = Objects.requireNonNull(contains);
            return this;
        }

        public Builder setIntervals(List<GoogleCloudRetailV2betaIntervalResponse> intervals) {
            this.intervals = Objects.requireNonNull(intervals);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = Objects.requireNonNull(orderBy);
            return this;
        }

        public Builder setPrefixes(List<String> prefixes) {
            this.prefixes = Objects.requireNonNull(prefixes);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setRestrictedValues(List<String> restrictedValues) {
            this.restrictedValues = Objects.requireNonNull(restrictedValues);
            return this;
        }
        public GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse build() {
            return new GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyResponse(contains, intervals, key, orderBy, prefixes, query, restrictedValues);
        }
    }
}
