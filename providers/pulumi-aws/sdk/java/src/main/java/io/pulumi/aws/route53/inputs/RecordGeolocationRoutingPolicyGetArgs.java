// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordGeolocationRoutingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordGeolocationRoutingPolicyGetArgs Empty = new RecordGeolocationRoutingPolicyGetArgs();

    /**
     * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
     * 
     */
    @InputImport(name="continent")
    private final @Nullable Input<String> continent;

    public Input<String> getContinent() {
        return this.continent == null ? Input.empty() : this.continent;
    }

    /**
     * A two-character country code or `*` to indicate a default resource record set.
     * 
     */
    @InputImport(name="country")
    private final @Nullable Input<String> country;

    public Input<String> getCountry() {
        return this.country == null ? Input.empty() : this.country;
    }

    /**
     * A subdivision code for a country.
     * 
     */
    @InputImport(name="subdivision")
    private final @Nullable Input<String> subdivision;

    public Input<String> getSubdivision() {
        return this.subdivision == null ? Input.empty() : this.subdivision;
    }

    public RecordGeolocationRoutingPolicyGetArgs(
        @Nullable Input<String> continent,
        @Nullable Input<String> country,
        @Nullable Input<String> subdivision) {
        this.continent = continent;
        this.country = country;
        this.subdivision = subdivision;
    }

    private RecordGeolocationRoutingPolicyGetArgs() {
        this.continent = Input.empty();
        this.country = Input.empty();
        this.subdivision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordGeolocationRoutingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> continent;
        private @Nullable Input<String> country;
        private @Nullable Input<String> subdivision;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordGeolocationRoutingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continent = defaults.continent;
    	      this.country = defaults.country;
    	      this.subdivision = defaults.subdivision;
        }

        public Builder setContinent(@Nullable Input<String> continent) {
            this.continent = continent;
            return this;
        }

        public Builder setContinent(@Nullable String continent) {
            this.continent = Input.ofNullable(continent);
            return this;
        }

        public Builder setCountry(@Nullable Input<String> country) {
            this.country = country;
            return this;
        }

        public Builder setCountry(@Nullable String country) {
            this.country = Input.ofNullable(country);
            return this;
        }

        public Builder setSubdivision(@Nullable Input<String> subdivision) {
            this.subdivision = subdivision;
            return this;
        }

        public Builder setSubdivision(@Nullable String subdivision) {
            this.subdivision = Input.ofNullable(subdivision);
            return this;
        }
        public RecordGeolocationRoutingPolicyGetArgs build() {
            return new RecordGeolocationRoutingPolicyGetArgs(continent, country, subdivision);
        }
    }
}