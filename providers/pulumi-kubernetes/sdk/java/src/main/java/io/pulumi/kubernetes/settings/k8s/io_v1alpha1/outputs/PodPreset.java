// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.settings.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.settings.k8s.io_v1alpha1.outputs.PodPresetSpec;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodPreset {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable PodPresetSpec spec;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","spec"})
    private PodPreset(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable PodPresetSpec spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<PodPresetSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodPreset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable PodPresetSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PodPreset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable PodPresetSpec spec) {
            this.spec = spec;
            return this;
        }
        public PodPreset build() {
            return new PodPreset(apiVersion, kind, metadata, spec);
        }
    }
}
