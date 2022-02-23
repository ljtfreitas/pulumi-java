// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.aws.connect.outputs.GetHoursOfOperationConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetHoursOfOperationResult {
    /**
     * Specifies configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below. Config blocks are documented below.
     * 
     */
    private final List<GetHoursOfOperationConfig> configs;
    /**
     * Specifies the description of the Hours of Operation.
     * 
     */
    private final String description;
    /**
     * The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     */
    private final String hoursOfOperationArn;
    /**
     * The identifier for the hours of operation.
     * 
     */
    private final String hoursOfOperationId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    private final String instanceId;
    /**
     * Specifies the name of the Hours of Operation.
     * 
     */
    private final String name;
    /**
     * A the map of tags to assign to the Hours of Operation.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Specifies the time zone of the Hours of Operation.
     * 
     */
    private final String timeZone;

    @OutputCustomType.Constructor({"configs","description","hoursOfOperationArn","hoursOfOperationId","id","instanceId","name","tags","timeZone"})
    private GetHoursOfOperationResult(
        List<GetHoursOfOperationConfig> configs,
        String description,
        String hoursOfOperationArn,
        String hoursOfOperationId,
        String id,
        String instanceId,
        String name,
        Map<String,String> tags,
        String timeZone) {
        this.configs = Objects.requireNonNull(configs);
        this.description = Objects.requireNonNull(description);
        this.hoursOfOperationArn = Objects.requireNonNull(hoursOfOperationArn);
        this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId);
        this.id = Objects.requireNonNull(id);
        this.instanceId = Objects.requireNonNull(instanceId);
        this.name = Objects.requireNonNull(name);
        this.tags = Objects.requireNonNull(tags);
        this.timeZone = Objects.requireNonNull(timeZone);
    }

    /**
     * Specifies configuration information for the hours of operation: day, start time, and end time . Config blocks are documented below. Config blocks are documented below.
     * 
     */
    public List<GetHoursOfOperationConfig> getConfigs() {
        return this.configs;
    }
    /**
     * Specifies the description of the Hours of Operation.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The Amazon Resource Name (ARN) of the Hours of Operation.
     * 
     */
    public String getHoursOfOperationArn() {
        return this.hoursOfOperationArn;
    }
    /**
     * The identifier for the hours of operation.
     * 
     */
    public String getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Hours of Operation.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A the map of tags to assign to the Hours of Operation.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Specifies the time zone of the Hours of Operation.
     * 
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoursOfOperationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetHoursOfOperationConfig> configs;
        private String description;
        private String hoursOfOperationArn;
        private String hoursOfOperationId;
        private String id;
        private String instanceId;
        private String name;
        private Map<String,String> tags;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoursOfOperationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.description = defaults.description;
    	      this.hoursOfOperationArn = defaults.hoursOfOperationArn;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setConfigs(List<GetHoursOfOperationConfig> configs) {
            this.configs = Objects.requireNonNull(configs);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHoursOfOperationArn(String hoursOfOperationArn) {
            this.hoursOfOperationArn = Objects.requireNonNull(hoursOfOperationArn);
            return this;
        }

        public Builder setHoursOfOperationId(String hoursOfOperationId) {
            this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public GetHoursOfOperationResult build() {
            return new GetHoursOfOperationResult(configs, description, hoursOfOperationArn, hoursOfOperationId, id, instanceId, name, tags, timeZone);
        }
    }
}