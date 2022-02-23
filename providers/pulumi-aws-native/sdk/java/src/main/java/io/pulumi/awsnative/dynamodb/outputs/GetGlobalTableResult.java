// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableAttributeDefinition;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableGlobalSecondaryIndex;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableReplicaSpecification;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableSSESpecification;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableStreamSpecification;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableTimeToLiveSpecification;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableWriteProvisionedThroughputSettings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGlobalTableResult {
    private final @Nullable String arn;
    private final @Nullable List<GlobalTableAttributeDefinition> attributeDefinitions;
    private final @Nullable String billingMode;
    private final @Nullable List<GlobalTableGlobalSecondaryIndex> globalSecondaryIndexes;
    private final @Nullable List<GlobalTableReplicaSpecification> replicas;
    private final @Nullable GlobalTableSSESpecification sSESpecification;
    private final @Nullable String streamArn;
    private final @Nullable GlobalTableStreamSpecification streamSpecification;
    private final @Nullable String tableId;
    private final @Nullable GlobalTableTimeToLiveSpecification timeToLiveSpecification;
    private final @Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings;

    @OutputCustomType.Constructor({"arn","attributeDefinitions","billingMode","globalSecondaryIndexes","replicas","sSESpecification","streamArn","streamSpecification","tableId","timeToLiveSpecification","writeProvisionedThroughputSettings"})
    private GetGlobalTableResult(
        @Nullable String arn,
        @Nullable List<GlobalTableAttributeDefinition> attributeDefinitions,
        @Nullable String billingMode,
        @Nullable List<GlobalTableGlobalSecondaryIndex> globalSecondaryIndexes,
        @Nullable List<GlobalTableReplicaSpecification> replicas,
        @Nullable GlobalTableSSESpecification sSESpecification,
        @Nullable String streamArn,
        @Nullable GlobalTableStreamSpecification streamSpecification,
        @Nullable String tableId,
        @Nullable GlobalTableTimeToLiveSpecification timeToLiveSpecification,
        @Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings) {
        this.arn = arn;
        this.attributeDefinitions = attributeDefinitions;
        this.billingMode = billingMode;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.replicas = replicas;
        this.sSESpecification = sSESpecification;
        this.streamArn = streamArn;
        this.streamSpecification = streamSpecification;
        this.tableId = tableId;
        this.timeToLiveSpecification = timeToLiveSpecification;
        this.writeProvisionedThroughputSettings = writeProvisionedThroughputSettings;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<GlobalTableAttributeDefinition> getAttributeDefinitions() {
        return this.attributeDefinitions == null ? List.of() : this.attributeDefinitions;
    }
    public Optional<String> getBillingMode() {
        return Optional.ofNullable(this.billingMode);
    }
    public List<GlobalTableGlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? List.of() : this.globalSecondaryIndexes;
    }
    public List<GlobalTableReplicaSpecification> getReplicas() {
        return this.replicas == null ? List.of() : this.replicas;
    }
    public Optional<GlobalTableSSESpecification> getSSESpecification() {
        return Optional.ofNullable(this.sSESpecification);
    }
    public Optional<String> getStreamArn() {
        return Optional.ofNullable(this.streamArn);
    }
    public Optional<GlobalTableStreamSpecification> getStreamSpecification() {
        return Optional.ofNullable(this.streamSpecification);
    }
    public Optional<String> getTableId() {
        return Optional.ofNullable(this.tableId);
    }
    public Optional<GlobalTableTimeToLiveSpecification> getTimeToLiveSpecification() {
        return Optional.ofNullable(this.timeToLiveSpecification);
    }
    public Optional<GlobalTableWriteProvisionedThroughputSettings> getWriteProvisionedThroughputSettings() {
        return Optional.ofNullable(this.writeProvisionedThroughputSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<GlobalTableAttributeDefinition> attributeDefinitions;
        private @Nullable String billingMode;
        private @Nullable List<GlobalTableGlobalSecondaryIndex> globalSecondaryIndexes;
        private @Nullable List<GlobalTableReplicaSpecification> replicas;
        private @Nullable GlobalTableSSESpecification sSESpecification;
        private @Nullable String streamArn;
        private @Nullable GlobalTableStreamSpecification streamSpecification;
        private @Nullable String tableId;
        private @Nullable GlobalTableTimeToLiveSpecification timeToLiveSpecification;
        private @Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attributeDefinitions = defaults.attributeDefinitions;
    	      this.billingMode = defaults.billingMode;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.replicas = defaults.replicas;
    	      this.sSESpecification = defaults.sSESpecification;
    	      this.streamArn = defaults.streamArn;
    	      this.streamSpecification = defaults.streamSpecification;
    	      this.tableId = defaults.tableId;
    	      this.timeToLiveSpecification = defaults.timeToLiveSpecification;
    	      this.writeProvisionedThroughputSettings = defaults.writeProvisionedThroughputSettings;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAttributeDefinitions(@Nullable List<GlobalTableAttributeDefinition> attributeDefinitions) {
            this.attributeDefinitions = attributeDefinitions;
            return this;
        }

        public Builder setBillingMode(@Nullable String billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable List<GlobalTableGlobalSecondaryIndex> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        public Builder setReplicas(@Nullable List<GlobalTableReplicaSpecification> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setSSESpecification(@Nullable GlobalTableSSESpecification sSESpecification) {
            this.sSESpecification = sSESpecification;
            return this;
        }

        public Builder setStreamArn(@Nullable String streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        public Builder setStreamSpecification(@Nullable GlobalTableStreamSpecification streamSpecification) {
            this.streamSpecification = streamSpecification;
            return this;
        }

        public Builder setTableId(@Nullable String tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder setTimeToLiveSpecification(@Nullable GlobalTableTimeToLiveSpecification timeToLiveSpecification) {
            this.timeToLiveSpecification = timeToLiveSpecification;
            return this;
        }

        public Builder setWriteProvisionedThroughputSettings(@Nullable GlobalTableWriteProvisionedThroughputSettings writeProvisionedThroughputSettings) {
            this.writeProvisionedThroughputSettings = writeProvisionedThroughputSettings;
            return this;
        }
        public GetGlobalTableResult build() {
            return new GetGlobalTableResult(arn, attributeDefinitions, billingMode, globalSecondaryIndexes, replicas, sSESpecification, streamArn, streamSpecification, tableId, timeToLiveSpecification, writeProvisionedThroughputSettings);
        }
    }
}
