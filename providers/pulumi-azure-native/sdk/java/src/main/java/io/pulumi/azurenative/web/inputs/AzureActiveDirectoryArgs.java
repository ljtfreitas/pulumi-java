// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AzureActiveDirectoryLoginArgs;
import io.pulumi.azurenative.web.inputs.AzureActiveDirectoryRegistrationArgs;
import io.pulumi.azurenative.web.inputs.AzureActiveDirectoryValidationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Azure Active directory provider.
 * 
 */
public final class AzureActiveDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureActiveDirectoryArgs Empty = new AzureActiveDirectoryArgs();

    /**
     * <code>false</code> if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    @Import(name="isAutoProvisioned")
      private final @Nullable Output<Boolean> isAutoProvisioned;

    public Output<Boolean> getIsAutoProvisioned() {
        return this.isAutoProvisioned == null ? Output.empty() : this.isAutoProvisioned;
    }

    /**
     * The configuration settings of the Azure Active Directory login flow.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<AzureActiveDirectoryLoginArgs> login;

    public Output<AzureActiveDirectoryLoginArgs> getLogin() {
        return this.login == null ? Output.empty() : this.login;
    }

    /**
     * The configuration settings of the Azure Active Directory app registration.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<AzureActiveDirectoryRegistrationArgs> registration;

    public Output<AzureActiveDirectoryRegistrationArgs> getRegistration() {
        return this.registration == null ? Output.empty() : this.registration;
    }

    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<AzureActiveDirectoryValidationArgs> validation;

    public Output<AzureActiveDirectoryValidationArgs> getValidation() {
        return this.validation == null ? Output.empty() : this.validation;
    }

    public AzureActiveDirectoryArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Boolean> isAutoProvisioned,
        @Nullable Output<AzureActiveDirectoryLoginArgs> login,
        @Nullable Output<AzureActiveDirectoryRegistrationArgs> registration,
        @Nullable Output<AzureActiveDirectoryValidationArgs> validation) {
        this.enabled = enabled;
        this.isAutoProvisioned = isAutoProvisioned;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    private AzureActiveDirectoryArgs() {
        this.enabled = Output.empty();
        this.isAutoProvisioned = Output.empty();
        this.login = Output.empty();
        this.registration = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Boolean> isAutoProvisioned;
        private @Nullable Output<AzureActiveDirectoryLoginArgs> login;
        private @Nullable Output<AzureActiveDirectoryRegistrationArgs> registration;
        private @Nullable Output<AzureActiveDirectoryValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.isAutoProvisioned = defaults.isAutoProvisioned;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder isAutoProvisioned(@Nullable Output<Boolean> isAutoProvisioned) {
            this.isAutoProvisioned = isAutoProvisioned;
            return this;
        }

        public Builder isAutoProvisioned(@Nullable Boolean isAutoProvisioned) {
            this.isAutoProvisioned = Output.ofNullable(isAutoProvisioned);
            return this;
        }

        public Builder login(@Nullable Output<AzureActiveDirectoryLoginArgs> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable AzureActiveDirectoryLoginArgs login) {
            this.login = Output.ofNullable(login);
            return this;
        }

        public Builder registration(@Nullable Output<AzureActiveDirectoryRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder registration(@Nullable AzureActiveDirectoryRegistrationArgs registration) {
            this.registration = Output.ofNullable(registration);
            return this;
        }

        public Builder validation(@Nullable Output<AzureActiveDirectoryValidationArgs> validation) {
            this.validation = validation;
            return this;
        }

        public Builder validation(@Nullable AzureActiveDirectoryValidationArgs validation) {
            this.validation = Output.ofNullable(validation);
            return this;
        }
        public AzureActiveDirectoryArgs build() {
            return new AzureActiveDirectoryArgs(enabled, isAutoProvisioned, login, registration, validation);
        }
    }
}
