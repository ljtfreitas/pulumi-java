// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainEndpointOptions {
    /**
     * Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
     */
    private final @Nullable Boolean enforceHttps;
    /**
     * The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
     */
    private final @Nullable String tlsSecurityPolicy;

    @CustomType.Constructor
    private DomainEndpointOptions(
        @CustomType.Parameter("enforceHttps") @Nullable Boolean enforceHttps,
        @CustomType.Parameter("tlsSecurityPolicy") @Nullable String tlsSecurityPolicy) {
        this.enforceHttps = enforceHttps;
        this.tlsSecurityPolicy = tlsSecurityPolicy;
    }

    /**
     * Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
    */
    public Optional<Boolean> getEnforceHttps() {
        return Optional.ofNullable(this.enforceHttps);
    }
    /**
     * The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
    */
    public Optional<String> getTlsSecurityPolicy() {
        return Optional.ofNullable(this.tlsSecurityPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEndpointOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enforceHttps;
        private @Nullable String tlsSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEndpointOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceHttps = defaults.enforceHttps;
    	      this.tlsSecurityPolicy = defaults.tlsSecurityPolicy;
        }

        public Builder enforceHttps(@Nullable Boolean enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        public Builder tlsSecurityPolicy(@Nullable String tlsSecurityPolicy) {
            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }
        public DomainEndpointOptions build() {
            return new DomainEndpointOptions(enforceHttps, tlsSecurityPolicy);
        }
    }
}
