// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Any additional Tenant IDs which should be used for authentication.
     * 
     */
    @Import(name="auxiliaryTenantIds", json=true)
      private final @Nullable Output<List<String>> auxiliaryTenantIds;

    public Output<List<String>> getAuxiliaryTenantIds() {
        return this.auxiliaryTenantIds == null ? Output.empty() : this.auxiliaryTenantIds;
    }

    /**
     * The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client Certificate
     * 
     */
    @Import(name="clientCertificatePassword")
      private final @Nullable Output<String> clientCertificatePassword;

    public Output<String> getClientCertificatePassword() {
        return this.clientCertificatePassword == null ? Output.empty() : this.clientCertificatePassword;
    }

    /**
     * The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service Principal using a Client Certificate.
     * 
     */
    @Import(name="clientCertificatePath")
      private final @Nullable Output<String> clientCertificatePath;

    public Output<String> getClientCertificatePath() {
        return this.clientCertificatePath == null ? Output.empty() : this.clientCertificatePath;
    }

    /**
     * The Client ID which should be used.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret == null ? Output.empty() : this.clientSecret;
    }

    /**
     * This will disable the Pulumi Partner ID which is used if a custom `partnerId` isn't specified.
     * 
     */
    @Import(name="disablePulumiPartnerId", json=true)
      private final @Nullable Output<Boolean> disablePulumiPartnerId;

    public Output<Boolean> getDisablePulumiPartnerId() {
        return this.disablePulumiPartnerId == null ? Output.empty() : this.disablePulumiPartnerId;
    }

    /**
     * The Cloud Environment which should be used. Possible values are public, usgovernment, german, and china. Defaults to public.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<String> environment;

    public Output<String> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected automatically.
     * 
     */
    @Import(name="msiEndpoint")
      private final @Nullable Output<String> msiEndpoint;

    public Output<String> getMsiEndpoint() {
        return this.msiEndpoint == null ? Output.empty() : this.msiEndpoint;
    }

    /**
     * A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
     * 
     */
    @Import(name="partnerId")
      private final @Nullable Output<String> partnerId;

    public Output<String> getPartnerId() {
        return this.partnerId == null ? Output.empty() : this.partnerId;
    }

    /**
     * The Subscription ID which should be used.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId == null ? Output.empty() : this.subscriptionId;
    }

    /**
     * The Tenant ID which should be used.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * Allowed Managed Service Identity be used for Authentication.
     * 
     */
    @Import(name="useMsi", json=true)
      private final @Nullable Output<Boolean> useMsi;

    public Output<Boolean> getUseMsi() {
        return this.useMsi == null ? Output.empty() : this.useMsi;
    }

    public ProviderArgs(
        @Nullable Output<List<String>> auxiliaryTenantIds,
        @Nullable Output<String> clientCertificatePassword,
        @Nullable Output<String> clientCertificatePath,
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret,
        @Nullable Output<Boolean> disablePulumiPartnerId,
        @Nullable Output<String> environment,
        @Nullable Output<String> msiEndpoint,
        @Nullable Output<String> partnerId,
        @Nullable Output<String> subscriptionId,
        @Nullable Output<String> tenantId,
        @Nullable Output<Boolean> useMsi) {
        this.auxiliaryTenantIds = auxiliaryTenantIds;
        this.clientCertificatePassword = clientCertificatePassword;
        this.clientCertificatePath = clientCertificatePath;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.disablePulumiPartnerId = disablePulumiPartnerId;
        this.environment = environment == null ? Output.ofNullable("public") : environment;
        this.msiEndpoint = msiEndpoint;
        this.partnerId = partnerId;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.useMsi = useMsi == null ? Output.ofNullable(false) : useMsi;
    }

    private ProviderArgs() {
        this.auxiliaryTenantIds = Output.empty();
        this.clientCertificatePassword = Output.empty();
        this.clientCertificatePath = Output.empty();
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
        this.disablePulumiPartnerId = Output.empty();
        this.environment = Output.empty();
        this.msiEndpoint = Output.empty();
        this.partnerId = Output.empty();
        this.subscriptionId = Output.empty();
        this.tenantId = Output.empty();
        this.useMsi = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> auxiliaryTenantIds;
        private @Nullable Output<String> clientCertificatePassword;
        private @Nullable Output<String> clientCertificatePath;
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;
        private @Nullable Output<Boolean> disablePulumiPartnerId;
        private @Nullable Output<String> environment;
        private @Nullable Output<String> msiEndpoint;
        private @Nullable Output<String> partnerId;
        private @Nullable Output<String> subscriptionId;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<Boolean> useMsi;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTenantIds = defaults.auxiliaryTenantIds;
    	      this.clientCertificatePassword = defaults.clientCertificatePassword;
    	      this.clientCertificatePath = defaults.clientCertificatePath;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.disablePulumiPartnerId = defaults.disablePulumiPartnerId;
    	      this.environment = defaults.environment;
    	      this.msiEndpoint = defaults.msiEndpoint;
    	      this.partnerId = defaults.partnerId;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.useMsi = defaults.useMsi;
        }

        public Builder auxiliaryTenantIds(@Nullable Output<List<String>> auxiliaryTenantIds) {
            this.auxiliaryTenantIds = auxiliaryTenantIds;
            return this;
        }

        public Builder auxiliaryTenantIds(@Nullable List<String> auxiliaryTenantIds) {
            this.auxiliaryTenantIds = Output.ofNullable(auxiliaryTenantIds);
            return this;
        }

        public Builder clientCertificatePassword(@Nullable Output<String> clientCertificatePassword) {
            this.clientCertificatePassword = Output.ofNullable(clientCertificatePassword).asSecret();
            return this;
        }

        public Builder clientCertificatePassword(@Nullable String clientCertificatePassword) {
            this.clientCertificatePassword = Output.ofNullable(clientCertificatePassword).asSecret();
            return this;
        }

        public Builder clientCertificatePath(@Nullable Output<String> clientCertificatePath) {
            this.clientCertificatePath = clientCertificatePath;
            return this;
        }

        public Builder clientCertificatePath(@Nullable String clientCertificatePath) {
            this.clientCertificatePath = Output.ofNullable(clientCertificatePath);
            return this;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = Output.ofNullable(clientId).asSecret();
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId).asSecret();
            return this;
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret).asSecret();
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret).asSecret();
            return this;
        }

        public Builder disablePulumiPartnerId(@Nullable Output<Boolean> disablePulumiPartnerId) {
            this.disablePulumiPartnerId = disablePulumiPartnerId;
            return this;
        }

        public Builder disablePulumiPartnerId(@Nullable Boolean disablePulumiPartnerId) {
            this.disablePulumiPartnerId = Output.ofNullable(disablePulumiPartnerId);
            return this;
        }

        public Builder environment(@Nullable Output<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable String environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }

        public Builder msiEndpoint(@Nullable Output<String> msiEndpoint) {
            this.msiEndpoint = msiEndpoint;
            return this;
        }

        public Builder msiEndpoint(@Nullable String msiEndpoint) {
            this.msiEndpoint = Output.ofNullable(msiEndpoint);
            return this;
        }

        public Builder partnerId(@Nullable Output<String> partnerId) {
            this.partnerId = partnerId;
            return this;
        }

        public Builder partnerId(@Nullable String partnerId) {
            this.partnerId = Output.ofNullable(partnerId);
            return this;
        }

        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Output.ofNullable(subscriptionId);
            return this;
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }

        public Builder useMsi(@Nullable Output<Boolean> useMsi) {
            this.useMsi = useMsi;
            return this;
        }

        public Builder useMsi(@Nullable Boolean useMsi) {
            this.useMsi = Output.ofNullable(useMsi);
            return this;
        }
        public ProviderArgs build() {
            return new ProviderArgs(auxiliaryTenantIds, clientCertificatePassword, clientCertificatePath, clientId, clientSecret, disablePulumiPartnerId, environment, msiEndpoint, partnerId, subscriptionId, tenantId, useMsi);
        }
    }
}
