// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.batch_v1.outputs.JobSpec;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateSpec {
    /**
     * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    private final @Nullable JobSpec spec;

    @CustomType.Constructor
    private JobTemplateSpec(
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("spec") @Nullable JobSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    /**
     * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
    */
    public Optional<JobSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectMeta metadata;
        private @Nullable JobSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder spec(@Nullable JobSpec spec) {
            this.spec = spec;
            return this;
        }
        public JobTemplateSpec build() {
            return new JobTemplateSpec(metadata, spec);
        }
    }
}
