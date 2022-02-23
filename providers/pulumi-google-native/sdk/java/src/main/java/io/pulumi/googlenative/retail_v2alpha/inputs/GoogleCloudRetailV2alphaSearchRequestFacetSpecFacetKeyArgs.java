// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaIntervalArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how a facet is computed.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs Empty = new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs();

    /**
     * Only get facet values that contains the given strings. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "contains" to "Shoe", the "categories" facet will give only "Women > Shoe" and "Men > Shoe". Only supported on textual fields. Maximum is 10.
     * 
     */
    @InputImport(name="contains")
      private final @Nullable Input<List<String>> contains;

    public Input<List<String>> getContains() {
        return this.contains == null ? Input.empty() : this.contains;
    }

    /**
     * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
     * 
     */
    @InputImport(name="intervals")
      private final @Nullable Input<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;

    public Input<List<GoogleCloudRetailV2alphaIntervalArgs>> getIntervals() {
        return this.intervals == null ? Input.empty() : this.intervals;
    }

    /**
     * Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions" * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" * "inventory(place_id,original_price)" * "inventory(place_id,attributes.key)"
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The order in which Facet.values are returned. Allowed values are: * "count desc", which means order by Facet.FacetValue.count descending. * "value desc", which means order by Facet.FacetValue.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
     * 
     */
    @InputImport(name="orderBy")
      private final @Nullable Input<String> orderBy;

    public Input<String> getOrderBy() {
        return this.orderBy == null ? Input.empty() : this.orderBy;
    }

    /**
     * Only get facet values that start with the given string prefix. For example, suppose "categories" has three values "Women > Shoe", "Women > Dress" and "Men > Shoe". If set "prefixes" to "Women", the "categories" facet will give only "Women > Shoe" and "Women > Dress". Only supported on textual fields. Maximum is 10.
     * 
     */
    @InputImport(name="prefixes")
      private final @Nullable Input<List<String>> prefixes;

    public Input<List<String>> getPrefixes() {
        return this.prefixes == null ? Input.empty() : this.prefixes;
    }

    /**
     * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, FacetValue.value will be always "1" and FacetValue.count will be the number of results that matches the query. For example, you can set a customized facet for "shipToStore", where FacetKey.key is "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and ship to store "123".
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * Only get facet for the given restricted values. For example, when using "pickupInStore" as key and set restricted values to ["store123", "store456"], only facets for "store123" and "store456" are returned. Only supported on textual fields and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
     * 
     */
    @InputImport(name="restrictedValues")
      private final @Nullable Input<List<String>> restrictedValues;

    public Input<List<String>> getRestrictedValues() {
        return this.restrictedValues == null ? Input.empty() : this.restrictedValues;
    }

    public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(
        @Nullable Input<List<String>> contains,
        @Nullable Input<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals,
        Input<String> key,
        @Nullable Input<String> orderBy,
        @Nullable Input<List<String>> prefixes,
        @Nullable Input<String> query,
        @Nullable Input<List<String>> restrictedValues) {
        this.contains = contains;
        this.intervals = intervals;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.orderBy = orderBy;
        this.prefixes = prefixes;
        this.query = query;
        this.restrictedValues = restrictedValues;
    }

    private GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs() {
        this.contains = Input.empty();
        this.intervals = Input.empty();
        this.key = Input.empty();
        this.orderBy = Input.empty();
        this.prefixes = Input.empty();
        this.query = Input.empty();
        this.restrictedValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> contains;
        private @Nullable Input<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals;
        private Input<String> key;
        private @Nullable Input<String> orderBy;
        private @Nullable Input<List<String>> prefixes;
        private @Nullable Input<String> query;
        private @Nullable Input<List<String>> restrictedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contains = defaults.contains;
    	      this.intervals = defaults.intervals;
    	      this.key = defaults.key;
    	      this.orderBy = defaults.orderBy;
    	      this.prefixes = defaults.prefixes;
    	      this.query = defaults.query;
    	      this.restrictedValues = defaults.restrictedValues;
        }

        public Builder setContains(@Nullable Input<List<String>> contains) {
            this.contains = contains;
            return this;
        }

        public Builder setContains(@Nullable List<String> contains) {
            this.contains = Input.ofNullable(contains);
            return this;
        }

        public Builder setIntervals(@Nullable Input<List<GoogleCloudRetailV2alphaIntervalArgs>> intervals) {
            this.intervals = intervals;
            return this;
        }

        public Builder setIntervals(@Nullable List<GoogleCloudRetailV2alphaIntervalArgs> intervals) {
            this.intervals = Input.ofNullable(intervals);
            return this;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setOrderBy(@Nullable Input<String> orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setOrderBy(@Nullable String orderBy) {
            this.orderBy = Input.ofNullable(orderBy);
            return this;
        }

        public Builder setPrefixes(@Nullable Input<List<String>> prefixes) {
            this.prefixes = prefixes;
            return this;
        }

        public Builder setPrefixes(@Nullable List<String> prefixes) {
            this.prefixes = Input.ofNullable(prefixes);
            return this;
        }

        public Builder setQuery(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setRestrictedValues(@Nullable Input<List<String>> restrictedValues) {
            this.restrictedValues = restrictedValues;
            return this;
        }

        public Builder setRestrictedValues(@Nullable List<String> restrictedValues) {
            this.restrictedValues = Input.ofNullable(restrictedValues);
            return this;
        }
        public GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs build() {
            return new GoogleCloudRetailV2alphaSearchRequestFacetSpecFacetKeyArgs(contains, intervals, key, orderBy, prefixes, query, restrictedValues);
        }
    }
}
