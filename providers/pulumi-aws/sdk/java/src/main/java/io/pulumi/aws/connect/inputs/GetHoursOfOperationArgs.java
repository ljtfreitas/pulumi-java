// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHoursOfOperationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHoursOfOperationArgs Empty = new GetHoursOfOperationArgs();

    /**
     * Returns information on a specific Hours of Operation by hours of operation id
     * 
     */
    @Import(name="hoursOfOperationId")
      private final @Nullable String hoursOfOperationId;

    public Optional<String> getHoursOfOperationId() {
        return this.hoursOfOperationId == null ? Optional.empty() : Optional.ofNullable(this.hoursOfOperationId);
    }

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Returns information on a specific Hours of Operation by name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A the map of tags to assign to the Hours of Operation.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetHoursOfOperationArgs(
        @Nullable String hoursOfOperationId,
        String instanceId,
        @Nullable String name,
        @Nullable Map<String,String> tags) {
        this.hoursOfOperationId = hoursOfOperationId;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private GetHoursOfOperationArgs() {
        this.hoursOfOperationId = null;
        this.instanceId = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoursOfOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hoursOfOperationId;
        private String instanceId;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoursOfOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder hoursOfOperationId(@Nullable String hoursOfOperationId) {
            this.hoursOfOperationId = hoursOfOperationId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetHoursOfOperationArgs build() {
            return new GetHoursOfOperationArgs(hoursOfOperationId, instanceId, name, tags);
        }
    }
}
