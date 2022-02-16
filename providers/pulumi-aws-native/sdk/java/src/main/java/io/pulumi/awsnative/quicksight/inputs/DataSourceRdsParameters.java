// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceRdsParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceRdsParameters Empty = new DataSourceRdsParameters();

    @InputImport(name="database", required=true)
    private final String database;

    public String getDatabase() {
        return this.database;
    }

    @InputImport(name="instanceId", required=true)
    private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public DataSourceRdsParameters(
        String database,
        String instanceId) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
    }

    private DataSourceRdsParameters() {
        this.database = null;
        this.instanceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRdsParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRdsParameters defaults) {
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

        public DataSourceRdsParameters build() {
            return new DataSourceRdsParameters(database, instanceId);
        }
    }
}