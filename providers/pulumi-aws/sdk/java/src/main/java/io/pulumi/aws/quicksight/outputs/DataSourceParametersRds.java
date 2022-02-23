// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersRds {
    /**
     * The database to which to connect.
     * 
     */
    private final String database;
    /**
     * The instance ID to which to connect.
     * 
     */
    private final String instanceId;

    @OutputCustomType.Constructor({"database","instanceId"})
    private DataSourceParametersRds(
        String database,
        String instanceId) {
        this.database = Objects.requireNonNull(database);
        this.instanceId = Objects.requireNonNull(instanceId);
    }

    /**
     * The database to which to connect.
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * The instance ID to which to connect.
     * 
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersRds defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersRds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public DataSourceParametersRds build() {
            return new DataSourceParametersRds(database, instanceId);
        }
    }
}
