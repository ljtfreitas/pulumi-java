// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ContainerResponse;
import io.pulumi.azurenative.web.outputs.DaprResponse;
import io.pulumi.azurenative.web.outputs.ScaleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TemplateResponse {
    /**
     * List of container definitions for the Container App.
     * 
     */
    private final @Nullable List<ContainerResponse> containers;
    /**
     * Dapr configuration for the Container App.
     * 
     */
    private final @Nullable DaprResponse dapr;
    /**
     * User friendly suffix that is appended to the revision name
     * 
     */
    private final @Nullable String revisionSuffix;
    /**
     * Scaling properties for the Container App.
     * 
     */
    private final @Nullable ScaleResponse scale;

    @OutputCustomType.Constructor({"containers","dapr","revisionSuffix","scale"})
    private TemplateResponse(
        @Nullable List<ContainerResponse> containers,
        @Nullable DaprResponse dapr,
        @Nullable String revisionSuffix,
        @Nullable ScaleResponse scale) {
        this.containers = containers;
        this.dapr = dapr;
        this.revisionSuffix = revisionSuffix;
        this.scale = scale;
    }

    /**
     * List of container definitions for the Container App.
     * 
     */
    public List<ContainerResponse> getContainers() {
        return this.containers == null ? List.of() : this.containers;
    }
    /**
     * Dapr configuration for the Container App.
     * 
     */
    public Optional<DaprResponse> getDapr() {
        return Optional.ofNullable(this.dapr);
    }
    /**
     * User friendly suffix that is appended to the revision name
     * 
     */
    public Optional<String> getRevisionSuffix() {
        return Optional.ofNullable(this.revisionSuffix);
    }
    /**
     * Scaling properties for the Container App.
     * 
     */
    public Optional<ScaleResponse> getScale() {
        return Optional.ofNullable(this.scale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerResponse> containers;
        private @Nullable DaprResponse dapr;
        private @Nullable String revisionSuffix;
        private @Nullable ScaleResponse scale;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.dapr = defaults.dapr;
    	      this.revisionSuffix = defaults.revisionSuffix;
    	      this.scale = defaults.scale;
        }

        public Builder setContainers(@Nullable List<ContainerResponse> containers) {
            this.containers = containers;
            return this;
        }

        public Builder setDapr(@Nullable DaprResponse dapr) {
            this.dapr = dapr;
            return this;
        }

        public Builder setRevisionSuffix(@Nullable String revisionSuffix) {
            this.revisionSuffix = revisionSuffix;
            return this;
        }

        public Builder setScale(@Nullable ScaleResponse scale) {
            this.scale = scale;
            return this;
        }

        public TemplateResponse build() {
            return new TemplateResponse(containers, dapr, revisionSuffix, scale);
        }
    }
}
