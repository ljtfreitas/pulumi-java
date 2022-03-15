// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FhirServiceAuthenticationConfigurationResponse {
    /**
     * The audience url for the service
     * 
     */
    private final @Nullable String audience;
    /**
     * The authority url for the service
     * 
     */
    private final @Nullable String authority;
    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    private final @Nullable Boolean smartProxyEnabled;

    @CustomType.Constructor
    private FhirServiceAuthenticationConfigurationResponse(
        @CustomType.Parameter("audience") @Nullable String audience,
        @CustomType.Parameter("authority") @Nullable String authority,
        @CustomType.Parameter("smartProxyEnabled") @Nullable Boolean smartProxyEnabled) {
        this.audience = audience;
        this.authority = authority;
        this.smartProxyEnabled = smartProxyEnabled;
    }

    /**
     * The audience url for the service
     * 
    */
    public Optional<String> getAudience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * The authority url for the service
     * 
    */
    public Optional<String> getAuthority() {
        return Optional.ofNullable(this.authority);
    }
    /**
     * If the SMART on FHIR proxy is enabled
     * 
    */
    public Optional<Boolean> getSmartProxyEnabled() {
        return Optional.ofNullable(this.smartProxyEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAuthenticationConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable String authority;
        private @Nullable Boolean smartProxyEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAuthenticationConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }

        public Builder smartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }
        public FhirServiceAuthenticationConfigurationResponse build() {
            return new FhirServiceAuthenticationConfigurationResponse(audience, authority, smartProxyEnabled);
        }
    }
}
