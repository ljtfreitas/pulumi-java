// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.JobScheduleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobResult {
    /**
     * User-defined description of the job.
     * 
     */
    private final @Nullable String description;
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
     * Schedule properties of the job.
     * 
     */
    private final @Nullable JobScheduleResponse schedule;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The job version number.
     * 
     */
    private final Integer version;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedule") @Nullable JobScheduleResponse schedule,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") Integer version) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.type = type;
        this.version = version;
    }

    /**
     * User-defined description of the job.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
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
     * Schedule properties of the job.
     * 
    */
    public Optional<JobScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The job version number.
     * 
    */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable JobScheduleResponse schedule;
        private String type;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder schedule(@Nullable JobScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetJobResult build() {
            return new GetJobResult(description, id, name, schedule, type, version);
        }
    }
}
