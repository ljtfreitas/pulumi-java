// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdditionalFeaturesServerConfigurationsResponse {
    /**
     * Enable or disable R services (SQL 2016 onwards).
     * 
     */
    private final @Nullable Boolean isRServicesEnabled;

    @OutputCustomType.Constructor({"isRServicesEnabled"})
    private AdditionalFeaturesServerConfigurationsResponse(@Nullable Boolean isRServicesEnabled) {
        this.isRServicesEnabled = isRServicesEnabled;
    }

    /**
     * Enable or disable R services (SQL 2016 onwards).
     * 
     */
    public Optional<Boolean> getIsRServicesEnabled() {
        return Optional.ofNullable(this.isRServicesEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalFeaturesServerConfigurationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isRServicesEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalFeaturesServerConfigurationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isRServicesEnabled = defaults.isRServicesEnabled;
        }

        public Builder setIsRServicesEnabled(@Nullable Boolean isRServicesEnabled) {
            this.isRServicesEnabled = isRServicesEnabled;
            return this;
        }

        public AdditionalFeaturesServerConfigurationsResponse build() {
            return new AdditionalFeaturesServerConfigurationsResponse(isRServicesEnabled);
        }
    }
}
