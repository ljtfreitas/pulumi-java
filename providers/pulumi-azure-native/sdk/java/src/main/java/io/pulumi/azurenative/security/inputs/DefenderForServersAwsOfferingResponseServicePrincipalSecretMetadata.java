// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata of Service Principal secret for autoprovisioning
 * 
 */
public final class DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata extends io.pulumi.resources.InvokeArgs {

    public static final DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata Empty = new DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata();

    /**
     * expiration date of service principal secret
     * 
     */
    @Import(name="expiryDate")
      private final @Nullable String expiryDate;

    public Optional<String> getExpiryDate() {
        return this.expiryDate == null ? Optional.empty() : Optional.ofNullable(this.expiryDate);
    }

    /**
     * name of secret resource in parameter store
     * 
     */
    @Import(name="parameterNameInStore")
      private final @Nullable String parameterNameInStore;

    public Optional<String> getParameterNameInStore() {
        return this.parameterNameInStore == null ? Optional.empty() : Optional.ofNullable(this.parameterNameInStore);
    }

    /**
     * region of parameter store where secret is kept
     * 
     */
    @Import(name="parameterStoreRegion")
      private final @Nullable String parameterStoreRegion;

    public Optional<String> getParameterStoreRegion() {
        return this.parameterStoreRegion == null ? Optional.empty() : Optional.ofNullable(this.parameterStoreRegion);
    }

    public DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata(
        @Nullable String expiryDate,
        @Nullable String parameterNameInStore,
        @Nullable String parameterStoreRegion) {
        this.expiryDate = expiryDate;
        this.parameterNameInStore = parameterNameInStore;
        this.parameterStoreRegion = parameterStoreRegion;
    }

    private DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata() {
        this.expiryDate = null;
        this.parameterNameInStore = null;
        this.parameterStoreRegion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expiryDate;
        private @Nullable String parameterNameInStore;
        private @Nullable String parameterStoreRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDate = defaults.expiryDate;
    	      this.parameterNameInStore = defaults.parameterNameInStore;
    	      this.parameterStoreRegion = defaults.parameterStoreRegion;
        }

        public Builder expiryDate(@Nullable String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder parameterNameInStore(@Nullable String parameterNameInStore) {
            this.parameterNameInStore = parameterNameInStore;
            return this;
        }

        public Builder parameterStoreRegion(@Nullable String parameterStoreRegion) {
            this.parameterStoreRegion = parameterStoreRegion;
            return this;
        }
        public DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata build() {
            return new DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata(expiryDate, parameterNameInStore, parameterStoreRegion);
        }
    }
}
