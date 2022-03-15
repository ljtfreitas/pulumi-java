// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The rating of a Product.
 * 
 */
public final class GoogleCloudRetailV2betaRatingArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaRatingArgs Empty = new GoogleCloudRetailV2betaRatingArgs();

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="averageRating")
      private final @Nullable Output<Double> averageRating;

    public Output<Double> getAverageRating() {
        return this.averageRating == null ? Output.empty() : this.averageRating;
    }

    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="ratingCount")
      private final @Nullable Output<Integer> ratingCount;

    public Output<Integer> getRatingCount() {
        return this.ratingCount == null ? Output.empty() : this.ratingCount;
    }

    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    @Import(name="ratingHistogram")
      private final @Nullable Output<List<Integer>> ratingHistogram;

    public Output<List<Integer>> getRatingHistogram() {
        return this.ratingHistogram == null ? Output.empty() : this.ratingHistogram;
    }

    public GoogleCloudRetailV2betaRatingArgs(
        @Nullable Output<Double> averageRating,
        @Nullable Output<Integer> ratingCount,
        @Nullable Output<List<Integer>> ratingHistogram) {
        this.averageRating = averageRating;
        this.ratingCount = ratingCount;
        this.ratingHistogram = ratingHistogram;
    }

    private GoogleCloudRetailV2betaRatingArgs() {
        this.averageRating = Output.empty();
        this.ratingCount = Output.empty();
        this.ratingHistogram = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRatingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> averageRating;
        private @Nullable Output<Integer> ratingCount;
        private @Nullable Output<List<Integer>> ratingHistogram;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRatingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageRating = defaults.averageRating;
    	      this.ratingCount = defaults.ratingCount;
    	      this.ratingHistogram = defaults.ratingHistogram;
        }

        public Builder averageRating(@Nullable Output<Double> averageRating) {
            this.averageRating = averageRating;
            return this;
        }

        public Builder averageRating(@Nullable Double averageRating) {
            this.averageRating = Output.ofNullable(averageRating);
            return this;
        }

        public Builder ratingCount(@Nullable Output<Integer> ratingCount) {
            this.ratingCount = ratingCount;
            return this;
        }

        public Builder ratingCount(@Nullable Integer ratingCount) {
            this.ratingCount = Output.ofNullable(ratingCount);
            return this;
        }

        public Builder ratingHistogram(@Nullable Output<List<Integer>> ratingHistogram) {
            this.ratingHistogram = ratingHistogram;
            return this;
        }

        public Builder ratingHistogram(@Nullable List<Integer> ratingHistogram) {
            this.ratingHistogram = Output.ofNullable(ratingHistogram);
            return this;
        }
        public GoogleCloudRetailV2betaRatingArgs build() {
            return new GoogleCloudRetailV2betaRatingArgs(averageRating, ratingCount, ratingHistogram);
        }
    }
}
