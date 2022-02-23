// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.PrivatePoolV1ConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<Map<String,String>> annotations;

    public Input<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Legacy Private Pool configuration.
     * 
     */
    @InputImport(name="privatePoolV1Config")
      private final @Nullable Input<PrivatePoolV1ConfigArgs> privatePoolV1Config;

    public Input<PrivatePoolV1ConfigArgs> getPrivatePoolV1Config() {
        return this.privatePoolV1Config == null ? Input.empty() : this.privatePoolV1Config;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="validateOnly")
      private final @Nullable Input<String> validateOnly;

    public Input<String> getValidateOnly() {
        return this.validateOnly == null ? Input.empty() : this.validateOnly;
    }

    @InputImport(name="workerPoolId", required=true)
      private final Input<String> workerPoolId;

    public Input<String> getWorkerPoolId() {
        return this.workerPoolId;
    }

    public WorkerPoolArgs(
        @Nullable Input<Map<String,String>> annotations,
        @Nullable Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<PrivatePoolV1ConfigArgs> privatePoolV1Config,
        @Nullable Input<String> project,
        @Nullable Input<String> validateOnly,
        Input<String> workerPoolId) {
        this.annotations = annotations;
        this.displayName = displayName;
        this.location = location;
        this.privatePoolV1Config = privatePoolV1Config;
        this.project = project;
        this.validateOnly = validateOnly;
        this.workerPoolId = Objects.requireNonNull(workerPoolId, "expected parameter 'workerPoolId' to be non-null");
    }

    private WorkerPoolArgs() {
        this.annotations = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.privatePoolV1Config = Input.empty();
        this.project = Input.empty();
        this.validateOnly = Input.empty();
        this.workerPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> annotations;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<PrivatePoolV1ConfigArgs> privatePoolV1Config;
        private @Nullable Input<String> project;
        private @Nullable Input<String> validateOnly;
        private Input<String> workerPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.privatePoolV1Config = defaults.privatePoolV1Config;
    	      this.project = defaults.project;
    	      this.validateOnly = defaults.validateOnly;
    	      this.workerPoolId = defaults.workerPoolId;
        }

        public Builder setAnnotations(@Nullable Input<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable Map<String,String> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPrivatePoolV1Config(@Nullable Input<PrivatePoolV1ConfigArgs> privatePoolV1Config) {
            this.privatePoolV1Config = privatePoolV1Config;
            return this;
        }

        public Builder setPrivatePoolV1Config(@Nullable PrivatePoolV1ConfigArgs privatePoolV1Config) {
            this.privatePoolV1Config = Input.ofNullable(privatePoolV1Config);
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

        public Builder setValidateOnly(@Nullable Input<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder setValidateOnly(@Nullable String validateOnly) {
            this.validateOnly = Input.ofNullable(validateOnly);
            return this;
        }

        public Builder setWorkerPoolId(Input<String> workerPoolId) {
            this.workerPoolId = Objects.requireNonNull(workerPoolId);
            return this;
        }

        public Builder setWorkerPoolId(String workerPoolId) {
            this.workerPoolId = Input.of(Objects.requireNonNull(workerPoolId));
            return this;
        }
        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(annotations, displayName, location, privatePoolV1Config, project, validateOnly, workerPoolId);
        }
    }
}
