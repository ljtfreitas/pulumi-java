// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.TwitterRegistrationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TwitterResponse {
    /**
     * <code>false</code> if the Twitter provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the app registration for the Twitter provider.
     * 
     */
    private final @Nullable TwitterRegistrationResponse registration;

    @OutputCustomType.Constructor({"enabled","registration"})
    private TwitterResponse(
        @Nullable Boolean enabled,
        @Nullable TwitterRegistrationResponse registration) {
        this.enabled = enabled;
        this.registration = registration;
    }

    /**
     * <code>false</code> if the Twitter provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the app registration for the Twitter provider.
     * 
     */
    public Optional<TwitterRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable TwitterRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(TwitterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRegistration(@Nullable TwitterRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        public TwitterResponse build() {
            return new TwitterResponse(enabled, registration);
        }
    }
}
