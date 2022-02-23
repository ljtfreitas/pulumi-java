// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.inputs.DatabaseDumpArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetadataImportArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataImportArgs Empty = new MetadataImportArgs();

    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    @InputImport(name="databaseDump")
      private final @Nullable Input<DatabaseDumpArgs> databaseDump;

    public Input<DatabaseDumpArgs> getDatabaseDump() {
        return this.databaseDump == null ? Input.empty() : this.databaseDump;
    }

    /**
     * The description of the metadata import.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="metadataImportId", required=true)
      private final Input<String> metadataImportId;

    public Input<String> getMetadataImportId() {
        return this.metadataImportId;
    }

    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
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

    @InputImport(name="serviceId", required=true)
      private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    public MetadataImportArgs(
        @Nullable Input<DatabaseDumpArgs> databaseDump,
        @Nullable Input<String> description,
        @Nullable Input<String> location,
        Input<String> metadataImportId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        Input<String> serviceId) {
        this.databaseDump = databaseDump;
        this.description = description;
        this.location = location;
        this.metadataImportId = Objects.requireNonNull(metadataImportId, "expected parameter 'metadataImportId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private MetadataImportArgs() {
        this.databaseDump = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.metadataImportId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.serviceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatabaseDumpArgs> databaseDump;
        private @Nullable Input<String> description;
        private @Nullable Input<String> location;
        private Input<String> metadataImportId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private Input<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataImportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseDump = defaults.databaseDump;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.metadataImportId = defaults.metadataImportId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder setDatabaseDump(@Nullable Input<DatabaseDumpArgs> databaseDump) {
            this.databaseDump = databaseDump;
            return this;
        }

        public Builder setDatabaseDump(@Nullable DatabaseDumpArgs databaseDump) {
            this.databaseDump = Input.ofNullable(databaseDump);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setMetadataImportId(Input<String> metadataImportId) {
            this.metadataImportId = Objects.requireNonNull(metadataImportId);
            return this;
        }

        public Builder setMetadataImportId(String metadataImportId) {
            this.metadataImportId = Input.of(Objects.requireNonNull(metadataImportId));
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

        public Builder setServiceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }
        public MetadataImportArgs build() {
            return new MetadataImportArgs(databaseDump, description, location, metadataImportId, name, project, requestId, serviceId);
        }
    }
}
