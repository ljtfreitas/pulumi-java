// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.MigrationProgressResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrationPropertiesResponse {
    /**
     * Migration Progress
     * 
     */
    private final MigrationProgressResponse migrationProgress;
    /**
     * Old Subnet Id
     * 
     */
    private final String oldSubnetId;
    /**
     * Old Vnet Site Id
     * 
     */
    private final String oldVnetSiteId;

    @OutputCustomType.Constructor({"migrationProgress","oldSubnetId","oldVnetSiteId"})
    private MigrationPropertiesResponse(
        MigrationProgressResponse migrationProgress,
        String oldSubnetId,
        String oldVnetSiteId) {
        this.migrationProgress = Objects.requireNonNull(migrationProgress);
        this.oldSubnetId = Objects.requireNonNull(oldSubnetId);
        this.oldVnetSiteId = Objects.requireNonNull(oldVnetSiteId);
    }

    /**
     * Migration Progress
     * 
     */
    public MigrationProgressResponse getMigrationProgress() {
        return this.migrationProgress;
    }
    /**
     * Old Subnet Id
     * 
     */
    public String getOldSubnetId() {
        return this.oldSubnetId;
    }
    /**
     * Old Vnet Site Id
     * 
     */
    public String getOldVnetSiteId() {
        return this.oldVnetSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationProgressResponse migrationProgress;
        private String oldSubnetId;
        private String oldVnetSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationProgress = defaults.migrationProgress;
    	      this.oldSubnetId = defaults.oldSubnetId;
    	      this.oldVnetSiteId = defaults.oldVnetSiteId;
        }

        public Builder setMigrationProgress(MigrationProgressResponse migrationProgress) {
            this.migrationProgress = Objects.requireNonNull(migrationProgress);
            return this;
        }

        public Builder setOldSubnetId(String oldSubnetId) {
            this.oldSubnetId = Objects.requireNonNull(oldSubnetId);
            return this;
        }

        public Builder setOldVnetSiteId(String oldVnetSiteId) {
            this.oldVnetSiteId = Objects.requireNonNull(oldVnetSiteId);
            return this;
        }

        public MigrationPropertiesResponse build() {
            return new MigrationPropertiesResponse(migrationProgress, oldSubnetId, oldVnetSiteId);
        }
    }
}
