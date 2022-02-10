// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdditionalCapabilitiesResponse {
    private final @Nullable Boolean ultraSSDEnabled;

    @OutputCustomType.Constructor({"ultraSSDEnabled"})
    private AdditionalCapabilitiesResponse(@Nullable Boolean ultraSSDEnabled) {
        this.ultraSSDEnabled = ultraSSDEnabled;
    }

    public Optional<Boolean> getUltraSSDEnabled() {
        return Optional.ofNullable(this.ultraSSDEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalCapabilitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ultraSSDEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalCapabilitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ultraSSDEnabled = defaults.ultraSSDEnabled;
        }

        public Builder setUltraSSDEnabled(@Nullable Boolean ultraSSDEnabled) {
            this.ultraSSDEnabled = ultraSSDEnabled;
            return this;
        }

        public AdditionalCapabilitiesResponse build() {
            return new AdditionalCapabilitiesResponse(ultraSSDEnabled);
        }
    }
}