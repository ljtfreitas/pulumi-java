// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ScheduleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schedules applicable to a virtual machine. The schedules may have been defined on a VM or on lab level.
 * 
 */
public final class ApplicableScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicableScheduleResponse Empty = new ApplicableScheduleResponse();

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The auto-shutdown schedule, if one has been set at the lab or lab resource level.
     * 
     */
    @Import(name="labVmsShutdown")
      private final @Nullable ScheduleResponse labVmsShutdown;

    public Optional<ScheduleResponse> getLabVmsShutdown() {
        return this.labVmsShutdown == null ? Optional.empty() : Optional.ofNullable(this.labVmsShutdown);
    }

    /**
     * The auto-startup schedule, if one has been set at the lab or lab resource level.
     * 
     */
    @Import(name="labVmsStartup")
      private final @Nullable ScheduleResponse labVmsStartup;

    public Optional<ScheduleResponse> getLabVmsStartup() {
        return this.labVmsStartup == null ? Optional.empty() : Optional.ofNullable(this.labVmsStartup);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicableScheduleResponse(
        String id,
        @Nullable ScheduleResponse labVmsShutdown,
        @Nullable ScheduleResponse labVmsStartup,
        @Nullable String location,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.labVmsShutdown = labVmsShutdown;
        this.labVmsStartup = labVmsStartup;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicableScheduleResponse() {
        this.id = null;
        this.labVmsShutdown = null;
        this.labVmsStartup = null;
        this.location = null;
        this.name = null;
        this.tags = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicableScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ScheduleResponse labVmsShutdown;
        private @Nullable ScheduleResponse labVmsStartup;
        private @Nullable String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicableScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labVmsShutdown = defaults.labVmsShutdown;
    	      this.labVmsStartup = defaults.labVmsStartup;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder labVmsShutdown(@Nullable ScheduleResponse labVmsShutdown) {
            this.labVmsShutdown = labVmsShutdown;
            return this;
        }

        public Builder labVmsStartup(@Nullable ScheduleResponse labVmsStartup) {
            this.labVmsStartup = labVmsStartup;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicableScheduleResponse build() {
            return new ApplicableScheduleResponse(id, labVmsShutdown, labVmsStartup, location, name, tags, type);
        }
    }
}
