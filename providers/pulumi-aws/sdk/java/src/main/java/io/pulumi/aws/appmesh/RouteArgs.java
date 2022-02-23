// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.appmesh.inputs.RouteSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="meshName", required=true)
    private final Input<String> meshName;

    public Input<String> getMeshName() {
        return this.meshName;
    }

    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @InputImport(name="meshOwner")
    private final @Nullable Input<String> meshOwner;

    public Input<String> getMeshOwner() {
        return this.meshOwner == null ? Input.empty() : this.meshOwner;
    }

    /**
     * The name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The route specification to apply.
     * 
     */
    @InputImport(name="spec", required=true)
    private final Input<RouteSpecArgs> spec;

    public Input<RouteSpecArgs> getSpec() {
        return this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualRouterName", required=true)
    private final Input<String> virtualRouterName;

    public Input<String> getVirtualRouterName() {
        return this.virtualRouterName;
    }

    public RouteArgs(
        Input<String> meshName,
        @Nullable Input<String> meshOwner,
        @Nullable Input<String> name,
        Input<RouteSpecArgs> spec,
        @Nullable Input<Map<String,String>> tags,
        Input<String> virtualRouterName) {
        this.meshName = Objects.requireNonNull(meshName, "expected parameter 'meshName' to be non-null");
        this.meshOwner = meshOwner;
        this.name = name;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.tags = tags;
        this.virtualRouterName = Objects.requireNonNull(virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
    }

    private RouteArgs() {
        this.meshName = Input.empty();
        this.meshOwner = Input.empty();
        this.name = Input.empty();
        this.spec = Input.empty();
        this.tags = Input.empty();
        this.virtualRouterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> meshName;
        private @Nullable Input<String> meshOwner;
        private @Nullable Input<String> name;
        private Input<RouteSpecArgs> spec;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
    	      this.virtualRouterName = defaults.virtualRouterName;
        }

        public Builder setMeshName(Input<String> meshName) {
            this.meshName = Objects.requireNonNull(meshName);
            return this;
        }

        public Builder setMeshName(String meshName) {
            this.meshName = Input.of(Objects.requireNonNull(meshName));
            return this;
        }

        public Builder setMeshOwner(@Nullable Input<String> meshOwner) {
            this.meshOwner = meshOwner;
            return this;
        }

        public Builder setMeshOwner(@Nullable String meshOwner) {
            this.meshOwner = Input.ofNullable(meshOwner);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSpec(Input<RouteSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setSpec(RouteSpecArgs spec) {
            this.spec = Input.of(Objects.requireNonNull(spec));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVirtualRouterName(Input<String> virtualRouterName) {
            this.virtualRouterName = Objects.requireNonNull(virtualRouterName);
            return this;
        }

        public Builder setVirtualRouterName(String virtualRouterName) {
            this.virtualRouterName = Input.of(Objects.requireNonNull(virtualRouterName));
            return this;
        }
        public RouteArgs build() {
            return new RouteArgs(meshName, meshOwner, name, spec, tags, virtualRouterName);
        }
    }
}
