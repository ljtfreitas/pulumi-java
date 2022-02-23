// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v2alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.batch_v1.inputs.JobSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 * 
 */
public final class JobTemplateSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateSpecArgs Empty = new JobTemplateSpecArgs();

    /**
     * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @InputImport(name="spec")
        private final @Nullable Input<JobSpecArgs> spec;

    public Input<JobSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    public JobTemplateSpecArgs(
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<JobSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    private JobTemplateSpecArgs() {
        this.metadata = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<JobSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
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
        public JobTemplateSpecArgs build() {
            return new JobTemplateSpecArgs(metadata, spec);
        }
    }
}
