// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the Identity provider for MS AAD.
 * 
 */
public final class OpenShiftManagedClusterAADIdentityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterAADIdentityProviderArgs Empty = new OpenShiftManagedClusterAADIdentityProviderArgs();

    /**
     * The clientId password associated with the provider.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The groupId to be granted cluster admin role.
     * 
     */
    @Import(name="customerAdminGroupId")
      private final @Nullable Output<String> customerAdminGroupId;

    public Output<String> getCustomerAdminGroupId() {
        return this.customerAdminGroupId == null ? Output.empty() : this.customerAdminGroupId;
    }

    /**
     * The kind of the provider.
     * Expected value is 'AADIdentityProvider'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The secret password associated with the provider.
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<String> secret;

    public Output<String> getSecret() {
        return this.secret == null ? Output.empty() : this.secret;
    }

    /**
     * The tenantId associated with the provider.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    public OpenShiftManagedClusterAADIdentityProviderArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> customerAdminGroupId,
        Output<String> kind,
        @Nullable Output<String> secret,
        @Nullable Output<String> tenantId) {
        this.clientId = clientId;
        this.customerAdminGroupId = customerAdminGroupId;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.secret = secret;
        this.tenantId = tenantId;
    }

    private OpenShiftManagedClusterAADIdentityProviderArgs() {
        this.clientId = Output.empty();
        this.customerAdminGroupId = Output.empty();
        this.kind = Output.empty();
        this.secret = Output.empty();
        this.tenantId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAADIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> customerAdminGroupId;
        private Output<String> kind;
        private @Nullable Output<String> secret;
        private @Nullable Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAADIdentityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.customerAdminGroupId = defaults.customerAdminGroupId;
    	      this.kind = defaults.kind;
    	      this.secret = defaults.secret;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder customerAdminGroupId(@Nullable Output<String> customerAdminGroupId) {
            this.customerAdminGroupId = customerAdminGroupId;
            return this;
        }

        public Builder customerAdminGroupId(@Nullable String customerAdminGroupId) {
            this.customerAdminGroupId = Output.ofNullable(customerAdminGroupId);
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder secret(@Nullable Output<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder secret(@Nullable String secret) {
            this.secret = Output.ofNullable(secret);
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
        public OpenShiftManagedClusterAADIdentityProviderArgs build() {
            return new OpenShiftManagedClusterAADIdentityProviderArgs(clientId, customerAdminGroupId, kind, secret, tenantId);
        }
    }
}
