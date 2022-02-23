// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2;

import com.google.gson.JsonElement;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControllerRevisionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControllerRevisionArgs Empty = new ControllerRevisionArgs();

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
     * Data is the serialized representation of the state.
     * 
     */
    @InputImport(name="data")
        private final @Nullable Input<JsonElement> data;

    public Input<JsonElement> getData() {
        return this.data == null ? Input.empty() : this.data;
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
     * Revision indicates the revision of the state represented by Data.
     * 
     */
    @InputImport(name="revision", required=true)
        private final Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision;
    }

    public ControllerRevisionArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<JsonElement> data,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        Input<Integer> revision) {
        this.apiVersion = apiVersion;
        this.data = data;
        this.kind = kind;
        this.metadata = metadata;
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
    }

    private ControllerRevisionArgs() {
        this.apiVersion = Input.empty();
        this.data = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControllerRevisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<JsonElement> data;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private Input<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ControllerRevisionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.data = defaults.data;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.revision = defaults.revision;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setData(@Nullable Input<JsonElement> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable JsonElement data) {
            this.data = Input.ofNullable(data);
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

        public Builder setRevision(Input<Integer> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Input.of(Objects.requireNonNull(revision));
            return this;
        }
        public ControllerRevisionArgs build() {
            return new ControllerRevisionArgs(apiVersion, data, kind, metadata, revision);
        }
    }
}
