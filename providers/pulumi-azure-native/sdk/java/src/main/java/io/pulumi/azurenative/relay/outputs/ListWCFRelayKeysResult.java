// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWCFRelayKeysResult {
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final @Nullable String keyName;
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
     */
    private final @Nullable String primaryConnectionString;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
     */
    private final @Nullable String secondaryConnectionString;
    /**
     * A base64-encoded 256-bit secondary key for signing and validating the SAS token.
     * 
     */
    private final @Nullable String secondaryKey;

    @CustomType.Constructor
    private ListWCFRelayKeysResult(
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("primaryConnectionString") @Nullable String primaryConnectionString,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("secondaryConnectionString") @Nullable String secondaryConnectionString,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey) {
        this.keyName = keyName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
    }

    /**
     * A string that describes the authorization rule.
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
    */
    public Optional<String> getPrimaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public Optional<String> getPrimaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
    */
    public Optional<String> getSecondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }
    /**
     * A base64-encoded 256-bit secondary key for signing and validating the SAS token.
     * 
    */
    public Optional<String> getSecondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWCFRelayKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String primaryConnectionString;
        private @Nullable String primaryKey;
        private @Nullable String secondaryConnectionString;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWCFRelayKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder primaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder secondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public ListWCFRelayKeysResult build() {
            return new ListWCFRelayKeysResult(keyName, primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
