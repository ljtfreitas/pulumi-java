// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.aws.appsync.outputs.DataSourceDynamodbConfigDeltaSyncConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceDynamodbConfig {
    private final @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig;
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private final @Nullable String region;
    /**
     * Name of the DynamoDB table.
     * 
     */
    private final String tableName;
    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    private final @Nullable Boolean useCallerCredentials;
    private final @Nullable Boolean versioned;

    @OutputCustomType.Constructor({"deltaSyncConfig","region","tableName","useCallerCredentials","versioned"})
    private DataSourceDynamodbConfig(
        @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig,
        @Nullable String region,
        String tableName,
        @Nullable Boolean useCallerCredentials,
        @Nullable Boolean versioned) {
        this.deltaSyncConfig = deltaSyncConfig;
        this.region = region;
        this.tableName = Objects.requireNonNull(tableName);
        this.useCallerCredentials = useCallerCredentials;
        this.versioned = versioned;
    }

    public Optional<DataSourceDynamodbConfigDeltaSyncConfig> getDeltaSyncConfig() {
        return Optional.ofNullable(this.deltaSyncConfig);
    }
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * Name of the DynamoDB table.
     * 
     */
    public String getTableName() {
        return this.tableName;
    }
    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    public Optional<Boolean> getUseCallerCredentials() {
        return Optional.ofNullable(this.useCallerCredentials);
    }
    public Optional<Boolean> getVersioned() {
        return Optional.ofNullable(this.versioned);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig;
        private @Nullable String region;
        private String tableName;
        private @Nullable Boolean useCallerCredentials;
        private @Nullable Boolean versioned;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaSyncConfig = defaults.deltaSyncConfig;
    	      this.region = defaults.region;
    	      this.tableName = defaults.tableName;
    	      this.useCallerCredentials = defaults.useCallerCredentials;
    	      this.versioned = defaults.versioned;
        }

        public Builder setDeltaSyncConfig(@Nullable DataSourceDynamodbConfigDeltaSyncConfig deltaSyncConfig) {
            this.deltaSyncConfig = deltaSyncConfig;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setUseCallerCredentials(@Nullable Boolean useCallerCredentials) {
            this.useCallerCredentials = useCallerCredentials;
            return this;
        }

        public Builder setVersioned(@Nullable Boolean versioned) {
            this.versioned = versioned;
            return this;
        }
        public DataSourceDynamodbConfig build() {
            return new DataSourceDynamodbConfig(deltaSyncConfig, region, tableName, useCallerCredentials, versioned);
        }
    }
}
