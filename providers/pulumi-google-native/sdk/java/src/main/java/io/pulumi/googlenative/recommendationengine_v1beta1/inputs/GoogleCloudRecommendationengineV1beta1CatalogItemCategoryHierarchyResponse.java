// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Category represents catalog item category hierarchy.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse Empty = new GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse();

    /**
     * Catalog item categories. Each category should be a UTF-8 encoded string with a length limit of 2 KiB. Note that the order in the list denotes the specificity (from least to most specific).
     * 
     */
    @InputImport(name="categories", required=true)
      private final List<String> categories;

    public List<String> getCategories() {
        return this.categories;
    }

    public GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse(List<String> categories) {
        this.categories = Objects.requireNonNull(categories, "expected parameter 'categories' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse() {
        this.categories = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categories;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
        }

        public Builder setCategories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse build() {
            return new GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyResponse(categories);
        }
    }
}
