// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
 * 
 */
public final class RedisCommonPropertiesResponseRedisConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final RedisCommonPropertiesResponseRedisConfiguration Empty = new RedisCommonPropertiesResponseRedisConfiguration();

    /**
     * First storage account connection string
     * 
     */
    @Import(name="aofStorageConnectionString0")
      private final @Nullable String aofStorageConnectionString0;

    public Optional<String> getAofStorageConnectionString0() {
        return this.aofStorageConnectionString0 == null ? Optional.empty() : Optional.ofNullable(this.aofStorageConnectionString0);
    }

    /**
     * Second storage account connection string
     * 
     */
    @Import(name="aofStorageConnectionString1")
      private final @Nullable String aofStorageConnectionString1;

    public Optional<String> getAofStorageConnectionString1() {
        return this.aofStorageConnectionString1 == null ? Optional.empty() : Optional.ofNullable(this.aofStorageConnectionString1);
    }

    /**
     * The max clients config
     * 
     */
    @Import(name="maxclients", required=true)
      private final String maxclients;

    public String getMaxclients() {
        return this.maxclients;
    }

    /**
     * Value in megabytes reserved for fragmentation per shard
     * 
     */
    @Import(name="maxfragmentationmemoryReserved")
      private final @Nullable String maxfragmentationmemoryReserved;

    public Optional<String> getMaxfragmentationmemoryReserved() {
        return this.maxfragmentationmemoryReserved == null ? Optional.empty() : Optional.ofNullable(this.maxfragmentationmemoryReserved);
    }

    /**
     * Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    @Import(name="maxmemoryDelta")
      private final @Nullable String maxmemoryDelta;

    public Optional<String> getMaxmemoryDelta() {
        return this.maxmemoryDelta == null ? Optional.empty() : Optional.ofNullable(this.maxmemoryDelta);
    }

    /**
     * The eviction strategy used when your data won't fit within its memory limit.
     * 
     */
    @Import(name="maxmemoryPolicy")
      private final @Nullable String maxmemoryPolicy;

    public Optional<String> getMaxmemoryPolicy() {
        return this.maxmemoryPolicy == null ? Optional.empty() : Optional.ofNullable(this.maxmemoryPolicy);
    }

    /**
     * Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    @Import(name="maxmemoryReserved")
      private final @Nullable String maxmemoryReserved;

    public Optional<String> getMaxmemoryReserved() {
        return this.maxmemoryReserved == null ? Optional.empty() : Optional.ofNullable(this.maxmemoryReserved);
    }

    /**
     * Specifies whether the rdb backup is enabled
     * 
     */
    @Import(name="rdbBackupEnabled")
      private final @Nullable String rdbBackupEnabled;

    public Optional<String> getRdbBackupEnabled() {
        return this.rdbBackupEnabled == null ? Optional.empty() : Optional.ofNullable(this.rdbBackupEnabled);
    }

    /**
     * Specifies the frequency for creating rdb backup
     * 
     */
    @Import(name="rdbBackupFrequency")
      private final @Nullable String rdbBackupFrequency;

    public Optional<String> getRdbBackupFrequency() {
        return this.rdbBackupFrequency == null ? Optional.empty() : Optional.ofNullable(this.rdbBackupFrequency);
    }

    /**
     * Specifies the maximum number of snapshots for rdb backup
     * 
     */
    @Import(name="rdbBackupMaxSnapshotCount")
      private final @Nullable String rdbBackupMaxSnapshotCount;

    public Optional<String> getRdbBackupMaxSnapshotCount() {
        return this.rdbBackupMaxSnapshotCount == null ? Optional.empty() : Optional.ofNullable(this.rdbBackupMaxSnapshotCount);
    }

    /**
     * The storage account connection string for storing rdb file
     * 
     */
    @Import(name="rdbStorageConnectionString")
      private final @Nullable String rdbStorageConnectionString;

    public Optional<String> getRdbStorageConnectionString() {
        return this.rdbStorageConnectionString == null ? Optional.empty() : Optional.ofNullable(this.rdbStorageConnectionString);
    }

    public RedisCommonPropertiesResponseRedisConfiguration(
        @Nullable String aofStorageConnectionString0,
        @Nullable String aofStorageConnectionString1,
        String maxclients,
        @Nullable String maxfragmentationmemoryReserved,
        @Nullable String maxmemoryDelta,
        @Nullable String maxmemoryPolicy,
        @Nullable String maxmemoryReserved,
        @Nullable String rdbBackupEnabled,
        @Nullable String rdbBackupFrequency,
        @Nullable String rdbBackupMaxSnapshotCount,
        @Nullable String rdbStorageConnectionString) {
        this.aofStorageConnectionString0 = aofStorageConnectionString0;
        this.aofStorageConnectionString1 = aofStorageConnectionString1;
        this.maxclients = Objects.requireNonNull(maxclients, "expected parameter 'maxclients' to be non-null");
        this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
        this.maxmemoryDelta = maxmemoryDelta;
        this.maxmemoryPolicy = maxmemoryPolicy;
        this.maxmemoryReserved = maxmemoryReserved;
        this.rdbBackupEnabled = rdbBackupEnabled;
        this.rdbBackupFrequency = rdbBackupFrequency;
        this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
        this.rdbStorageConnectionString = rdbStorageConnectionString;
    }

    private RedisCommonPropertiesResponseRedisConfiguration() {
        this.aofStorageConnectionString0 = null;
        this.aofStorageConnectionString1 = null;
        this.maxclients = null;
        this.maxfragmentationmemoryReserved = null;
        this.maxmemoryDelta = null;
        this.maxmemoryPolicy = null;
        this.maxmemoryReserved = null;
        this.rdbBackupEnabled = null;
        this.rdbBackupFrequency = null;
        this.rdbBackupMaxSnapshotCount = null;
        this.rdbStorageConnectionString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aofStorageConnectionString0;
        private @Nullable String aofStorageConnectionString1;
        private String maxclients;
        private @Nullable String maxfragmentationmemoryReserved;
        private @Nullable String maxmemoryDelta;
        private @Nullable String maxmemoryPolicy;
        private @Nullable String maxmemoryReserved;
        private @Nullable String rdbBackupEnabled;
        private @Nullable String rdbBackupFrequency;
        private @Nullable String rdbBackupMaxSnapshotCount;
        private @Nullable String rdbStorageConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aofStorageConnectionString0 = defaults.aofStorageConnectionString0;
    	      this.aofStorageConnectionString1 = defaults.aofStorageConnectionString1;
    	      this.maxclients = defaults.maxclients;
    	      this.maxfragmentationmemoryReserved = defaults.maxfragmentationmemoryReserved;
    	      this.maxmemoryDelta = defaults.maxmemoryDelta;
    	      this.maxmemoryPolicy = defaults.maxmemoryPolicy;
    	      this.maxmemoryReserved = defaults.maxmemoryReserved;
    	      this.rdbBackupEnabled = defaults.rdbBackupEnabled;
    	      this.rdbBackupFrequency = defaults.rdbBackupFrequency;
    	      this.rdbBackupMaxSnapshotCount = defaults.rdbBackupMaxSnapshotCount;
    	      this.rdbStorageConnectionString = defaults.rdbStorageConnectionString;
        }

        public Builder aofStorageConnectionString0(@Nullable String aofStorageConnectionString0) {
            this.aofStorageConnectionString0 = aofStorageConnectionString0;
            return this;
        }

        public Builder aofStorageConnectionString1(@Nullable String aofStorageConnectionString1) {
            this.aofStorageConnectionString1 = aofStorageConnectionString1;
            return this;
        }

        public Builder maxclients(String maxclients) {
            this.maxclients = Objects.requireNonNull(maxclients);
            return this;
        }

        public Builder maxfragmentationmemoryReserved(@Nullable String maxfragmentationmemoryReserved) {
            this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
            return this;
        }

        public Builder maxmemoryDelta(@Nullable String maxmemoryDelta) {
            this.maxmemoryDelta = maxmemoryDelta;
            return this;
        }

        public Builder maxmemoryPolicy(@Nullable String maxmemoryPolicy) {
            this.maxmemoryPolicy = maxmemoryPolicy;
            return this;
        }

        public Builder maxmemoryReserved(@Nullable String maxmemoryReserved) {
            this.maxmemoryReserved = maxmemoryReserved;
            return this;
        }

        public Builder rdbBackupEnabled(@Nullable String rdbBackupEnabled) {
            this.rdbBackupEnabled = rdbBackupEnabled;
            return this;
        }

        public Builder rdbBackupFrequency(@Nullable String rdbBackupFrequency) {
            this.rdbBackupFrequency = rdbBackupFrequency;
            return this;
        }

        public Builder rdbBackupMaxSnapshotCount(@Nullable String rdbBackupMaxSnapshotCount) {
            this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
            return this;
        }

        public Builder rdbStorageConnectionString(@Nullable String rdbStorageConnectionString) {
            this.rdbStorageConnectionString = rdbStorageConnectionString;
            return this;
        }
        public RedisCommonPropertiesResponseRedisConfiguration build() {
            return new RedisCommonPropertiesResponseRedisConfiguration(aofStorageConnectionString0, aofStorageConnectionString1, maxclients, maxfragmentationmemoryReserved, maxmemoryDelta, maxmemoryPolicy, maxmemoryReserved, rdbBackupEnabled, rdbBackupFrequency, rdbBackupMaxSnapshotCount, rdbStorageConnectionString);
        }
    }
}
