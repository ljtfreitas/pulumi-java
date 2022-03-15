// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class ServiceAuthenticationConfigurationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAuthenticationConfigurationInfoArgs Empty = new ServiceAuthenticationConfigurationInfoArgs();

    /**
     * The audience url for the service
     * 
     */
    @Import(name="audience")
      private final @Nullable Output<String> audience;

    public Output<String> getAudience() {
        return this.audience == null ? Output.empty() : this.audience;
    }

    /**
     * The authority url for the service
     * 
     */
    @Import(name="authority")
      private final @Nullable Output<String> authority;

    public Output<String> getAuthority() {
        return this.authority == null ? Output.empty() : this.authority;
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @Import(name="smartProxyEnabled")
      private final @Nullable Output<Boolean> smartProxyEnabled;

    public Output<Boolean> getSmartProxyEnabled() {
        return this.smartProxyEnabled == null ? Output.empty() : this.smartProxyEnabled;
    }

    public ServiceAuthenticationConfigurationInfoArgs(
        @Nullable Output<String> audience,
        @Nullable Output<String> authority,
        @Nullable Output<Boolean> smartProxyEnabled) {
        this.audience = audience;
        this.authority = authority;
        this.smartProxyEnabled = smartProxyEnabled;
    }

    private ServiceAuthenticationConfigurationInfoArgs() {
        this.audience = Output.empty();
        this.authority = Output.empty();
        this.smartProxyEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> audience;
        private @Nullable Output<String> authority;
        private @Nullable Output<Boolean> smartProxyEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthenticationConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.smartProxyEnabled = defaults.smartProxyEnabled;
        }

        public Builder audience(@Nullable Output<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Output.ofNullable(audience);
            return this;
        }

        public Builder authority(@Nullable Output<String> authority) {
            this.authority = authority;
            return this;
        }

        public Builder authority(@Nullable String authority) {
            this.authority = Output.ofNullable(authority);
            return this;
        }

        public Builder smartProxyEnabled(@Nullable Output<Boolean> smartProxyEnabled) {
            this.smartProxyEnabled = smartProxyEnabled;
            return this;
        }

        public Builder smartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            this.smartProxyEnabled = Output.ofNullable(smartProxyEnabled);
            return this;
        }
        public ServiceAuthenticationConfigurationInfoArgs build() {
            return new ServiceAuthenticationConfigurationInfoArgs(audience, authority, smartProxyEnabled);
        }
    }
}
