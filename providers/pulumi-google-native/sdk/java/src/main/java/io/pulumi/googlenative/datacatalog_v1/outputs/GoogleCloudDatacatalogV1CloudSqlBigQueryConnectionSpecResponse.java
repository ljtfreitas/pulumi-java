// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse {
    /**
     * Database name.
     * 
     */
    private final String database;
    /**
     * Cloud SQL instance ID in the format of `project:location:instance`.
     * 
     */
    private final String instanceId;
    /**
     * Type of the Cloud SQL database.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"database","instanceId","type"})
    private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse(
        String database,
        String instanceId,
        String type) {
        this.database = Objects.requireNonNull(database);
        this.instanceId = Objects.requireNonNull(instanceId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Database name.
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * Cloud SQL instance ID in the format of `project:location:instance`.
     * 
     */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Type of the Cloud SQL database.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String instanceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse(database, instanceId, type);
        }
    }
}
