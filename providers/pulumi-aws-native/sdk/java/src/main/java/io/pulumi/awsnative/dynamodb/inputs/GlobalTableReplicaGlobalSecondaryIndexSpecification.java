// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableContributorInsightsSpecification;
import io.pulumi.awsnative.dynamodb.inputs.GlobalTableReadProvisionedThroughputSettings;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableReplicaGlobalSecondaryIndexSpecification extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableReplicaGlobalSecondaryIndexSpecification Empty = new GlobalTableReplicaGlobalSecondaryIndexSpecification();

    @Import(name="contributorInsightsSpecification")
      private final @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;

    public Optional<GlobalTableContributorInsightsSpecification> getContributorInsightsSpecification() {
        return this.contributorInsightsSpecification == null ? Optional.empty() : Optional.ofNullable(this.contributorInsightsSpecification);
    }

    @Import(name="indexName", required=true)
      private final String indexName;

    public String getIndexName() {
        return this.indexName;
    }

    @Import(name="readProvisionedThroughputSettings")
      private final @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;

    public Optional<GlobalTableReadProvisionedThroughputSettings> getReadProvisionedThroughputSettings() {
        return this.readProvisionedThroughputSettings == null ? Optional.empty() : Optional.ofNullable(this.readProvisionedThroughputSettings);
    }

    public GlobalTableReplicaGlobalSecondaryIndexSpecification(
        @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification,
        String indexName,
        @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings) {
        this.contributorInsightsSpecification = contributorInsightsSpecification;
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
    }

    private GlobalTableReplicaGlobalSecondaryIndexSpecification() {
        this.contributorInsightsSpecification = null;
        this.indexName = null;
        this.readProvisionedThroughputSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaGlobalSecondaryIndexSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification;
        private String indexName;
        private @Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaGlobalSecondaryIndexSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributorInsightsSpecification = defaults.contributorInsightsSpecification;
    	      this.indexName = defaults.indexName;
    	      this.readProvisionedThroughputSettings = defaults.readProvisionedThroughputSettings;
        }

        public Builder contributorInsightsSpecification(@Nullable GlobalTableContributorInsightsSpecification contributorInsightsSpecification) {
            this.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }

        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder readProvisionedThroughputSettings(@Nullable GlobalTableReadProvisionedThroughputSettings readProvisionedThroughputSettings) {
            this.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }
        public GlobalTableReplicaGlobalSecondaryIndexSpecification build() {
            return new GlobalTableReplicaGlobalSecondaryIndexSpecification(contributorInsightsSpecification, indexName, readProvisionedThroughputSettings);
        }
    }
}
