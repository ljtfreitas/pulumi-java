// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container event.
 * 
 */
public final class ContainerEventResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerEventResponse Empty = new ContainerEventResponse();

    /**
     * The count of the event.
     * 
     */
    @InputImport(name="count")
        private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Date/time of the first event.
     * 
     */
    @InputImport(name="firstTimestamp")
        private final @Nullable String firstTimestamp;

    public Optional<String> getFirstTimestamp() {
        return this.firstTimestamp == null ? Optional.empty() : Optional.ofNullable(this.firstTimestamp);
    }

    /**
     * Date/time of the last event.
     * 
     */
    @InputImport(name="lastTimestamp")
        private final @Nullable String lastTimestamp;

    public Optional<String> getLastTimestamp() {
        return this.lastTimestamp == null ? Optional.empty() : Optional.ofNullable(this.lastTimestamp);
    }

    /**
     * The event message
     * 
     */
    @InputImport(name="message")
        private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The name of the container event.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The event type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ContainerEventResponse(
        @Nullable Integer count,
        @Nullable String firstTimestamp,
        @Nullable String lastTimestamp,
        @Nullable String message,
        @Nullable String name,
        @Nullable String type) {
        this.count = count;
        this.firstTimestamp = firstTimestamp;
        this.lastTimestamp = lastTimestamp;
        this.message = message;
        this.name = name;
        this.type = type;
    }

    private ContainerEventResponse() {
        this.count = null;
        this.firstTimestamp = null;
        this.lastTimestamp = null;
        this.message = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String firstTimestamp;
        private @Nullable String lastTimestamp;
        private @Nullable String message;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setFirstTimestamp(@Nullable String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }

        public Builder setLastTimestamp(@Nullable String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ContainerEventResponse build() {
            return new ContainerEventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
