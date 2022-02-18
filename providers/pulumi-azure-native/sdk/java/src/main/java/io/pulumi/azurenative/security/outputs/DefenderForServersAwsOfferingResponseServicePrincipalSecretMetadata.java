// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata {
    /**
     * expiration date of service principal secret
     * 
     */
    private final @Nullable String expiryDate;
    /**
     * name of secret resource in parameter store
     * 
     */
    private final @Nullable String parameterNameInStore;
    /**
     * region of parameter store where secret is kept
     * 
     */
    private final @Nullable String parameterStoreRegion;

    @OutputCustomType.Constructor({"expiryDate","parameterNameInStore","parameterStoreRegion"})
    private DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata(
        @Nullable String expiryDate,
        @Nullable String parameterNameInStore,
        @Nullable String parameterStoreRegion) {
        this.expiryDate = expiryDate;
        this.parameterNameInStore = parameterNameInStore;
        this.parameterStoreRegion = parameterStoreRegion;
    }

    /**
     * expiration date of service principal secret
     * 
     */
    public Optional<String> getExpiryDate() {
        return Optional.ofNullable(this.expiryDate);
    }
    /**
     * name of secret resource in parameter store
     * 
     */
    public Optional<String> getParameterNameInStore() {
        return Optional.ofNullable(this.parameterNameInStore);
    }
    /**
     * region of parameter store where secret is kept
     * 
     */
    public Optional<String> getParameterStoreRegion() {
        return Optional.ofNullable(this.parameterStoreRegion);
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

        public Builder setExpiryDate(@Nullable String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setParameterNameInStore(@Nullable String parameterNameInStore) {
            this.parameterNameInStore = parameterNameInStore;
            return this;
        }

        public Builder setParameterStoreRegion(@Nullable String parameterStoreRegion) {
            this.parameterStoreRegion = parameterStoreRegion;
            return this;
        }

        public DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata build() {
            return new DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata(expiryDate, parameterNameInStore, parameterStoreRegion);
        }
    }
}
