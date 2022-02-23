// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderBucketConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderBucketConfigArgs Empty = new FolderBucketConfigArgs();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @InputImport(name="bucketId", required=true)
        private final Input<String> bucketId;

    public Input<String> getBucketId() {
        return this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @InputImport(name="folder", required=true)
        private final Input<String> folder;

    public Input<String> getFolder() {
        return this.folder;
    }

    /**
     * The location of the bucket.
     * 
     */
    @InputImport(name="location", required=true)
        private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @InputImport(name="retentionDays")
        private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    public FolderBucketConfigArgs(
        Input<String> bucketId,
        @Nullable Input<String> description,
        Input<String> folder,
        Input<String> location,
        @Nullable Input<Integer> retentionDays) {
        this.bucketId = Objects.requireNonNull(bucketId, "expected parameter 'bucketId' to be non-null");
        this.description = description;
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.retentionDays = retentionDays;
    }

    private FolderBucketConfigArgs() {
        this.bucketId = Input.empty();
        this.description = Input.empty();
        this.folder = Input.empty();
        this.location = Input.empty();
        this.retentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderBucketConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketId;
        private @Nullable Input<String> description;
        private Input<String> folder;
        private Input<String> location;
        private @Nullable Input<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderBucketConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.location = defaults.location;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder setBucketId(Input<String> bucketId) {
            this.bucketId = Objects.requireNonNull(bucketId);
            return this;
        }

        public Builder setBucketId(String bucketId) {
            this.bucketId = Input.of(Objects.requireNonNull(bucketId));
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

        public Builder setFolder(Input<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setFolder(String folder) {
            this.folder = Input.of(Objects.requireNonNull(folder));
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }
        public FolderBucketConfigArgs build() {
            return new FolderBucketConfigArgs(bucketId, description, folder, location, retentionDays);
        }
    }
}
