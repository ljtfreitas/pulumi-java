// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.AssessmentPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssessmentResult {
    /**
     * For optimistic concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Path reference to this assessment. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/groups/{groupName}/assessment/{assessmentName}
     * 
     */
    private final String id;
    /**
     * Unique name of an assessment.
     * 
     */
    private final String name;
    /**
     * Properties of the assessment.
     * 
     */
    private final AssessmentPropertiesResponse properties;
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/groups/assessments].
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","name","properties","type"})
    private GetAssessmentResult(
        @Nullable String eTag,
        String id,
        String name,
        AssessmentPropertiesResponse properties,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * For optimistic concurrency control.
     * 
     */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Path reference to this assessment. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/groups/{groupName}/assessment/{assessmentName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Unique name of an assessment.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the assessment.
     * 
     */
    public AssessmentPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/groups/assessments].
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private String name;
        private AssessmentPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(AssessmentPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAssessmentResult build() {
            return new GetAssessmentResult(eTag, id, name, properties, type);
        }
    }
}
