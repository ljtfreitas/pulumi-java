// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAccountStorageAccount {
    /**
     * @return Specifies the ID of the Storage Account that will be associated with the Media Services instance.
     * 
     */
    private final String id;
    /**
     * @return Specifies whether the storage account should be the primary account or not. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean isPrimary;

    @CustomType.Constructor
    private ServiceAccountStorageAccount(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isPrimary") @Nullable Boolean isPrimary) {
        this.id = id;
        this.isPrimary = isPrimary;
    }

    /**
     * @return Specifies the ID of the Storage Account that will be associated with the Media Services instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies whether the storage account should be the primary account or not. Defaults to `false`.
     * 
     */
    public Optional<Boolean> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountStorageAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean isPrimary;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isPrimary = defaults.isPrimary;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isPrimary(@Nullable Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }        public ServiceAccountStorageAccount build() {
            return new ServiceAccountStorageAccount(id, isPrimary);
        }
    }
}
