// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.azurenative.aad.inputs.MigrationProgressResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Migration Properties
 * 
 */
public final class MigrationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationPropertiesResponse Empty = new MigrationPropertiesResponse();

    /**
     * Migration Progress
     * 
     */
    @Import(name="migrationProgress", required=true)
      private final MigrationProgressResponse migrationProgress;

    public MigrationProgressResponse getMigrationProgress() {
        return this.migrationProgress;
    }

    /**
     * Old Subnet Id
     * 
     */
    @Import(name="oldSubnetId", required=true)
      private final String oldSubnetId;

    public String getOldSubnetId() {
        return this.oldSubnetId;
    }

    /**
     * Old Vnet Site Id
     * 
     */
    @Import(name="oldVnetSiteId", required=true)
      private final String oldVnetSiteId;

    public String getOldVnetSiteId() {
        return this.oldVnetSiteId;
    }

    public MigrationPropertiesResponse(
        MigrationProgressResponse migrationProgress,
        String oldSubnetId,
        String oldVnetSiteId) {
        this.migrationProgress = Objects.requireNonNull(migrationProgress, "expected parameter 'migrationProgress' to be non-null");
        this.oldSubnetId = Objects.requireNonNull(oldSubnetId, "expected parameter 'oldSubnetId' to be non-null");
        this.oldVnetSiteId = Objects.requireNonNull(oldVnetSiteId, "expected parameter 'oldVnetSiteId' to be non-null");
    }

    private MigrationPropertiesResponse() {
        this.migrationProgress = null;
        this.oldSubnetId = null;
        this.oldVnetSiteId = null;
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

        public Builder migrationProgress(MigrationProgressResponse migrationProgress) {
            this.migrationProgress = Objects.requireNonNull(migrationProgress);
            return this;
        }

        public Builder oldSubnetId(String oldSubnetId) {
            this.oldSubnetId = Objects.requireNonNull(oldSubnetId);
            return this;
        }

        public Builder oldVnetSiteId(String oldVnetSiteId) {
            this.oldVnetSiteId = Objects.requireNonNull(oldVnetSiteId);
            return this;
        }
        public MigrationPropertiesResponse build() {
            return new MigrationPropertiesResponse(migrationProgress, oldSubnetId, oldVnetSiteId);
        }
    }
}
