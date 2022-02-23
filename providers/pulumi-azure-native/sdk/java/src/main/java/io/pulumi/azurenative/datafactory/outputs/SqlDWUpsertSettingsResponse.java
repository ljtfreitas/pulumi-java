// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlDWUpsertSettingsResponse {
    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object interimSchemaName;
    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    private final @Nullable Object keys;

    @OutputCustomType.Constructor({"interimSchemaName","keys"})
    private SqlDWUpsertSettingsResponse(
        @Nullable Object interimSchemaName,
        @Nullable Object keys) {
        this.interimSchemaName = interimSchemaName;
        this.keys = keys;
    }

    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getInterimSchemaName() {
        return Optional.ofNullable(this.interimSchemaName);
    }
    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    public Optional<Object> getKeys() {
        return Optional.ofNullable(this.keys);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWUpsertSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object interimSchemaName;
        private @Nullable Object keys;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWUpsertSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interimSchemaName = defaults.interimSchemaName;
    	      this.keys = defaults.keys;
        }

        public Builder setInterimSchemaName(@Nullable Object interimSchemaName) {
            this.interimSchemaName = interimSchemaName;
            return this;
        }

        public Builder setKeys(@Nullable Object keys) {
            this.keys = keys;
            return this;
        }
        public SqlDWUpsertSettingsResponse build() {
            return new SqlDWUpsertSettingsResponse(interimSchemaName, keys);
        }
    }
}
