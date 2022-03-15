// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRuleTimestreamDimension;
import io.pulumi.awsnative.iot.outputs.TopicRuleTimestreamTimestamp;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleTimestreamAction {
    private final @Nullable Boolean batchMode;
    private final String databaseName;
    private final List<TopicRuleTimestreamDimension> dimensions;
    private final String roleArn;
    private final String tableName;
    private final @Nullable TopicRuleTimestreamTimestamp timestamp;

    @CustomType.Constructor
    private TopicRuleTimestreamAction(
        @CustomType.Parameter("batchMode") @Nullable Boolean batchMode,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("dimensions") List<TopicRuleTimestreamDimension> dimensions,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("timestamp") @Nullable TopicRuleTimestreamTimestamp timestamp) {
        this.batchMode = batchMode;
        this.databaseName = databaseName;
        this.dimensions = dimensions;
        this.roleArn = roleArn;
        this.tableName = tableName;
        this.timestamp = timestamp;
    }

    public Optional<Boolean> getBatchMode() {
        return Optional.ofNullable(this.batchMode);
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public List<TopicRuleTimestreamDimension> getDimensions() {
        return this.dimensions;
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getTableName() {
        return this.tableName;
    }
    public Optional<TopicRuleTimestreamTimestamp> getTimestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestreamAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean batchMode;
        private String databaseName;
        private List<TopicRuleTimestreamDimension> dimensions;
        private String roleArn;
        private String tableName;
        private @Nullable TopicRuleTimestreamTimestamp timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleTimestreamAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMode = defaults.batchMode;
    	      this.databaseName = defaults.databaseName;
    	      this.dimensions = defaults.dimensions;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder batchMode(@Nullable Boolean batchMode) {
            this.batchMode = batchMode;
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder dimensions(List<TopicRuleTimestreamDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder timestamp(@Nullable TopicRuleTimestreamTimestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public TopicRuleTimestreamAction build() {
            return new TopicRuleTimestreamAction(batchMode, databaseName, dimensions, roleArn, tableName, timestamp);
        }
    }
}
