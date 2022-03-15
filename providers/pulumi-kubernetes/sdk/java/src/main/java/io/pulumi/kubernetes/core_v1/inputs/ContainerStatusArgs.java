// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerStatus contains details for the current status of this container.
 * 
 */
public final class ContainerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStatusArgs Empty = new ContainerStatusArgs();

    /**
     * Container's ID in the format 'docker://<container_id>'.
     * 
     */
    @Import(name="containerID")
      private final @Nullable Output<String> containerID;

    public Output<String> getContainerID() {
        return this.containerID == null ? Output.empty() : this.containerID;
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * ImageID of the container's image.
     * 
     */
    @Import(name="imageID", required=true)
      private final Output<String> imageID;

    public Output<String> getImageID() {
        return this.imageID;
    }

    /**
     * Details about the container's last termination condition.
     * 
     */
    @Import(name="lastState")
      private final @Nullable Output<ContainerStateArgs> lastState;

    public Output<ContainerStateArgs> getLastState() {
        return this.lastState == null ? Output.empty() : this.lastState;
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     * 
     */
    @Import(name="ready", required=true)
      private final Output<Boolean> ready;

    public Output<Boolean> getReady() {
        return this.ready;
    }

    /**
     * The number of times the container has been restarted.
     * 
     */
    @Import(name="restartCount", required=true)
      private final Output<Integer> restartCount;

    public Output<Integer> getRestartCount() {
        return this.restartCount;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @Import(name="started")
      private final @Nullable Output<Boolean> started;

    public Output<Boolean> getStarted() {
        return this.started == null ? Output.empty() : this.started;
    }

    /**
     * Details about the container's current condition.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<ContainerStateArgs> state;

    public Output<ContainerStateArgs> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public ContainerStatusArgs(
        @Nullable Output<String> containerID,
        Output<String> image,
        Output<String> imageID,
        @Nullable Output<ContainerStateArgs> lastState,
        Output<String> name,
        Output<Boolean> ready,
        Output<Integer> restartCount,
        @Nullable Output<Boolean> started,
        @Nullable Output<ContainerStateArgs> state) {
        this.containerID = containerID;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imageID = Objects.requireNonNull(imageID, "expected parameter 'imageID' to be non-null");
        this.lastState = lastState;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ready = Objects.requireNonNull(ready, "expected parameter 'ready' to be non-null");
        this.restartCount = Objects.requireNonNull(restartCount, "expected parameter 'restartCount' to be non-null");
        this.started = started;
        this.state = state;
    }

    private ContainerStatusArgs() {
        this.containerID = Output.empty();
        this.image = Output.empty();
        this.imageID = Output.empty();
        this.lastState = Output.empty();
        this.name = Output.empty();
        this.ready = Output.empty();
        this.restartCount = Output.empty();
        this.started = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerID;
        private Output<String> image;
        private Output<String> imageID;
        private @Nullable Output<ContainerStateArgs> lastState;
        private Output<String> name;
        private Output<Boolean> ready;
        private Output<Integer> restartCount;
        private @Nullable Output<Boolean> started;
        private @Nullable Output<ContainerStateArgs> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerID = defaults.containerID;
    	      this.image = defaults.image;
    	      this.imageID = defaults.imageID;
    	      this.lastState = defaults.lastState;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.restartCount = defaults.restartCount;
    	      this.started = defaults.started;
    	      this.state = defaults.state;
        }

        public Builder containerID(@Nullable Output<String> containerID) {
            this.containerID = containerID;
            return this;
        }

        public Builder containerID(@Nullable String containerID) {
            this.containerID = Output.ofNullable(containerID);
            return this;
        }

        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder imageID(Output<String> imageID) {
            this.imageID = Objects.requireNonNull(imageID);
            return this;
        }

        public Builder imageID(String imageID) {
            this.imageID = Output.of(Objects.requireNonNull(imageID));
            return this;
        }

        public Builder lastState(@Nullable Output<ContainerStateArgs> lastState) {
            this.lastState = lastState;
            return this;
        }

        public Builder lastState(@Nullable ContainerStateArgs lastState) {
            this.lastState = Output.ofNullable(lastState);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder ready(Output<Boolean> ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }

        public Builder ready(Boolean ready) {
            this.ready = Output.of(Objects.requireNonNull(ready));
            return this;
        }

        public Builder restartCount(Output<Integer> restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }

        public Builder restartCount(Integer restartCount) {
            this.restartCount = Output.of(Objects.requireNonNull(restartCount));
            return this;
        }

        public Builder started(@Nullable Output<Boolean> started) {
            this.started = started;
            return this;
        }

        public Builder started(@Nullable Boolean started) {
            this.started = Output.ofNullable(started);
            return this;
        }

        public Builder state(@Nullable Output<ContainerStateArgs> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable ContainerStateArgs state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public ContainerStatusArgs build() {
            return new ContainerStatusArgs(containerID, image, imageID, lastState, name, ready, restartCount, started, state);
        }
    }
}
