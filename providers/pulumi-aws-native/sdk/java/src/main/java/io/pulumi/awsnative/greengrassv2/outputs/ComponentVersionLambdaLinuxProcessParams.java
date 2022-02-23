// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaLinuxProcessParamsIsolationMode;
import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaContainerParams;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentVersionLambdaLinuxProcessParams {
    private final @Nullable ComponentVersionLambdaContainerParams containerParams;
    private final @Nullable ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode;

    @OutputCustomType.Constructor({"containerParams","isolationMode"})
    private ComponentVersionLambdaLinuxProcessParams(
        @Nullable ComponentVersionLambdaContainerParams containerParams,
        @Nullable ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode) {
        this.containerParams = containerParams;
        this.isolationMode = isolationMode;
    }

    public Optional<ComponentVersionLambdaContainerParams> getContainerParams() {
        return Optional.ofNullable(this.containerParams);
    }
    public Optional<ComponentVersionLambdaLinuxProcessParamsIsolationMode> getIsolationMode() {
        return Optional.ofNullable(this.isolationMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaLinuxProcessParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ComponentVersionLambdaContainerParams containerParams;
        private @Nullable ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaLinuxProcessParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerParams = defaults.containerParams;
    	      this.isolationMode = defaults.isolationMode;
        }

        public Builder setContainerParams(@Nullable ComponentVersionLambdaContainerParams containerParams) {
            this.containerParams = containerParams;
            return this;
        }

        public Builder setIsolationMode(@Nullable ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode) {
            this.isolationMode = isolationMode;
            return this;
        }
        public ComponentVersionLambdaLinuxProcessParams build() {
            return new ComponentVersionLambdaLinuxProcessParams(containerParams, isolationMode);
        }
    }
}
