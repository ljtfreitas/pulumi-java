// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordGeolocationRoutingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordGeolocationRoutingPolicyArgs Empty = new RecordGeolocationRoutingPolicyArgs();

    /**
     * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
     * 
     */
    @Import(name="continent")
      private final @Nullable Output<String> continent;

    public Output<String> getContinent() {
        return this.continent == null ? Output.empty() : this.continent;
    }

    /**
     * A two-character country code or `*` to indicate a default resource record set.
     * 
     */
    @Import(name="country")
      private final @Nullable Output<String> country;

    public Output<String> getCountry() {
        return this.country == null ? Output.empty() : this.country;
    }

    /**
     * A subdivision code for a country.
     * 
     */
    @Import(name="subdivision")
      private final @Nullable Output<String> subdivision;

    public Output<String> getSubdivision() {
        return this.subdivision == null ? Output.empty() : this.subdivision;
    }

    public RecordGeolocationRoutingPolicyArgs(
        @Nullable Output<String> continent,
        @Nullable Output<String> country,
        @Nullable Output<String> subdivision) {
        this.continent = continent;
        this.country = country;
        this.subdivision = subdivision;
    }

    private RecordGeolocationRoutingPolicyArgs() {
        this.continent = Output.empty();
        this.country = Output.empty();
        this.subdivision = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordGeolocationRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> continent;
        private @Nullable Output<String> country;
        private @Nullable Output<String> subdivision;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordGeolocationRoutingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continent = defaults.continent;
    	      this.country = defaults.country;
    	      this.subdivision = defaults.subdivision;
        }

        public Builder continent(@Nullable Output<String> continent) {
            this.continent = continent;
            return this;
        }

        public Builder continent(@Nullable String continent) {
            this.continent = Output.ofNullable(continent);
            return this;
        }

        public Builder country(@Nullable Output<String> country) {
            this.country = country;
            return this;
        }

        public Builder country(@Nullable String country) {
            this.country = Output.ofNullable(country);
            return this;
        }

        public Builder subdivision(@Nullable Output<String> subdivision) {
            this.subdivision = subdivision;
            return this;
        }

        public Builder subdivision(@Nullable String subdivision) {
            this.subdivision = Output.ofNullable(subdivision);
            return this;
        }
        public RecordGeolocationRoutingPolicyArgs build() {
            return new RecordGeolocationRoutingPolicyArgs(continent, country, subdivision);
        }
    }
}
