// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountBlobPropertiesDeleteRetentionPolicy {
    /**
     * @return Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    private final @Nullable Integer days;

    @CustomType.Constructor
    private AccountBlobPropertiesDeleteRetentionPolicy(@CustomType.Parameter("days") @Nullable Integer days) {
        this.days = days;
    }

    /**
     * @return Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountBlobPropertiesDeleteRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountBlobPropertiesDeleteRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }        public AccountBlobPropertiesDeleteRetentionPolicy build() {
            return new AccountBlobPropertiesDeleteRetentionPolicy(days);
        }
    }
}
