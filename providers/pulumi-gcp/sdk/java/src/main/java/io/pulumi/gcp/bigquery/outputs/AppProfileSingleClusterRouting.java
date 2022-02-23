// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AppProfileSingleClusterRouting {
    /**
     * If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
     * It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    private final @Nullable Boolean allowTransactionalWrites;
    /**
     * The cluster to which read/write requests should be routed.
     * 
     */
    private final String clusterId;

    @OutputCustomType.Constructor({"allowTransactionalWrites","clusterId"})
    private AppProfileSingleClusterRouting(
        @Nullable Boolean allowTransactionalWrites,
        String clusterId) {
        this.allowTransactionalWrites = allowTransactionalWrites;
        this.clusterId = Objects.requireNonNull(clusterId);
    }

    /**
     * If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
     * It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    public Optional<Boolean> getAllowTransactionalWrites() {
        return Optional.ofNullable(this.allowTransactionalWrites);
    }
    /**
     * The cluster to which read/write requests should be routed.
     * 
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppProfileSingleClusterRouting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowTransactionalWrites;
        private String clusterId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppProfileSingleClusterRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTransactionalWrites = defaults.allowTransactionalWrites;
    	      this.clusterId = defaults.clusterId;
        }

        public Builder setAllowTransactionalWrites(@Nullable Boolean allowTransactionalWrites) {
            this.allowTransactionalWrites = allowTransactionalWrites;
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public AppProfileSingleClusterRouting build() {
            return new AppProfileSingleClusterRouting(allowTransactionalWrites, clusterId);
        }
    }
}
