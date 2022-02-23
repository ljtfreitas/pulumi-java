// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetObjectIamPolicyArgs Empty = new GetObjectIamPolicyArgs();

    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="generation")
      private final @Nullable String generation;

    public Optional<String> getGeneration() {
        return this.generation == null ? Optional.empty() : Optional.ofNullable(this.generation);
    }

    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    @InputImport(name="provisionalUserProject")
      private final @Nullable String provisionalUserProject;

    public Optional<String> getProvisionalUserProject() {
        return this.provisionalUserProject == null ? Optional.empty() : Optional.ofNullable(this.provisionalUserProject);
    }

    @InputImport(name="userProject")
      private final @Nullable String userProject;

    public Optional<String> getUserProject() {
        return this.userProject == null ? Optional.empty() : Optional.ofNullable(this.userProject);
    }

    public GetObjectIamPolicyArgs(
        String bucket,
        @Nullable String generation,
        String object,
        @Nullable String provisionalUserProject,
        @Nullable String userProject) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
        this.provisionalUserProject = provisionalUserProject;
        this.userProject = userProject;
    }

    private GetObjectIamPolicyArgs() {
        this.bucket = null;
        this.generation = null;
        this.object = null;
        this.provisionalUserProject = null;
        this.userProject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String generation;
        private String object;
        private @Nullable String provisionalUserProject;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
    	      this.provisionalUserProject = defaults.provisionalUserProject;
    	      this.userProject = defaults.userProject;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGeneration(@Nullable String generation) {
            this.generation = generation;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setProvisionalUserProject(@Nullable String provisionalUserProject) {
            this.provisionalUserProject = provisionalUserProject;
            return this;
        }

        public Builder setUserProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }
        public GetObjectIamPolicyArgs build() {
            return new GetObjectIamPolicyArgs(bucket, generation, object, provisionalUserProject, userProject);
        }
    }
}
