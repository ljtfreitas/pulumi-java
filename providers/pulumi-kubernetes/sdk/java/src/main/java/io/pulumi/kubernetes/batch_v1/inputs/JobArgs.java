// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.batch_v1.inputs.JobSpecArgs;
import io.pulumi.kubernetes.batch_v1.inputs.JobStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Job represents the configuration of a single job.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The Job's '.status.startTime' is set, which indicates that the Job has started running.
 * 2. The Job's '.status.conditions' has a status of type 'Complete', and a 'status' set
 *    to 'True'.
 * 3. The Job's '.status.conditions' do not have a status of type 'Failed', with a
 *     'status' set to 'True'. If this condition is set, we should fail the Job immediately.
 * 
 * If the Job has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 * By default, if a resource failed to become ready in a previous update,
 * Pulumi will continue to wait for readiness on the next update. If you would prefer
 * to schedule a replacement for an unready resource on the next update, you can add the
 * "pulumi.com/replaceUnready": "true" annotation to the resource definition.
 * 
 */
public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
        private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @InputImport(name="spec")
        private final @Nullable Input<JobSpecArgs> spec;

    public Input<JobSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * Current status of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @InputImport(name="status")
        private final @Nullable Input<JobStatusArgs> status;

    public Input<JobStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public JobArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<JobSpecArgs> spec,
        @Nullable Input<JobStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private JobArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<JobSpecArgs> spec;
        private @Nullable Input<JobStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(@Nullable Input<JobSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable JobSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStatus(@Nullable Input<JobStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable JobStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public JobArgs build() {
            return new JobArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
