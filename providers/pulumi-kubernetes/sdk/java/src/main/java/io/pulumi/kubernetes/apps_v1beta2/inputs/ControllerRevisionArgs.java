// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import com.google.gson.JsonElement;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 * 
 */
public final class ControllerRevisionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControllerRevisionArgs Empty = new ControllerRevisionArgs();

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
     * Data is the serialized representation of the state.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<JsonElement> data;

    public Output<JsonElement> getData() {
        return this.data == null ? Output.empty() : this.data;
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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Revision indicates the revision of the state represented by Data.
     * 
     */
    @Import(name="revision", required=true)
      private final Output<Integer> revision;

    public Output<Integer> getRevision() {
        return this.revision;
    }

    public ControllerRevisionArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<JsonElement> data,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<Integer> revision) {
        this.apiVersion = apiVersion;
        this.data = data;
        this.kind = kind;
        this.metadata = metadata;
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
    }

    private ControllerRevisionArgs() {
        this.apiVersion = Output.empty();
        this.data = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.revision = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControllerRevisionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<JsonElement> data;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<Integer> revision;

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

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder data(@Nullable Output<JsonElement> data) {
            this.data = data;
            return this;
        }

        public Builder data(@Nullable JsonElement data) {
            this.data = Output.ofNullable(data);
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

        public Builder revision(Output<Integer> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder revision(Integer revision) {
            this.revision = Output.of(Objects.requireNonNull(revision));
            return this;
        }
        public ControllerRevisionArgs build() {
            return new ControllerRevisionArgs(apiVersion, data, kind, metadata, revision);
        }
    }
}
