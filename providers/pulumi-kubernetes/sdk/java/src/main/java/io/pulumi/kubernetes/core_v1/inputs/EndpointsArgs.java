// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.EndpointSubsetArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Endpoints is a collection of endpoints that implement the actual service. Example:
 *   Name: "mysvc",
 *   Subsets: [
 *     {
 *       Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 *       Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 *     },
 *     {
 *       Addresses: [{"ip": "10.10.3.3"}],
 *       Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
 *     },
 *  ]
 * 
 */
public final class EndpointsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointsArgs Empty = new EndpointsArgs();

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
     * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
     * 
     */
    @InputImport(name="subsets")
        private final @Nullable Input<List<EndpointSubsetArgs>> subsets;

    public Input<List<EndpointSubsetArgs>> getSubsets() {
        return this.subsets == null ? Input.empty() : this.subsets;
    }

    public EndpointsArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<List<EndpointSubsetArgs>> subsets) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.subsets = subsets;
    }

    private EndpointsArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.subsets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<List<EndpointSubsetArgs>> subsets;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.subsets = defaults.subsets;
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

        public Builder setSubsets(@Nullable Input<List<EndpointSubsetArgs>> subsets) {
            this.subsets = subsets;
            return this;
        }

        public Builder setSubsets(@Nullable List<EndpointSubsetArgs> subsets) {
            this.subsets = Input.ofNullable(subsets);
            return this;
        }
        public EndpointsArgs build() {
            return new EndpointsArgs(apiVersion, kind, metadata, subsets);
        }
    }
}
