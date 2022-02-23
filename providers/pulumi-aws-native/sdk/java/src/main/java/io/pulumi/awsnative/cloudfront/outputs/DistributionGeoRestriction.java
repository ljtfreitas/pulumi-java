// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionGeoRestriction {
    private final @Nullable List<String> locations;
    private final String restrictionType;

    @OutputCustomType.Constructor({"locations","restrictionType"})
    private DistributionGeoRestriction(
        @Nullable List<String> locations,
        String restrictionType) {
        this.locations = locations;
        this.restrictionType = Objects.requireNonNull(restrictionType);
    }

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public String getRestrictionType() {
        return this.restrictionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionGeoRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private String restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionGeoRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setRestrictionType(String restrictionType) {
            this.restrictionType = Objects.requireNonNull(restrictionType);
            return this;
        }
        public DistributionGeoRestriction build() {
            return new DistributionGeoRestriction(locations, restrictionType);
        }
    }
}
