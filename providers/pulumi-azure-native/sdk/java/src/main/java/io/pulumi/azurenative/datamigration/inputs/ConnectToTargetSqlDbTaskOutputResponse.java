// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Output for the task that validates connection to SQL DB and target server requirements
 * 
 */
public final class ConnectToTargetSqlDbTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetSqlDbTaskOutputResponse Empty = new ConnectToTargetSqlDbTaskOutputResponse();

    /**
     * Source databases as a map from database name to database id
     * 
     */
    @InputImport(name="databases", required=true)
    private final Map<String,String> databases;

    public Map<String,String> getDatabases() {
        return this.databases;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Target server brand version
     * 
     */
    @InputImport(name="targetServerBrandVersion", required=true)
    private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Version of the target server
     * 
     */
    @InputImport(name="targetServerVersion", required=true)
    private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public ConnectToTargetSqlDbTaskOutputResponse(
        Map<String,String> databases,
        String id,
        String targetServerBrandVersion,
        String targetServerVersion) {
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private ConnectToTargetSqlDbTaskOutputResponse() {
        this.databases = Map.of();
        this.id = null;
        this.targetServerBrandVersion = null;
        this.targetServerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlDbTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> databases;
        private String id;
        private String targetServerBrandVersion;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlDbTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setDatabases(Map<String,String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public ConnectToTargetSqlDbTaskOutputResponse build() {
            return new ConnectToTargetSqlDbTaskOutputResponse(databases, id, targetServerBrandVersion, targetServerVersion);
        }
    }
}
