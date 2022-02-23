// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1beta1.enums.MigrationJobState;
import io.pulumi.googlenative.datamigration_v1beta1.enums.MigrationJobType;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.DatabaseTypeArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.ReverseSshConnectivityArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.StaticIpConnectivityArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.VpcPeeringConnectivityArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrationJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrationJobArgs Empty = new MigrationJobArgs();

    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    @InputImport(name="destination", required=true)
      private final Input<String> destination;

    public Input<String> getDestination() {
        return this.destination;
    }

    /**
     * The database engine type and provider of the destination.
     * 
     */
    @InputImport(name="destinationDatabase")
      private final @Nullable Input<DatabaseTypeArgs> destinationDatabase;

    public Input<DatabaseTypeArgs> getDestinationDatabase() {
        return this.destinationDatabase == null ? Input.empty() : this.destinationDatabase;
    }

    /**
     * The migration job display name.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    @InputImport(name="dumpPath")
      private final @Nullable Input<String> dumpPath;

    public Input<String> getDumpPath() {
        return this.dumpPath == null ? Input.empty() : this.dumpPath;
    }

    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="migrationJobId", required=true)
      private final Input<String> migrationJobId;

    public Input<String> getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    @InputImport(name="reverseSshConnectivity")
      private final @Nullable Input<ReverseSshConnectivityArgs> reverseSshConnectivity;

    public Input<ReverseSshConnectivityArgs> getReverseSshConnectivity() {
        return this.reverseSshConnectivity == null ? Input.empty() : this.reverseSshConnectivity;
    }

    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    /**
     * The database engine type and provider of the source.
     * 
     */
    @InputImport(name="sourceDatabase")
      private final @Nullable Input<DatabaseTypeArgs> sourceDatabase;

    public Input<DatabaseTypeArgs> getSourceDatabase() {
        return this.sourceDatabase == null ? Input.empty() : this.sourceDatabase;
    }

    /**
     * The current migration job state.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<MigrationJobState> state;

    public Input<MigrationJobState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    @InputImport(name="staticIpConnectivity")
      private final @Nullable Input<StaticIpConnectivityArgs> staticIpConnectivity;

    public Input<StaticIpConnectivityArgs> getStaticIpConnectivity() {
        return this.staticIpConnectivity == null ? Input.empty() : this.staticIpConnectivity;
    }

    /**
     * The migration job type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<MigrationJobType> type;

    public Input<MigrationJobType> getType() {
        return this.type;
    }

    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    @InputImport(name="vpcPeeringConnectivity")
      private final @Nullable Input<VpcPeeringConnectivityArgs> vpcPeeringConnectivity;

    public Input<VpcPeeringConnectivityArgs> getVpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity == null ? Input.empty() : this.vpcPeeringConnectivity;
    }

    public MigrationJobArgs(
        Input<String> destination,
        @Nullable Input<DatabaseTypeArgs> destinationDatabase,
        @Nullable Input<String> displayName,
        @Nullable Input<String> dumpPath,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        Input<String> migrationJobId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<ReverseSshConnectivityArgs> reverseSshConnectivity,
        Input<String> source,
        @Nullable Input<DatabaseTypeArgs> sourceDatabase,
        @Nullable Input<MigrationJobState> state,
        @Nullable Input<StaticIpConnectivityArgs> staticIpConnectivity,
        Input<MigrationJobType> type,
        @Nullable Input<VpcPeeringConnectivityArgs> vpcPeeringConnectivity) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.destinationDatabase = destinationDatabase;
        this.displayName = displayName;
        this.dumpPath = dumpPath;
        this.labels = labels;
        this.location = location;
        this.migrationJobId = Objects.requireNonNull(migrationJobId, "expected parameter 'migrationJobId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.reverseSshConnectivity = reverseSshConnectivity;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceDatabase = sourceDatabase;
        this.state = state;
        this.staticIpConnectivity = staticIpConnectivity;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vpcPeeringConnectivity = vpcPeeringConnectivity;
    }

    private MigrationJobArgs() {
        this.destination = Input.empty();
        this.destinationDatabase = Input.empty();
        this.displayName = Input.empty();
        this.dumpPath = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.migrationJobId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.reverseSshConnectivity = Input.empty();
        this.source = Input.empty();
        this.sourceDatabase = Input.empty();
        this.state = Input.empty();
        this.staticIpConnectivity = Input.empty();
        this.type = Input.empty();
        this.vpcPeeringConnectivity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destination;
        private @Nullable Input<DatabaseTypeArgs> destinationDatabase;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> dumpPath;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private Input<String> migrationJobId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ReverseSshConnectivityArgs> reverseSshConnectivity;
        private Input<String> source;
        private @Nullable Input<DatabaseTypeArgs> sourceDatabase;
        private @Nullable Input<MigrationJobState> state;
        private @Nullable Input<StaticIpConnectivityArgs> staticIpConnectivity;
        private Input<MigrationJobType> type;
        private @Nullable Input<VpcPeeringConnectivityArgs> vpcPeeringConnectivity;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationDatabase = defaults.destinationDatabase;
    	      this.displayName = defaults.displayName;
    	      this.dumpPath = defaults.dumpPath;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.migrationJobId = defaults.migrationJobId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.reverseSshConnectivity = defaults.reverseSshConnectivity;
    	      this.source = defaults.source;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.state = defaults.state;
    	      this.staticIpConnectivity = defaults.staticIpConnectivity;
    	      this.type = defaults.type;
    	      this.vpcPeeringConnectivity = defaults.vpcPeeringConnectivity;
        }

        public Builder setDestination(Input<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setDestinationDatabase(@Nullable Input<DatabaseTypeArgs> destinationDatabase) {
            this.destinationDatabase = destinationDatabase;
            return this;
        }

        public Builder setDestinationDatabase(@Nullable DatabaseTypeArgs destinationDatabase) {
            this.destinationDatabase = Input.ofNullable(destinationDatabase);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setDumpPath(@Nullable Input<String> dumpPath) {
            this.dumpPath = dumpPath;
            return this;
        }

        public Builder setDumpPath(@Nullable String dumpPath) {
            this.dumpPath = Input.ofNullable(dumpPath);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setMigrationJobId(Input<String> migrationJobId) {
            this.migrationJobId = Objects.requireNonNull(migrationJobId);
            return this;
        }

        public Builder setMigrationJobId(String migrationJobId) {
            this.migrationJobId = Input.of(Objects.requireNonNull(migrationJobId));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setReverseSshConnectivity(@Nullable Input<ReverseSshConnectivityArgs> reverseSshConnectivity) {
            this.reverseSshConnectivity = reverseSshConnectivity;
            return this;
        }

        public Builder setReverseSshConnectivity(@Nullable ReverseSshConnectivityArgs reverseSshConnectivity) {
            this.reverseSshConnectivity = Input.ofNullable(reverseSshConnectivity);
            return this;
        }

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setSourceDatabase(@Nullable Input<DatabaseTypeArgs> sourceDatabase) {
            this.sourceDatabase = sourceDatabase;
            return this;
        }

        public Builder setSourceDatabase(@Nullable DatabaseTypeArgs sourceDatabase) {
            this.sourceDatabase = Input.ofNullable(sourceDatabase);
            return this;
        }

        public Builder setState(@Nullable Input<MigrationJobState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable MigrationJobState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStaticIpConnectivity(@Nullable Input<StaticIpConnectivityArgs> staticIpConnectivity) {
            this.staticIpConnectivity = staticIpConnectivity;
            return this;
        }

        public Builder setStaticIpConnectivity(@Nullable StaticIpConnectivityArgs staticIpConnectivity) {
            this.staticIpConnectivity = Input.ofNullable(staticIpConnectivity);
            return this;
        }

        public Builder setType(Input<MigrationJobType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(MigrationJobType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVpcPeeringConnectivity(@Nullable Input<VpcPeeringConnectivityArgs> vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = vpcPeeringConnectivity;
            return this;
        }

        public Builder setVpcPeeringConnectivity(@Nullable VpcPeeringConnectivityArgs vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = Input.ofNullable(vpcPeeringConnectivity);
            return this;
        }
        public MigrationJobArgs build() {
            return new MigrationJobArgs(destination, destinationDatabase, displayName, dumpPath, labels, location, migrationJobId, name, project, requestId, reverseSshConnectivity, source, sourceDatabase, state, staticIpConnectivity, type, vpcPeeringConnectivity);
        }
    }
}
