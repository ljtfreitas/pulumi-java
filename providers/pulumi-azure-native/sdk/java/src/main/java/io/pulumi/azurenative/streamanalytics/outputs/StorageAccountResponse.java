// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageAccountResponse {
    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountKey;
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String accountName;

    @CustomType.Constructor
    private StorageAccountResponse(
        @CustomType.Parameter("accountKey") @Nullable String accountKey,
        @CustomType.Parameter("accountName") @Nullable String accountName) {
        this.accountKey = accountKey;
        this.accountName = accountName;
    }

    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getAccountName() {
        return Optional.ofNullable(this.accountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private @Nullable String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
        }

        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public StorageAccountResponse build() {
            return new StorageAccountResponse(accountKey, accountName);
        }
    }
}
