// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerEventResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerInstanceViewResponse {
    /**
     * Current container instance state.
     * 
     */
    private final @Nullable ContainerStateResponse currentState;
    /**
     * The events of this container instance.
     * 
     */
    private final @Nullable List<ContainerEventResponse> events;
    /**
     * Previous container instance state.
     * 
     */
    private final @Nullable ContainerStateResponse previousState;
    /**
     * The number of times the container has been restarted.
     * 
     */
    private final @Nullable Integer restartCount;

    @OutputCustomType.Constructor({"currentState","events","previousState","restartCount"})
    private ContainerInstanceViewResponse(
        @Nullable ContainerStateResponse currentState,
        @Nullable List<ContainerEventResponse> events,
        @Nullable ContainerStateResponse previousState,
        @Nullable Integer restartCount) {
        this.currentState = currentState;
        this.events = events;
        this.previousState = previousState;
        this.restartCount = restartCount;
    }

    /**
     * Current container instance state.
     * 
     */
    public Optional<ContainerStateResponse> getCurrentState() {
        return Optional.ofNullable(this.currentState);
    }
    /**
     * The events of this container instance.
     * 
     */
    public List<ContainerEventResponse> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    /**
     * Previous container instance state.
     * 
     */
    public Optional<ContainerStateResponse> getPreviousState() {
        return Optional.ofNullable(this.previousState);
    }
    /**
     * The number of times the container has been restarted.
     * 
     */
    public Optional<Integer> getRestartCount() {
        return Optional.ofNullable(this.restartCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerStateResponse currentState;
        private @Nullable List<ContainerEventResponse> events;
        private @Nullable ContainerStateResponse previousState;
        private @Nullable Integer restartCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentState = defaults.currentState;
    	      this.events = defaults.events;
    	      this.previousState = defaults.previousState;
    	      this.restartCount = defaults.restartCount;
        }

        public Builder setCurrentState(@Nullable ContainerStateResponse currentState) {
            this.currentState = currentState;
            return this;
        }

        public Builder setEvents(@Nullable List<ContainerEventResponse> events) {
            this.events = events;
            return this;
        }

        public Builder setPreviousState(@Nullable ContainerStateResponse previousState) {
            this.previousState = previousState;
            return this;
        }

        public Builder setRestartCount(@Nullable Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        public ContainerInstanceViewResponse build() {
            return new ContainerInstanceViewResponse(currentState, events, previousState, restartCount);
        }
    }
}
