// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.azurenative.cache.outputs.ScheduleEntryResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPatchScheduleResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * List of patch schedules for a Redis cache.
     * 
     */
    private final List<ScheduleEntryResponse> scheduleEntries;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPatchScheduleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scheduleEntries") List<ScheduleEntryResponse> scheduleEntries,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.scheduleEntries = scheduleEntries;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of patch schedules for a Redis cache.
     * 
    */
    public List<ScheduleEntryResponse> getScheduleEntries() {
        return this.scheduleEntries;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<ScheduleEntryResponse> scheduleEntries;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scheduleEntries = defaults.scheduleEntries;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder scheduleEntries(List<ScheduleEntryResponse> scheduleEntries) {
            this.scheduleEntries = Objects.requireNonNull(scheduleEntries);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPatchScheduleResult build() {
            return new GetPatchScheduleResult(id, name, scheduleEntries, type);
        }
    }
}
