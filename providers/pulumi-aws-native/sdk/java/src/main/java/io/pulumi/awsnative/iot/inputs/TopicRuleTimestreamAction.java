// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleTimestreamDimension;
import io.pulumi.awsnative.iot.inputs.TopicRuleTimestreamTimestamp;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleTimestreamAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleTimestreamAction Empty = new TopicRuleTimestreamAction();

    @Import(name="batchMode")
      private final @Nullable Boolean batchMode;

    public Optional<Boolean> getBatchMode() {
        return this.batchMode == null ? Optional.empty() : Optional.ofNullable(this.batchMode);
    }

    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    @Import(name="dimensions", required=true)
      private final List<TopicRuleTimestreamDimension> dimensions;

    public List<TopicRuleTimestreamDimension> getDimensions() {
        return this.dimensions;
    }

    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @Import(name="tableName", required=true)
      private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    @Import(name="timestamp")
      private final @Nullable TopicRuleTimestreamTimestamp timestamp;

    public Optional<TopicRuleTimestreamTimestamp> getTimestamp() {
        return this.timestamp == null ? Optional.empty() : Optional.ofNullable(this.timestamp);
    }

    public TopicRuleTimestreamAction(
        @Nullable Boolean batchMode,
        String databaseName,
        List<TopicRuleTimestreamDimension> dimensions,
        String roleArn,
        String tableName,
        @Nullable TopicRuleTimestreamTimestamp timestamp) {
        this.batchMode = batchMode;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.timestamp = timestamp;
    }

    private TopicRuleTimestreamAction() {
        this.batchMode = null;
        this.databaseName = null;
        this.dimensions = List.of();
        this.roleArn = null;
        this.tableName = null;
        this.timestamp = null;
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
