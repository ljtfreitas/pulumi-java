// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.DataConnectionKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataConnectionArgs Empty = new DataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the data connection.
     * 
     */
    @InputImport(name="dataConnectionName")
    private final @Nullable Input<String> dataConnectionName;

    public Input<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Input.empty() : this.dataConnectionName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Kind of the endpoint for the data connection
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<Either<String,DataConnectionKind>> kind;

    public Input<Either<String,DataConnectionKind>> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DataConnectionArgs(
        Input<String> clusterName,
        @Nullable Input<String> dataConnectionName,
        Input<String> databaseName,
        Input<Either<String,DataConnectionKind>> kind,
        @Nullable Input<String> location,
        Input<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private DataConnectionArgs() {
        this.clusterName = Input.empty();
        this.dataConnectionName = Input.empty();
        this.databaseName = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> dataConnectionName;
        private Input<String> databaseName;
        private Input<Either<String,DataConnectionKind>> kind;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setDataConnectionName(@Nullable Input<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }

        public Builder setDataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Input.ofNullable(dataConnectionName);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setKind(Input<Either<String,DataConnectionKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,DataConnectionKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public DataConnectionArgs build() {
            return new DataConnectionArgs(clusterName, dataConnectionName, databaseName, kind, location, resourceGroupName);
        }
    }
}
