// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ContainerArgs;
import io.pulumi.azurenative.web.inputs.DaprArgs;
import io.pulumi.azurenative.web.inputs.ScaleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App versioned application definition.
 * Defines the desired state of an immutable revision.
 * Any changes to this section Will result in a new revision being created
 * 
 */
public final class TemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    /**
     * List of container definitions for the Container App.
     * 
     */
    @InputImport(name="containers")
        private final @Nullable Input<List<ContainerArgs>> containers;

    public Input<List<ContainerArgs>> getContainers() {
        return this.containers == null ? Input.empty() : this.containers;
    }

    /**
     * Dapr configuration for the Container App.
     * 
     */
    @InputImport(name="dapr")
        private final @Nullable Input<DaprArgs> dapr;

    public Input<DaprArgs> getDapr() {
        return this.dapr == null ? Input.empty() : this.dapr;
    }

    /**
     * User friendly suffix that is appended to the revision name
     * 
     */
    @InputImport(name="revisionSuffix")
        private final @Nullable Input<String> revisionSuffix;

    public Input<String> getRevisionSuffix() {
        return this.revisionSuffix == null ? Input.empty() : this.revisionSuffix;
    }

    /**
     * Scaling properties for the Container App.
     * 
     */
    @InputImport(name="scale")
        private final @Nullable Input<ScaleArgs> scale;

    public Input<ScaleArgs> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    public TemplateArgs(
        @Nullable Input<List<ContainerArgs>> containers,
        @Nullable Input<DaprArgs> dapr,
        @Nullable Input<String> revisionSuffix,
        @Nullable Input<ScaleArgs> scale) {
        this.containers = containers;
        this.dapr = dapr;
        this.revisionSuffix = revisionSuffix;
        this.scale = scale;
    }

    private TemplateArgs() {
        this.containers = Input.empty();
        this.dapr = Input.empty();
        this.revisionSuffix = Input.empty();
        this.scale = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ContainerArgs>> containers;
        private @Nullable Input<DaprArgs> dapr;
        private @Nullable Input<String> revisionSuffix;
        private @Nullable Input<ScaleArgs> scale;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.dapr = defaults.dapr;
    	      this.revisionSuffix = defaults.revisionSuffix;
    	      this.scale = defaults.scale;
        }

        public Builder setContainers(@Nullable Input<List<ContainerArgs>> containers) {
            this.containers = containers;
            return this;
        }

        public Builder setContainers(@Nullable List<ContainerArgs> containers) {
            this.containers = Input.ofNullable(containers);
            return this;
        }

        public Builder setDapr(@Nullable Input<DaprArgs> dapr) {
            this.dapr = dapr;
            return this;
        }

        public Builder setDapr(@Nullable DaprArgs dapr) {
            this.dapr = Input.ofNullable(dapr);
            return this;
        }

        public Builder setRevisionSuffix(@Nullable Input<String> revisionSuffix) {
            this.revisionSuffix = revisionSuffix;
            return this;
        }

        public Builder setRevisionSuffix(@Nullable String revisionSuffix) {
            this.revisionSuffix = Input.ofNullable(revisionSuffix);
            return this;
        }

        public Builder setScale(@Nullable Input<ScaleArgs> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable ScaleArgs scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }
        public TemplateArgs build() {
            return new TemplateArgs(containers, dapr, revisionSuffix, scale);
        }
    }
}
