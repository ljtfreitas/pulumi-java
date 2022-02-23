// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @InputImport(name="backupId", required=true)
      private final Input<String> backupId;

    public Input<String> getBackupId() {
        return this.backupId;
    }

    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource labels to represent user provided metadata.
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

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    @InputImport(name="sourceFileShare")
      private final @Nullable Input<String> sourceFileShare;

    public Input<String> getSourceFileShare() {
        return this.sourceFileShare == null ? Input.empty() : this.sourceFileShare;
    }

    /**
     * The resource name of the source Cloud Filestore instance, in the format `projects/{project_number}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
     */
    @InputImport(name="sourceInstance")
      private final @Nullable Input<String> sourceInstance;

    public Input<String> getSourceInstance() {
        return this.sourceInstance == null ? Input.empty() : this.sourceInstance;
    }

    public BackupArgs(
        Input<String> backupId,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> sourceFileShare,
        @Nullable Input<String> sourceInstance) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.sourceFileShare = sourceFileShare;
        this.sourceInstance = sourceInstance;
    }

    private BackupArgs() {
        this.backupId = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.sourceFileShare = Input.empty();
        this.sourceInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupId;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> sourceFileShare;
        private @Nullable Input<String> sourceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sourceFileShare = defaults.sourceFileShare;
    	      this.sourceInstance = defaults.sourceInstance;
        }

        public Builder setBackupId(Input<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setBackupId(String backupId) {
            this.backupId = Input.of(Objects.requireNonNull(backupId));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSourceFileShare(@Nullable Input<String> sourceFileShare) {
            this.sourceFileShare = sourceFileShare;
            return this;
        }

        public Builder setSourceFileShare(@Nullable String sourceFileShare) {
            this.sourceFileShare = Input.ofNullable(sourceFileShare);
            return this;
        }

        public Builder setSourceInstance(@Nullable Input<String> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }

        public Builder setSourceInstance(@Nullable String sourceInstance) {
            this.sourceInstance = Input.ofNullable(sourceInstance);
            return this;
        }
        public BackupArgs build() {
            return new BackupArgs(backupId, description, labels, location, project, sourceFileShare, sourceInstance);
        }
    }
}
