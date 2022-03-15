// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.authorization.k8s.io_v1.inputs.SubjectAccessReviewSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalSubjectAccessReviewArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalSubjectAccessReviewArgs Empty = new LocalSubjectAccessReviewArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
     * 
     */
    @Import(name="spec", required=true)
      private final Output<SubjectAccessReviewSpecArgs> spec;

    public Output<SubjectAccessReviewSpecArgs> getSpec() {
        return this.spec;
    }

    public LocalSubjectAccessReviewArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<SubjectAccessReviewSpecArgs> spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
    }

    private LocalSubjectAccessReviewArgs() {
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.spec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalSubjectAccessReviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<SubjectAccessReviewSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalSubjectAccessReviewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder spec(Output<SubjectAccessReviewSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder spec(SubjectAccessReviewSpecArgs spec) {
            this.spec = Output.of(Objects.requireNonNull(spec));
            return this;
        }
        public LocalSubjectAccessReviewArgs build() {
            return new LocalSubjectAccessReviewArgs(apiVersion, kind, metadata, spec);
        }
    }
}
