// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HiveMetastoreResponse {
    /**
     * The databaseName for the Hive MetaStore
     * 
     */
    private final String databaseName;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The current state of the NestedResource
     * 
     */
    private final String nestedResourceProvisioningState;
    /**
     * The password for the Hive MetaStore
     * 
     */
    private final String password;
    /**
     * The runtimeVersion for the Hive MetaStore
     * 
     */
    private final String runtimeVersion;
    /**
     * The serverUri for the Hive MetaStore
     * 
     */
    private final String serverUri;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The userName for the Hive MetaStore
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"databaseName","id","name","nestedResourceProvisioningState","password","runtimeVersion","serverUri","type","userName"})
    private HiveMetastoreResponse(
        String databaseName,
        String id,
        String name,
        String nestedResourceProvisioningState,
        String password,
        String runtimeVersion,
        String serverUri,
        String type,
        String userName) {
        this.databaseName = Objects.requireNonNull(databaseName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.nestedResourceProvisioningState = Objects.requireNonNull(nestedResourceProvisioningState);
        this.password = Objects.requireNonNull(password);
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
        this.serverUri = Objects.requireNonNull(serverUri);
        this.type = Objects.requireNonNull(type);
        this.userName = Objects.requireNonNull(userName);
    }

    /**
     * The databaseName for the Hive MetaStore
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the NestedResource
     * 
     */
    public String getNestedResourceProvisioningState() {
        return this.nestedResourceProvisioningState;
    }
    /**
     * The password for the Hive MetaStore
     * 
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * The runtimeVersion for the Hive MetaStore
     * 
     */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * The serverUri for the Hive MetaStore
     * 
     */
    public String getServerUri() {
        return this.serverUri;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The userName for the Hive MetaStore
     * 
     */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveMetastoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String id;
        private String name;
        private String nestedResourceProvisioningState;
        private String password;
        private String runtimeVersion;
        private String serverUri;
        private String type;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveMetastoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nestedResourceProvisioningState = defaults.nestedResourceProvisioningState;
    	      this.password = defaults.password;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.serverUri = defaults.serverUri;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNestedResourceProvisioningState(String nestedResourceProvisioningState) {
            this.nestedResourceProvisioningState = Objects.requireNonNull(nestedResourceProvisioningState);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder setServerUri(String serverUri) {
            this.serverUri = Objects.requireNonNull(serverUri);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public HiveMetastoreResponse build() {
            return new HiveMetastoreResponse(databaseName, id, name, nestedResourceProvisioningState, password, runtimeVersion, serverUri, type, userName);
        }
    }
}
