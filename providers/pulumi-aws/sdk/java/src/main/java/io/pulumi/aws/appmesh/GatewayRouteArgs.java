// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteArgs Empty = new GatewayRouteArgs();

    /**
     * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
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
     * The name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The gateway route specification to apply.
     * 
     */
    @InputImport(name="spec", required=true)
    private final Input<GatewayRouteSpecArgs> spec;

    public Input<GatewayRouteSpecArgs> getSpec() {
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
     * The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualGatewayName", required=true)
    private final Input<String> virtualGatewayName;

    public Input<String> getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    public GatewayRouteArgs(
        Input<String> meshName,
        @Nullable Input<String> meshOwner,
        @Nullable Input<String> name,
        Input<GatewayRouteSpecArgs> spec,
        @Nullable Input<Map<String,String>> tags,
        Input<String> virtualGatewayName) {
        this.meshName = Objects.requireNonNull(meshName, "expected parameter 'meshName' to be non-null");
        this.meshOwner = meshOwner;
        this.name = name;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.tags = tags;
        this.virtualGatewayName = Objects.requireNonNull(virtualGatewayName, "expected parameter 'virtualGatewayName' to be non-null");
    }

    private GatewayRouteArgs() {
        this.meshName = Input.empty();
        this.meshOwner = Input.empty();
        this.name = Input.empty();
        this.spec = Input.empty();
        this.tags = Input.empty();
        this.virtualGatewayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> meshName;
        private @Nullable Input<String> meshOwner;
        private @Nullable Input<String> name;
        private Input<GatewayRouteSpecArgs> spec;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> virtualGatewayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
    	      this.virtualGatewayName = defaults.virtualGatewayName;
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

        public Builder setSpec(Input<GatewayRouteSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setSpec(GatewayRouteSpecArgs spec) {
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

        public Builder setVirtualGatewayName(Input<String> virtualGatewayName) {
            this.virtualGatewayName = Objects.requireNonNull(virtualGatewayName);
            return this;
        }

        public Builder setVirtualGatewayName(String virtualGatewayName) {
            this.virtualGatewayName = Input.of(Objects.requireNonNull(virtualGatewayName));
            return this;
        }
        public GatewayRouteArgs build() {
            return new GatewayRouteArgs(meshName, meshOwner, name, spec, tags, virtualGatewayName);
        }
    }
}