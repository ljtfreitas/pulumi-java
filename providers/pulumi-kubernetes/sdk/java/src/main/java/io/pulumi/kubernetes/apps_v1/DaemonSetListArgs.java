// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apps_v1.inputs.DaemonSetArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DaemonSetListArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetListArgs Empty = new DaemonSetListArgs();

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
     * A list of daemon sets.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<DaemonSetArgs>> items;

    public Output<List<DaemonSetArgs>> getItems() {
        return this.items;
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
      private final @Nullable Output<ListMetaArgs> metadata;

    public Output<ListMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    public DaemonSetListArgs(
        @Nullable Output<String> apiVersion,
        Output<List<DaemonSetArgs>> items,
        @Nullable Output<String> kind,
        @Nullable Output<ListMetaArgs> metadata) {
        this.apiVersion = apiVersion;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
    }

    private DaemonSetListArgs() {
        this.apiVersion = Output.empty();
        this.items = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private Output<List<DaemonSetArgs>> items;
        private @Nullable Output<String> kind;
        private @Nullable Output<ListMetaArgs> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder items(Output<List<DaemonSetArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<DaemonSetArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
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

        public Builder metadata(@Nullable Output<ListMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ListMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public DaemonSetListArgs build() {
            return new DaemonSetListArgs(apiVersion, items, kind, metadata);
        }
    }
}
