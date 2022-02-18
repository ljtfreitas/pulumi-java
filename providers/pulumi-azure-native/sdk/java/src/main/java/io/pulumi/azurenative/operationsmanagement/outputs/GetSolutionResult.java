// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.outputs;

import io.pulumi.azurenative.operationsmanagement.outputs.SolutionPlanResponse;
import io.pulumi.azurenative.operationsmanagement.outputs.SolutionPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSolutionResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Plan for solution object supported by the OperationsManagement resource provider.
     * 
     */
    private final @Nullable SolutionPlanResponse plan;
    /**
     * Properties for solution object supported by the OperationsManagement resource provider.
     * 
     */
    private final SolutionPropertiesResponse properties;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","plan","properties","tags","type"})
    private GetSolutionResult(
        String id,
        @Nullable String location,
        String name,
        @Nullable SolutionPlanResponse plan,
        SolutionPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.plan = plan;
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Plan for solution object supported by the OperationsManagement resource provider.
     * 
     */
    public Optional<SolutionPlanResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * Properties for solution object supported by the OperationsManagement resource provider.
     * 
     */
    public SolutionPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetSolutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable SolutionPlanResponse plan;
        private SolutionPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(@Nullable SolutionPlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder setProperties(SolutionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSolutionResult build() {
            return new GetSolutionResult(id, location, name, plan, properties, tags, type);
        }
    }
}
