// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerStateRunning is a running state of a container.
 * 
 */
public final class ContainerStateRunningArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateRunningArgs Empty = new ContainerStateRunningArgs();

    /**
     * Time at which the container was last (re-)started
     * 
     */
    @InputImport(name="startedAt")
        private final @Nullable Input<String> startedAt;

    public Input<String> getStartedAt() {
        return this.startedAt == null ? Input.empty() : this.startedAt;
    }

    public ContainerStateRunningArgs(@Nullable Input<String> startedAt) {
        this.startedAt = startedAt;
    }

    private ContainerStateRunningArgs() {
        this.startedAt = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateRunningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> startedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateRunningArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startedAt = defaults.startedAt;
        }

        public Builder setStartedAt(@Nullable Input<String> startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder setStartedAt(@Nullable String startedAt) {
            this.startedAt = Input.ofNullable(startedAt);
            return this;
        }
        public ContainerStateRunningArgs build() {
            return new ContainerStateRunningArgs(startedAt);
        }
    }
}
