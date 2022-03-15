// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsageExportBucketState extends io.pulumi.resources.ResourceArgs {

    public static final UsageExportBucketState Empty = new UsageExportBucketState();

    /**
     * The bucket to store reports in.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * A prefix for the reports, for instance, the project name.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The project to set the export bucket on. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public UsageExportBucketState(
        @Nullable Output<String> bucketName,
        @Nullable Output<String> prefix,
        @Nullable Output<String> project) {
        this.bucketName = bucketName;
        this.prefix = prefix;
        this.project = project;
    }

    private UsageExportBucketState() {
        this.bucketName = Output.empty();
        this.prefix = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageExportBucketState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<String> prefix;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageExportBucketState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.prefix = defaults.prefix;
    	      this.project = defaults.project;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
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
        public UsageExportBucketState build() {
            return new UsageExportBucketState(bucketName, prefix, project);
        }
    }
}
