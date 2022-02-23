// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FollowerDatabaseDefinitionResponse {
    /**
     * Resource name of the attached database configuration in the follower cluster.
     * 
     */
    private final String attachedDatabaseConfigurationName;
    /**
     * The database name owned by this cluster that was followed. * in case following all databases.
     * 
     */
    private final String databaseName;
    /**
     * Resource id of the cluster that follows a database owned by this cluster.
     * 
     */
    private final String kustoPoolResourceId;

    @OutputCustomType.Constructor({"attachedDatabaseConfigurationName","databaseName","kustoPoolResourceId"})
    private FollowerDatabaseDefinitionResponse(
        String attachedDatabaseConfigurationName,
        String databaseName,
        String kustoPoolResourceId) {
        this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
    }

    /**
     * Resource name of the attached database configuration in the follower cluster.
     * 
     */
    public String getAttachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }
    /**
     * The database name owned by this cluster that was followed. * in case following all databases.
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Resource id of the cluster that follows a database owned by this cluster.
     * 
     */
    public String getKustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FollowerDatabaseDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedDatabaseConfigurationName;
        private String databaseName;
        private String kustoPoolResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(FollowerDatabaseDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseConfigurationName = defaults.attachedDatabaseConfigurationName;
    	      this.databaseName = defaults.databaseName;
    	      this.kustoPoolResourceId = defaults.kustoPoolResourceId;
        }

        public Builder setAttachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
            this.attachedDatabaseConfigurationName = Objects.requireNonNull(attachedDatabaseConfigurationName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setKustoPoolResourceId(String kustoPoolResourceId) {
            this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
            return this;
        }
        public FollowerDatabaseDefinitionResponse build() {
            return new FollowerDatabaseDefinitionResponse(attachedDatabaseConfigurationName, databaseName, kustoPoolResourceId);
        }
    }
}
