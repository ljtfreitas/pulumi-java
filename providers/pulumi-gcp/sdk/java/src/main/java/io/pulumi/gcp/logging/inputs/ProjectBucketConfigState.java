// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectBucketConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectBucketConfigState Empty = new ProjectBucketConfigState();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @Import(name="bucketId")
      private final @Nullable Output<String> bucketId;

    public Output<String> getBucketId() {
        return this.bucketId == null ? Output.empty() : this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The bucket's lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @Import(name="lifecycleState")
      private final @Nullable Output<String> lifecycleState;

    public Output<String> getLifecycleState() {
        return this.lifecycleState == null ? Output.empty() : this.lifecycleState;
    }

    /**
     * The location of the bucket.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Output.empty() : this.retentionDays;
    }

    public ProjectBucketConfigState(
        @Nullable Output<String> bucketId,
        @Nullable Output<String> description,
        @Nullable Output<String> lifecycleState,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Integer> retentionDays) {
        this.bucketId = bucketId;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.location = location;
        this.name = name;
        this.project = project;
        this.retentionDays = retentionDays;
    }

    private ProjectBucketConfigState() {
        this.bucketId = Output.empty();
        this.description = Output.empty();
        this.lifecycleState = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.retentionDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectBucketConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> lifecycleState;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectBucketConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            this.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(@Nullable String bucketId) {
            this.bucketId = Output.ofNullable(bucketId);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder lifecycleState(@Nullable Output<String> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        public Builder lifecycleState(@Nullable String lifecycleState) {
            this.lifecycleState = Output.ofNullable(lifecycleState);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Output.ofNullable(retentionDays);
            return this;
        }
        public ProjectBucketConfigState build() {
            return new ProjectBucketConfigState(bucketId, description, lifecycleState, location, name, project, retentionDays);
        }
    }
}
